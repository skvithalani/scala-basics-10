package asynchrony

import scala.concurrent.duration.DurationDouble
import scala.concurrent.{Await, Future}

object FutureExtensions {

  implicit class RichFuture[T](val future: Future[T]) extends AnyVal {
    def show(): Future[T] = Await.ready(future, 30.seconds)
  }
}
