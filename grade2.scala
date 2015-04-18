import scala.util._
import scala.io._
import scala.math._

object gradefile extends App {

  def parseCSVHeader(line : String) : Array[String] = {
    val tokens = line.split(",")
    for (i <- 0 until tokens.length)
       tokens(i) = tokens(i).trim
    tokens
  }
    println ("enter course")
    val course = readLine()
    val categorysource = scala.io.Source.fromFile("categories_" + course + ".txt")
        var lines = categorysource.getLines
        var separatearrays = lines.map(parseCSVHeader).toArray
        var categories = separatearrays(0)
        var weights = separatearrays (1)
            var weightE = weights(0).toInt
            var weightL = weights(1).toInt
            var weightH = weights(2).toInt
            var weightP = weights(3).toInt
            var weightC = weights(4).toInt
        var assignumber = separatearrays (2)
    
    
    val studentsource = scala.io.Source.fromFile("students_" + course + ".txt")
    var studentarray = studentsource.getLines.toArray
      
    var line = io.Source.fromFile("students_" + course + ".txt").getLines.size
    for (i <- 0 until line) {
        var student = studentarray(i)
        var arrayInd = student.split(",")
        var ID = arrayInd (0) 
        var lastName = arrayInd(1)
        var firstName = arrayInd(2)    
        val studentgrade = scala.io.Source.fromFile(ID + course + ".data")
        val studentgradearray:Array[String] = studentgrade.getLines.toArray
        val gradenumber = (studentgradearray.size)
    }
}