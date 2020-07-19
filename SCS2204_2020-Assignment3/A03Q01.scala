object question1 extends App
{
  def gcd(number1 : Int,number2 :Int ):Int = number2 match{
    case 0 => number1
    case x if x > number1 => gcd(x,number1)
    case _ => gcd(number2,number1 % number2)
  }
  def prime(number : Int , div : Int = 2): Boolean = div match{
    case x if(number ==  div) => true
    case x if gcd(number,div) > 1 => false
    case _ => prime(number,div+1)
  }
  println("13 is a prime :"+prime(13))
  println("9 is a prime :" +prime(9))
  println("5 is a prime :"+prime(5))
  println("10 is a prime :"+prime(10))
}