object RationalNumbers  extends App{
  class Rational(x : Int,y : Int)
  {
    val number: Int = x/gcd(x,y).abs
    val denom: Int =y/gcd(x,y).abs
    def this(x: Int) = this(x, 1)
    private def gcd(a : Int ,b : Int): Int = if (b == 0) a else gcd(b,a%b)
    def neg = new Rational(-x,y)
    def add(r : Rational) =
      new Rational (number * r.denom + r.number * denom,r.denom*denom )
    def sub(r : Rational): Rational =
      add(r.neg)
    def - (r : Rational): Rational =
      sub(r)
    def print : Unit = println(number + "/" + denom)
  }

  var x : Rational = new Rational(3,4)
  var y : Rational = new Rational(5,8)
  var z : Rational = new Rational(2,7)
  var answer : Rational =x-y-z
  answer.print

}