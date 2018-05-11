package tutorial.ooo

/**
  * @author Allan Tejano
  *         5/11/2018
  */
class Point(val x:Int, val y:Int) {
  var xc = x
  var yc = y

  def move(dx:Int, dy:Int): Unit ={
    xc = x + dx
    yc = y + dy
    println("New Point x:" + xc)
    println("New Point y:" + yc)
  }
}
