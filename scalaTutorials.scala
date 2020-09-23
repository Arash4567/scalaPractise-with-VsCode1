import scala.io.StdIn._

object scalaTutorials {
  object Math {
    def divide(x: Int, y: Int) = x / y
  }
  def add(x: Int, y: Int): Int = {
    return x + y
  }
  def main(args: Array[String]) {
    // var x = 0
    // while (x < 10) {
    //   x += 1
    //   println(x)
    // }
    // for (i <- 1 to 5){
    //     println(i)
    // }
    // for (i <- 1 until 5){
    //     println(i)
    // }
    // for (i<- 1.to(5)){
    //     println(i)
    // }
    // for (i <- 1 to 9; j <- 1 to 9){
    //     if (i == j) println(i,j)
    // }
    // var lst = List(1, 5, 6, 232, 8, 6487, 9)
    // for (i <- lst) {
    //   println(i)
    // }
    // for (i <- lst; if i < 6) {
    //   println(i)
    // }
    // val result = for (i <- lst; if i < 6) yield {
    //   i * i * i
    // }
    // println(result)
    // var age = 12
    // age match {
    //   case 12 => println("yes")
    //   case 13 => println("no")

    //   case _ => println("default")
    // }
    // val result = age match {
    //   case 12 => "yes"
    //   case 13 => "no"

    //   case _ => "default"
    // }
    // println(result)
    // val num = 7
    // num match {
    //   case 1|3|5|7|9 => println("odd")
    //   case 2|4|6|8 => println("even")
    // }
    // println(add(2, 4))
    // println(Math.divide(4, 2))
  }
}
