import scala.collection.immutable.Seq
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.control.NonFatal


List(10, 11)
List("a", "b")
List("a", "b")

List(10, 11).map(x => List("a", "b").map(y => (x, y)))

List(10, 11).map(x => List("a", "b").map(y => (x, y))).flatten

List(10, 11).flatMap { x =>
  List("a", "b").flatMap { y =>
    List(1, 2).map { z =>
      (x, y, z)
    }
  }
}

List(10, 11).foreach { x =>
  List("a", "b").foreach { y =>
    List(1, 2).foreach { z =>
      println(x, y, z)
    }
  }
}

for {
  x <- List(10, 11)
  y <- List("a", "b")
  z <- List(1, 2)
} println(x, y, z)

for {
  x <- List(10, 11)
  if x == 11
  dd = x + 10
  y <- List("a", "b")
  if y == "a"
  z <- List(1, 2)
  if z == 2
} yield (x, y, z, dd)

