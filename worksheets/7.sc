val square: Int => Int = x => x * x
val add: (Int, Int) => Int = (x, y) => x + y

square(10)
square.apply(10)
add(9, 23)
add.apply(9, 23)

def sum(xs: List[Int]): Int = fold(xs, 0)((a, b) => a + b)

def multiply(xs: List[Int]): Int = fold(xs, 1)((a, b) => a * b)

def stringify(xs: List[Int]): String = fold(xs, "")((a, b) => a + b)
def stringifyD(xs: List[Double]): String = fold(xs, "")((a, b) => a + b)

def map(xs: List[Int], f: Int => Int): List[Int] = {
  fold(xs, List.empty[Int]) { (acc, elm) =>
    f(elm) :: acc
  }.reverse
}

map(List(1, 2, 3, 4), x => x * x)

def fold[Elm, Result](xs: List[Elm], seed: Result)(f: (Result, Elm) => Result): Result = {
  if(xs == Nil) seed else fold(xs.tail, f(seed, xs.head))(f)
}

sum(List(1, 2, 3, 4))
multiply(List(1, 2, 3, 4))
stringify(List(1, 2, 3, 4))

