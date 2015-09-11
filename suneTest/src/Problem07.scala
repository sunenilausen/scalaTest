/**
 * Created by Sune on 10-09-2015.
 */
import TestUtility.PrintMethods

object Problem07 {
  //scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  //res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  def main (args: Array[String]) {
    var list = flatten(List(List(1, 1), 2, List(3, List(5, 8))))


    printList(list)


  }


  def flatten(list: List[Any]): List[Any] = list flatMap{
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
}
