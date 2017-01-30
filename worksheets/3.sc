import scala.collection.mutable

Nil
3 :: Nil

val xs = List(1, 2, 3, 4)

xs == Nil

11 :: xs

xs.reverse

xs.map(x => x * x)

xs

def square(x: Int) = x * x

xs.map(square)


def map(xs: List[Int], f: Int => Int): List[Int] = ???

xs.iterator

val buf: mutable.Buffer[Int] = mutable.Buffer.empty

buf
buf += 10
buf

buf.toList
