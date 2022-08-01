import scala.io.StdIn.readInt
object Main extends App {
    def PatternMatching(number:Int):String = number match{
        case x if x< 0 || x==0 => "Input is less than or equal to 0"
        case x if x%2==0 => "Input is even"
        case x if x%2==1 => "Input is odd"
    }
    println("Enter an integer: ")
    var x=readInt()
    println(PatternMatching(x))
    
}