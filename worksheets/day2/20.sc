def add(o1: Option[String], o2: Option[String]): Option[String] = (o1, o2) match {
  case (Some(a), Some(b)) => Some(a + b)
  case (None, _)          => o2
  case (_, None)          => o1
}

//add(Some("abc"), Some("111"))
//add(None, None)

def length[T](xs: List[T]): Int = xs match {
  case Nil            => 0
  case ::(head, tail) => 1 + length(tail)
}

def append[T](x: T, xs: List[T]): List[T] = xs match {
  case Nil      => List(x)
  case ::(h, t) => ::(h, append(x, t))
}

append(10, List(1, 2))
append(Nil, List(1, 2))
append(Nil, List(List(1)))

