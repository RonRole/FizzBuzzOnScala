
object FizzBuzzOnScala {
  def main(args: Array[String]): Unit = {
    def fizzBuzzMap(num:Int):String = (num%3, num%5) match {
      case (0,0) => "FizzBuzz"
      case (0,_) => "Fizz"
      case (_,0) => "Buzz"
      case (_,_) => num.toString
    }

    (1 to 30).map(fizzBuzzMap(_)).foreach(println(_))

  }
}

