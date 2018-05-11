package tutorial

/**
  * @author Allan Tejano
  *         5/11/2018
  */
object ATDemo1 extends App {
  val name: String = "Hellow World"

  println(name)

  val address = "123 Main St"

  println(address)

  val age = 24

  println(age)

  val immutableName = name + " - TGIF"

  println(immutableName)

  val y = squareIt(25)
  println(y)

  println(calcInt(y, squareIt))

  //define functions
  def squareIt(x:Int):Int = {x*x}
  def cubeIt(x:Int):Int = {x*x*x}

  //define function that takes a function
  def calcInt(x: Int, f:Int => Int) ={
    f(x)
  }

  //inline function definition
  val i: Int = calcInt(2, x => x*x)
  println(i)
}
