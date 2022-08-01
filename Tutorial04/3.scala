object Main extends App {
    def toUpper(input:String):String=input.toUpperCase()

    def toLower(input:String):String=input.toLowerCase()

    def formatNames(text:String,index:Int,func:(String)=>String):String={
        var temp=""
        var a:Int =0
        if(index==0 || index > text.length()){
            return "Error, specified letter is not in the word \" "+text+" \""
        }
        while(a<text.length()){
            if(a==index-1){
                temp=temp+func(text.charAt(index-1).toString())
            }
            else{
                temp=temp+text.charAt(a)
            }
            a=a+1
        }
        return temp

    }

    println(toUpper("Benny"))
    println(toLower("Saman"))
    println(formatNames("Niroshan",2,toUpper))
    println(formatNames("Kumara",1,toLower))
    println(formatNames("Kumara",2,toUpper))
    println(formatNames("Kumara",3,toUpper))
    println(formatNames("Kumara",4,toUpper))
    println(formatNames("Kumara",5,toUpper))
    println(formatNames("Kumara",6,toUpper))
    println(formatNames("Kumara",0,toUpper))
    println(formatNames("Kumara",7,toUpper))

}