object question3 extends App
{
  def addition(n :Int ) : Int = n match {
    case 0 => 0
    case _ => n + addition(n-1)
  }
  print(addition(5))
}