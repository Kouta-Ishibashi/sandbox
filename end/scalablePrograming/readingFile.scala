import scala.io.Source

//必要な行数の最大幅を計算するための
def widthOfLength(s: String) = s.length.toString.length


// val lines Source.fromFile(args(0)).getLines().toList

if (args.length > 0){
  val lines Source.fromFile(args(0)).getLines().toList
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOfLength(longestLine)

  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(paddding)
  println(line.length + " " + line)
}
else
  Console.err.println("Please enter filename")

