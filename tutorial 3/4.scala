object Main extends App {
  def CoverPrice(x:Int)=x*24.95;
  def Discount(x:Double)=x * 0.4;
  def ShippingCost(x:Int)= x>=50 match{
    case true => x*3 + (x-50)*0.75;
    case false => x*3;
  }
  // println(CoverPrice(60));
  // println(Discount(CoverPrice(60)));
  // println(ShippingCost(60));
  def TotalCost(x:Int)=CoverPrice(x)+ShippingCost(x)-Discount(CoverPrice(x));
  println("Total cost for 60 books : "+ TotalCost(60));
}