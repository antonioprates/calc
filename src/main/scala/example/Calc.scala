package example

object Calc {

  def sum(firstArgument: Float, secondArgument: Float): Float =
    firstArgument + secondArgument

  def subtract(firstArgument: Float, secondArgument: Float): Float =
    firstArgument - secondArgument

  def multiply(firstArgument: Float, secondArgument: Float): Float =
    firstArgument * secondArgument

  def divide(firstArgument: Float, secondArgument: Float): Float =
    firstArgument / secondArgument

  def getOperator(): (Float, Float) => Float = {
    println("Input operator [+, -, *, /]:")
    scala.io.StdIn.readLine() match {
      case "+" => sum
      case "-" => subtract
      case "*" => multiply
      case "/" => divide
    }
  }

  def getOperand(number: Int): Float = {
    println(s"Input operand $number:")
    val op = scala.io.StdIn.readLine()
    op.toFloat
  }

  def printResult(result: Float): Unit = println(f"Equals: $result%.2f")

  def process(
      op: (Float, Float) => Float,
      firstArgument: Float,
      secondArgument: Float
  ): Unit = printResult(op(firstArgument, secondArgument))

  def main(args: Array[String]): Unit = {

    process(getOperator(), getOperand(1), getOperand(2))

  }
}
