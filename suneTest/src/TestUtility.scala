/**
 * Created by sunenilausen on 11-09-2015.
 */

package TestUtility {

class PrintMethods {
  def printList(args: TraversableOnce[_]): Unit = {
    args.foreach(println)
  }
}

}
