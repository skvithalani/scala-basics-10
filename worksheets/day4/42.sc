import scala.collection.immutable.Seq
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.control.NonFatal


Option(10)
Option(2)


Option(10).flatMap { x =>
  Option(2).map { y =>
    x + y
  }
}

for {
  x <- Option(10)
  y <- Option(2)
} yield x + y

for {
  x <- Option(10)
  y <- Option(2)
} println(x + y)

