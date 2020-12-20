fun main() {
  val (a, b, c) = readLine()!!.split(' ')
  println(a.toInt())
  println(b.toInt())
  println(c.toInt())
  if(a==b && b==c)
  {
    println("Equilateral")
  }
  else if (a == b || b == c || c == a) 
  {
    println("Isosceles")
  }
  else println("Scalene")
}