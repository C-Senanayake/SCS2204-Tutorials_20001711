object Main extends App {
  def Easy(x:Int)=x*8;
  def Tempo(x:Int)=x*7;
  println("Total time for running 2km in Easy, 3km in Tempo and again 2km in Easy paces:"+(Easy(2)+Tempo(3)+Easy(2)));
}