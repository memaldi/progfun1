package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def pascalr(a: Int, b: Int): Int = {
        if (a < 0 || a > b) {
          return 0
        } else if (a == 0) {
          return 1
        }
        val num1: Int = pascalr(a-1, b-1)
        val num2: Int = pascalr(a, b-1)
        return num1 + num2
      }
      val num1: Int = pascalr(c-1, r-1)
      val num2: Int = pascalr(c, r-1)
      return num1 + num2
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = ???
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
