/*
Kiritilgan 0 dan 5 gacha sonlarni mos belgilar bilan, qolgan barcha qiymatlari z harfi bilan
almashtiruvchi dastur tuzilsin
*/
import scala.io.StdIn._
object solve2 {
    def main(args: Array[String]){
        val result = readInt()
        result match {
            case 0 => println(result.toChar)
            case 1 => println(result.toChar)
            case 2 => println(result.toChar)
            case 3 => println(result.toChar)
            case 4 => println(result.toChar)
            case 5 => println(result.toChar)
            case _ => println("z")
        }
        
    }
}