class Area {
  def area1(shape: String, first: Int, second: Int):String=
  {
    def area( first: Int, second: Int, f:(Int,Int) => Double):Double={f(first,second)}
    shape match {
      case "rectangle" =>s"Area of $shape is ${area(first, second,(first,second)=>first*second)}"
      case "rhombus" =>s"Area of $shape is ${area(first, second,(first,second)=>(first*second)/2)}"
      case "parallelogram" => s"Area of $shape is ${area(first, second,(first,second)=>first*second)}"
      case _ => "Not defined yet for square"
    }
  }
  }




