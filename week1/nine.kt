fun main(args: Array<String>) {

    val c = 10
    var sum: Long = 0
    for(i in 1..c)
    {
     if(i%2 == 0)
     {
       sum+=i
     }
    }
    println("$sum")
}