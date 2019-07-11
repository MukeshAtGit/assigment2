class Area {
  def area1(shape: String, first: Int, second: Int):String=
  {
    def area( first: Int, second: Int, f:(Int,Int) => Int):Int={f(first,second)}
    shape match {
      case "rectangle" =>s"Area of $shape is ${area(10,12,(first,second)=>first*second)}"
      case "rhombus" =>s"Area of $shape is ${area(10,12,(first,second)=>(first*second)/2)}"
      case "parallelogram" => s"Area of $shape is ${area(10,12,(x,y)=>x*y)}"
      case _ => "Not defined yet for square"
    }
  }
  }




