fun main(args: Array<String>) {

    val c = 3
    var sum: Long = 0
    for(i in 1..c)
    {
      sum = sum + Fact(i)
    }
    println("$sum")
}

fun Fact(a: Int): Long{
  var prod: Long = 1;
  for(i in 1..a)
  {
    prod=prod*i.toLong()
  }
  return prod
}