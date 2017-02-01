import data.Book
import data.Data.books

1.+(1)

books.map { book =>
  book.basePrice
}

books.map { case Book(_, _, basePrice, _) =>
  basePrice
}

val map = Map(1 -> "a", 2 -> "b")

map.mapValues(v => s"Hello $v")


map.map(t => t._1 * t._1 -> s"Hello ${t._2}")

map.map { case (k, v) =>
  k * k -> s"Hello $v"
}

