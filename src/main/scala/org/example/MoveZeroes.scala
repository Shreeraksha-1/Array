package org.example

object MoveZeroes {
  def main(args: Array[String]): Unit = {
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var j = 0

    for (i <- arr.indices) {
      if (arr(i) != 0) {
        val temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
        j += 1
      }
    }

    println(arr.mkString(" "))
  }

}
