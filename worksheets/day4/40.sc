import asynchrony.FutureExtensions.RichFuture

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.control.NonFatal

try 1 / 0 catch {
  case ex: RuntimeException =>
  case NonFatal(ex)         =>
}

List(10).map(_ + 3)
List.empty[Int].map(_ + 3)


Option(10).map(_ + 3)
Option.empty[Int].map(_ + 3)

Future.successful(10).map(_ + 3).show()

Future.failed[Int](new NumberFormatException).map(_ + 3).show()

Future.failed[Int](new NumberFormatException).recover {
  case ex: NumberFormatException => 0
}.show()

Future.failed[Int](new NumberFormatException).recoverWith {
  case ex: NumberFormatException => Future.successful(0)
}.show()

