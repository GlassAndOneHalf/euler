package problems

/**
 *  Euler problem #1
 *  Finding the sum of all multiples of 3 or 5 below 1000.
 */

object Euler1 extends App {
  val tot = (1 until 1000).filter(n => n % 3 == 0 || n % 5 ==0).foldLeft(0)(_ + _)
  println(tot)
}