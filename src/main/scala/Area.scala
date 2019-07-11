class Area {
  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String=
  {
    shape match {
      case "rectangle" =>println(s"Area of $shape is ${area(10,12,(x,y)=>x*y)}")
      case "rhombus" =>println(s"Area of $shape is ${area(10,12,(x,y)=>(x*y/2))}")
      case "parallelogram" => println(s"Area of $shape is ${area(10,12,(x,y)=>x*y)}")
      case _ => "Not defined yet for square"
    }
  }
  }


