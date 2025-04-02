package org.example

object LeadersInArray {
  def main(args: Array[String]): Unit = {
    println("Enter array element speared by space")
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var maxFromRight = Int.MinValue
    var leaders = scala.collection.mutable.ListBuffer[Int]()

    for(i <- arr.indices.reverse)
      if(arr(i) >= maxFromRight){
        leaders.prepend(arr(i))
        maxFromRight = arr(i)
      }
    println(leaders.mkString(" "))
  }


}
