case class Point(x : Int , y : Int)
{

  // add(+) should add two given points
  def + ( that : Point)  = Point(this.x +that.x , this.y + that.y)
  // move should move a point by a given distance dx and dy
  def move ( dx : Int , dy : Int) = Point(this.x + dx , this.y + dy)
  // distance should return the distance between two given points
  def distance ( a : Point): Double = scala.math.sqrt((scala.math.pow((a.x - this.x),2) + scala.math.pow((a.y - this.y),2) ))
  // invert should switch the x and y coordinates.
  def invert()  = Point(this.y , this.x)


}
object case_class extends App {

  val X = Point(10,20)
  val Y = Point(100,200)

  val sum = X + Y;
  val move = X.move(10,10)
  val invertX =  X.invert()
  val disXY = X.distance(Y)

  println("Addition of X and Y  : " + sum )
  println("Move X by 10,10 :" + move)
  println("Distance between X and Y :" +disXY)
  println("Invert of X :" + invertX)



}