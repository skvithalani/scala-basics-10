package example

import data.Book

object StringExtensions {

  class RichString3(string: String) {
    def helloize2 = s"Hello $string"
    def length = 100
  }

  implicit def str2Rich(string: String): RichString3 = new RichString3(string)

  implicit def str2Rich2(string: String): Int = string.length


  implicit class RichString(string: String) {
    def helloize = s"Hello $string"
  }

  implicit class RichString2(val string: String) extends AnyVal {
    def count2: Int = string.length
    def helloize = s"Hello wrong method $string"
  }

  case class Meter(value: Double) extends AnyVal {
    def +(other: Meter) = Meter(value + other.value)
  }

  class A(val book: Book) extends AnyVal {
    def m = 10
  }
}
