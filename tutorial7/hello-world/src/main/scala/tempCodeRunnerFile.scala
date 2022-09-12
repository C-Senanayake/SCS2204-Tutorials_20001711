   class Account(id:String,n: Int, b: Double) {
//     val nic:String=id
//     val acnumber: Int = n
//     var balance: Double = b

//     def transfer(a:Account,b:Double)=this.balance= this.balance-b
//     a.balance=a.balance+b

//     override def toString ="["+nic+":"+acnumber +":"+ balance+"]"

//     }
//     var a=new Account("1234v",1234,1000.00)
//     var b=new Account("2345v",2345,2000.40)
//     var c=new Account("3456v",3456,-3000.10)
//     var d=new Account("4567v",4567,4000.25)
//     var e=new Account("5678v",5678,-5000.50)
//     var f=new Account("6789v",6789,6000.00)
    
//     var bank:List[Account]=List(a,b,c,d,e,f)

//     println("Account with negative balance : ")
//     val negativeBalance = (b:List[Account]) => b.filter(x => x.balance < 0)
//     var negativeBalance_list = negativeBalance(bank)
//     negativeBalance_list.foreach(x=>println("["+ x.acnumber+": "+x.balance+"]"))

//     val sum = (b:List[Account]) => b.reduce((x,y)=>new Account("null",11111,x.balance+y.balance))
//     var sumOfBalance = sum(bank)
//     println("\n" + "Sum of all accounts balances : "+ sumOfBalance.balance)

//     println("\nFinal Account balances with interest : ")
//     val interest = (b:List[Account]) => b.map(x=>new Account(x.nic,x.acnumber,(if(x.balance>=0) x.balance*1.05d else x.balance*1.10d)))
//     var interest_list = interest(bank)
//     interest_list.foreach(x=>println("["+x.acnumber+": "+x.balance+"]"))
// }