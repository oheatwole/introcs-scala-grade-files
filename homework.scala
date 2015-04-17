import scala.util._
import scala.io._
import scala.math._

object homework extends App {
 
  val courseName = Try(args(0)) getOrElse("comp150")
  val studentFileName = s"students_$courseName.txt"
  val file = Source.fromFile(studentFileName)
  
  def parseCSVHeader(line : String) : Array[String] = {
    val tokens = line.split(",")
    for (i <- 0 until tokens.length)
       tokens(i) = tokens(i).trim
    tokens
  }
   
   val n = file.getLines.length
   val ids = Array.ofDim[String](n)
   val last = Array.ofDim[String](n)
   val first = Array.ofDim[String](n) 
   var i = 0
   for (line <- file.getLines){
       val parts = parseCSVHeader(file.getLines.toString)
       ids(i) = parts{0}
       last(i) = parts{1}
       first(i) = parts{2}
       i = i +1
   }
   println(ids{0})
}