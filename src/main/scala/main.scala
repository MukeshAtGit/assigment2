object main {
  def main(args: Array[String]): Unit = {



    val fibo1 = new Fibo
    fibo1.fibo()

    val area2= new Area
    val rectangle=(first:Int,second:Int)=>first*second

    val rhombus=(first:Int,second:Int)=>first*second/2

    val parall=(first:Int,second:Int)=>first*second


    println(area2.area("rectangle",10,12,rectangle))

     val sum2=new Sum

    val ints=(x:Int,y:Int)=>x+y
    val square=(x:Int,y:Int)=>(x*x)+(y*y)
    val cube=(x:Int,y:Int)=>(x*x*x)+(y*y*y)


    println({sum2.sum(square,12,15)})


  }

}
