package problems

/**
 *  Euler problem #2
 *  Find the sum of Fibonacci numbers whose values do not exceed 4 million.
 */

object Euler2 extends App {
  def nextF(x: Int, y: Int): Stream[Int] = {
    x #:: nextF(y, x + y)
  }
	
  def fib = nextF(1, 2)	
  
  val fibSum = fib.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  println(fibSum)
}