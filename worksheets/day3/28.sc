import data.Book
import data.Data.books

books
  .filter(_.author == "odersky")
  .map(_.basePrice)

val pf: PartialFunction[Book, Double] = {
  case Book("odersky", _, price, _) => price
}

val f: Function[Book, Double] = {
  case Book("odersky", _, price, _) => price
}

books
  .filter(pf.isDefinedAt)
  .map(pf)

books
//  .filter(???)
  .map(f)

books.collect(pf)

books.collect {
  case Book("odersky", _, price, _) => price
}
