import asynchrony.FutureExtensions.RichFuture

import scala.async.Async._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


def square(x: Int): Future[Int] = Future {
  Thread.sleep(2000)
  println("running the square")
  x * x
}

val xs = List(1, 2, 3, 4)

val futures: List[Future[Int]] = xs.map(square)

futures
  .reduce((a, b) => a.flatMap(x => b.map(y => x + y)))
  .show()

futures
  .reduce((a, b) => async(await(a) + await(b)))
  .show()

