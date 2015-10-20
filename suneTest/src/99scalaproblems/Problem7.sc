def flatten(list: List[Any]): List[Any] = list flatMap{
  case ms: List[_] => flatten(ms)
  case e => List(e)
}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))