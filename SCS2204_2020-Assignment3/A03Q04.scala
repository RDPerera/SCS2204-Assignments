object question4 extends App
{
  def isEven (n : Int ) : Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n: Int) : Boolean = !(isEven(n))

  println("10 is even :"+isEven(10))
  println("15 is even :"+isEven(15))
}