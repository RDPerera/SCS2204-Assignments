object question6 extends App
{
  def fib(n : Int) : Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1)+fib(n-2)
  }
  def fibSeq(n : Int,i : Int = 0) : Unit = {
    print(fib(i)+" ")
    if (n-1 > i) fibSeq(n,i+1)
  }
  fibSeq(10)
}
