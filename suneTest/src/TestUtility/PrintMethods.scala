package TestUtility {

/**
 * Created by Sune on 11-09-2015.
 */
package object PrintMethods{
  def printList(args: TraversableOnce[_]): Unit = {
    args.foreach(println)
  }
}

}
