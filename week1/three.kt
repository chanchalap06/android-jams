fun main() {
    var a = -5
    println(absolute(a))
}

fun absolute(a: Int): Int
{
    if(a>0)
      return a
    else 
      return (a*-1)
}