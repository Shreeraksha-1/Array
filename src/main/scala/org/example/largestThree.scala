package org.example

object LargestThree {
  def main(args: Array[String]): Unit = {
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)

    if (arr.length < 3) {
      println("Not enough elements to find the top three.")
      return
    }

    var max = Int.MinValue
    var secondMax = Int.MinValue
    var thirdMax = Int.MinValue

    for (i <- arr.indices) {
      if (arr(i) > max) {
        thirdMax = secondMax
        secondMax = max
        max = arr(i)
      }
      else if (arr(i) > secondMax && arr(i) != max) {
        thirdMax = secondMax
        secondMax = arr(i)
      }
      else if (arr(i) > thirdMax && arr(i) != secondMax && arr(i) != max) {
        thirdMax = arr(i)
      }
    }

    if (thirdMax == Int.MinValue) {
      println("No third largest element found.")
    } else {
      println(s"Largest three elements are: $max, $secondMax, $thirdMax")
    }
  }
}
