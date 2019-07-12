
class Fibo {
  def fibo(elementIndex:Int=5): Unit = {

    val lst=List[Int]()

    def findElement(currentIndex : Int, prev : Int = 0, next : Int = 1, lst:List[Int]) : List[Int] =
    {
      currentIndex match {
        case 0 => prev::lst
        case _ => findElement(currentIndex -1, next, prev + next,prev::lst)
      }
    }
    println(findElement(elementIndex,lst=lst).reverse)
  }
}










