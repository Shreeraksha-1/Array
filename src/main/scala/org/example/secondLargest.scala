package org.example

object secondLargest {
  def main(args : Array[String]): Unit = {
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var max = Int.MinValue
    var secondmax = Int.MinValue
    for(i <- arr.indices){
      if(arr(i) > max) {
        secondmax = max
        max = arr(i)
      }
      else if(arr(i) > secondmax && arr(i) != max ) {
        secondmax = arr(i)
      }
    }
    println(secondmax)

  }

}
