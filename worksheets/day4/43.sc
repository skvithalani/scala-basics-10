import asynchrony.FutureExtensions.RichFuture

import scala.collection.immutable.Seq
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.control.NonFatal

def square(x: Int): Future[Int] = Future {
  Thread.sleep(2000)
  println("running the square")
  x * x
}

def double(x: Int): Future[Int] = Future {
  Thread.sleep(2000)
  println("running the double")
  x + x
}

val f1 = square(10)
val f2 = double(10)

f1.flatMap { v1 =>
  f2.map { v2 =>
    v1 + v2
  }
}.show()

{
  for {
    v1 <- f1
    v2 <- f2
  } yield v1 + v2
}.show()


