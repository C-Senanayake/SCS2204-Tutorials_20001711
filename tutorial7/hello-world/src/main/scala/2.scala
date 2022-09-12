object Main extends App {
  class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int =if (b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    
    def numer = if(g<0) x/(-g) else x/g
    def denom = if(g<0) y/(-g) else y/g

    def this(x: Int) = this(x, 1)
    require(y > 0, "denominator must be positive")
    
    def +(r:Rational) = new Rational(this.numer *r.denom +r.numer * this.denom,     denom * r.denom)
    def neg = new Rational(-this.numer,this.denom)
    def sub(r:Rational) = this+r.neg

    override def toString = numer + "/" + denom
    }

    var x=new Rational(2,4)
    var y=new Rational(2,3)
    var z=new Rational(1,3)

    println(x.toString())
    println(y.toString())
    println(z.toString())
    println(x.toString()+" + "+y.toString()+" = "+(x+y).toString)
    println(x.toString()+" - "+y.toString()+" - "+z.toString()+" = "+(x.sub(y.sub(z))).toString)




}
