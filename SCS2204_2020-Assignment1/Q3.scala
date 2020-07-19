object Question3 extends App {
  def bookPrice(copies: Int) : Double = copies*24.95
  def discount(price : Double) : Double = price*40/100
  def shippingCost(copies:Int):Double = {
    if(copies>50) (50*3 + (copies-50)*0.75)
    else 3*copies
  }
  def wholesale(copies : Int) : Double =bookPrice(60)-discount(bookPrice(60))+shippingCost(60)

  print("Total wholesale cost for 60 copies : Rs." + wholesale(60))
}