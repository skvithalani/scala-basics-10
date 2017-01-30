
import data.Data.books

books.foreach(println)

books.map(book => book.basePrice)
books.map(_.basePrice)

books.filter(_.author == "odersky").foreach(println)

books.filter(_.author == "odersky").map(_.basePrice)

books
  .groupBy(_.author)
  .mapValues(_.map(_.basePrice).sum)

books.sortBy(_.basePrice)
books.sortBy(-_.basePrice)

books.take(3)
