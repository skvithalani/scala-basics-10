import scala.collection.mutable

Nil: List[Int]
List.empty[Int]
List[Int]()

def square(x: Int) = x * x

def map(xs: List[Int], f: Int => Int): List[Int] = {
  val result: mutable.Buffer[Int] = mutable.Buffer.empty

  val iterator = xs.iterator

  while (iterator.hasNext) {
    result += f(iterator.next())
  }

  result.toList
}

def map2(xs: List[Int], f: Int => Int): List[Int] = {
  var stack: List[Int] = Nil

  val iterator = xs.iterator

  while (iterator.hasNext) {
    stack = f(iterator.next()) :: stack
  }

  stack.reverse
}

map(List(1, 2, 3, 4), x => x * x)
map2(List(1, 2, 3, 4), square)

