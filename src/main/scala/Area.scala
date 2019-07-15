class Area {
  def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String= {
    shape match {
      case "rectangle" => s"$shape area is ${f(first,second)}"
      case "square" => s"$shape area is ${f(first,second)}"
      case "cube" =>s"$shape area is ${f(first,second)}"
      case _ => s"Not defined yet for $shape type"
    }

  }

}


