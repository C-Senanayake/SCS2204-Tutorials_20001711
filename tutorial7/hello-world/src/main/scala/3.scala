object Main extends App {
    var bank:List[Account]=List()

    class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b

    def withdraw(x:Double) = if(x<=balance)this.balance = this.balance - x else println("Insufficent balance!")

    def deposit(a:Double) = this.balance = this. balance + a

    def transfer(account:Account, amount:Double) = {
        this.withdraw(amount)
        account.deposit(amount)
    }

    override def toString ="[NIC: "+nic+" : ACCNumber: "+acnumber +" : Balance: "+ balance+"]"



    }
    var x=new Account("1234v",1234,1000)
    var y=new Account("2345v",2345,2000)
    var z=new Account("3456v",3456,3000)

    println(x.toString())
    println(y.toString())
    println(z.toString())
    z.transfer(x,500)
    println("Transfered Rs.1000 from acc:"+z.acnumber+" to acc:"+x.acnumber)
    println(x.toString())
    println(z.toString())






}