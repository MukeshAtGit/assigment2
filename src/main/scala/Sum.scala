class Sum {
  def sum(operation: String, first: Int, second: Int): String = {
    def sum1(first: Int, second: Int, f: (Int, Int) => Long): Long = {f(first, second)}


    operation match {
      case "ints" => s"${sum1(first, second,(first, second) => (first + second))} ( $first + $second)"
      case "square" => s"${sum1(first, second, (first, second) => ((first * first) + (second * second)))} ( $first * $first + $second * $second )"
      case "cube" => s" ${sum1(first, second, (first, second) =>((first * first * first) + (second * second * second)))}($first * $first * $first + $second * $second * $second)"
      case _ => "Not defined yet for this type"
    }
  }
}

