object Main extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E=(c:Char,key:Int,a:String)=>
  a((a.indexOf(c.toUpper)+key)%a.size)

  val D=(c:Char,key:Int,a:String)=>
  a((a.indexOf(c.toUpper)-key)%a.size)

  val cipher=(algo:(Char,Int,String)=>
  Char,s:String,key:Int,a:String)=>
  s.map(algo(_,key,a))

  
  val tE=cipher(E,"CHAMATH",2,alphabet)
  val tD=cipher(D,tE,2,alphabet)
  println(tE)
  println(tD)
  

}