/**
 * Created by Sune on 10-09-2015.
 */
object exercise1 {
  def main (args: Array[String]){
    println(last(List(1,1,2,3,5,8)))
  }

  def last(list: List[Int]): Int={
    return list.last
  }


}
