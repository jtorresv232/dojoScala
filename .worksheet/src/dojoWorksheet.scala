object dojoWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(51); 

	println("Scala worksheet");$skip(28); 
  val lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(27); 
  val set=Set(1,2,2,3,4,5);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(47); 
  val map= Map(1 -> "jonathan", 2 -> "torres");System.out.println("""map  : scala.collection.immutable.Map[Int,String] = """ + $show(map ));$skip(24); val res$0 = 
  
  lista.map{x=> x+2};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(20); val res$1 = 
  
  lista.map{_+3};System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(20); val res$2 = 
  lista.filter{_>2};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(29); val res$3 = 
  lista.map{_+2}.filter{_>4};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(45); 
  
  //cata1
  val lista1 = List.range(1,20);System.out.println("""lista1  : List[Int] = """ + $show(lista1 ));$skip(24); val res$4 = 
  lista1.filter{_%2==0};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(114); 
  
  //cata2
  val megalista = List(List("jonathan","23 years old", "male"),List("nilton","21 years old","male"));System.out.println("""megalista  : List[List[String]] = """ + $show(megalista ));$skip(37); val res$5 = 
  megalista.filter{_(0)=="jonathan"};System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(41); val res$6 = 
  megalista.filter{_.apply(0)=="nilton"};System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(44); 
  
 //cata3
 val numeros = List.range(1,20);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(83); val res$7 = 
 numeros.filter{x=>numeros.filter{y=>y<=Math.sqrt(x)}.filter{z=>x%z==0}.length==1};System.out.println("""res7: List[Int] = """ + $show(res$7))}
 
 
}
