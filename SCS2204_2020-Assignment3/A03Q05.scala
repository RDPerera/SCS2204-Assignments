object question5 extends App
{
  def isEven (n : Int ) : Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n: Int) : Boolean = !(isEven(n))

  def evenAddition(n :Int ) : Int = n match {
    case 0 => 0
    case x if(isEven(x)) => n + evenAddition(x-1)
    case x if(isOdd(x)) => evenAddition(x-1)
  }
  print(evenAddition(10))
}