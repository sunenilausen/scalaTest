//If a list contains repeated elements they should be replaced with a single copy of
// the element. The order of the elements should not be changed.
//  Example:
//
//  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)





//Oops, read the description wrong but here goes my first edition where i just removed all duplicates
def removeDuplicates(a: List[String]): List[String] = {
  if (a.isEmpty) return a
  val b = a.tail.filter(x => x != a(0))
  return a(0)::removeDuplicates(b)
}

removeDuplicates(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))

def removeConsecutiveDuplicates(a: List[String]): List[String] = {
  if (a.isEmpty) return a
  val b = a.dropWhile(x => x == a(0))
  return a(0)::removeDuplicates(b)
}

removeConsecutiveDuplicates(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))

