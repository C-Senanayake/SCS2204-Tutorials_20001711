object Main extends App {
    def interest(amount:Double):Double=amount match{
        case x if x< 20000 => x*0.02
        case x if x< 200000 => x*0.04
        case x if x< 2000000 => x*0.035
        case x if x>=2000000 => x*0.065
    }
    println("Interest for a year for Rs.10000: Rs. "+interest(10000))
    println("Interest for a year for Rs.100000: Rs. "+interest(100000))
    println("Interest for a year for Rs.1000000: Rs. "+interest(1000000))
    println("Interest for a year for Rs.10000: Rs. "+interest(10000000))
}