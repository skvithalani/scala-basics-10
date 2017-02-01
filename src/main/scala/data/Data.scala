package data

import example.typeclass.Ord


case class Address(street: String, pin: Int)

object Address {
  
}

case class Person(name: String, address: Address)

object Person {
  
}

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {
  implicit val booOrd: Ord[Book] = (a: Book, b: Book) => a.basePrice > b.basePrice
}

object Data {

  val books = List(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "apple", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )

  val people = List(
    Person("mushtaq", Address("baner", 123)),
    Person("ajit", Address("pashan", 100))
  )
}
