package org.example

object RotateArray {
def main(args: Array[String]): Unit = {
  val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val k = scala.io.StdIn.readLine().toInt
  val rotateArray = arr.takeRight(k) ++ arr.take(arr.length-k)
  println(rotateArray.mkString(" "))
}
}
