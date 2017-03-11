object dojoWorksheet {

	println("Scala worksheet")                //> Scala worksheet
  val lista = List(1,2,3,4)                       //> lista  : List[Int] = List(1, 2, 3, 4)
  val set=Set(1,2,2,3,4,5)                        //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  val map= Map(1 -> "jonathan", 2 -> "torres")    //> map  : scala.collection.immutable.Map[Int,String] = Map(1 -> jonathan, 2 -> 
                                                  //| torres)
  
  lista.map{x=> x+2}                              //> res0: List[Int] = List(3, 4, 5, 6)
  
  lista.map{_+3}                                  //> res1: List[Int] = List(4, 5, 6, 7)
  lista.filter{_>2}                               //> res2: List[Int] = List(3, 4)
  lista.map{_+2}.filter{_>4}                      //> res3: List[Int] = List(5, 6)
  
  //cata1
  val lista1 = List.range(1,20)                   //> lista1  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                                                  //| , 16, 17, 18, 19)
  lista1.filter{_%2==0}                           //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
  
  //cata2
  val megalista = List(List("jonathan","23 years old", "male"),List("nilton","21 years old","male"))
                                                  //> megalista  : List[List[String]] = List(List(jonathan, 23 years old, male), L
                                                  //| ist(nilton, 21 years old, male))
  megalista.filter{_(0)=="jonathan"}              //> res5: List[List[String]] = List(List(jonathan, 23 years old, male))
  megalista.filter{_.apply(0)=="nilton"}          //> res6: List[List[String]] = List(List(nilton, 21 years old, male))
  
 //cata3
 val numeros = List.range(1,20)                   //> numeros  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1
                                                  //| 5, 16, 17, 18, 19)
 numeros.filter{x=>numeros.filter{y=>y<=Math.sqrt(x)}.filter{z=>x%z==0}.length==1}
                                                  //> res7: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)
 
 
}