import scala.annotation.tailrec


def map3(xs: List[Int], f: Int => Int): List[Int] = {
  if(xs == Nil) Nil else f(xs.head) :: map3(xs.tail, f)
}


def map5(xs: List[Int], f: Int => Int): List[Int] = {
  def loop(xs: List[Int], stack: List[Int]): List[Int] = {
    if(xs == Nil) stack else loop(xs.tail, f(xs.head) :: stack)
  }

  loop(xs, Nil).reverse
}

map3((1 to 1000).toList, x => x * x)
map5((1 to 10000).toList, x => x * x)




