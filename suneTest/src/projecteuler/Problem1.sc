//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.


def findMultiples3and5(x: Int): Int = {
  if (x == 0) return 0
  else if (x % 3 == 0 || x % 5 == 0) return x + findMultiples3and5(x - 1)
  else return findMultiples3and5(x - 1)
}

findMultiples3and5(999)

def betterFindMultiples3and5(x: Int) = (1 to x).filter(x => x%3 == 0 || x%5 == 0).sum

betterFindMultiples3and5(999)