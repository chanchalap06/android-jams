fun main(args: Array<String>) {

    var c = 153
    val temp = c
    var sum = 0
    while(c>0)
    {
      var n = c%10;
      sum = sum + (n*n*n)
      c=c/10
    }
    if (sum==temp)
    println("Armstrong Number")
    else println("Not an armstrong number")
}

