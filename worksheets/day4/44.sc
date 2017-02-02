
import scala.util.{Failure, Success, Try}

Success(10)
Failure[Int](new RuntimeException)

Some(10)
None

Option(10)
Option.empty[Int]

Try(10)
Try[Int](throw new RuntimeException)

def m(t: Try[Int]) = t match {
  case Success(x)  => x.toString
  case Failure(ex) => ex.getMessage
}

m(Try(40))
m(Try(throw new RuntimeException("asdadsasd")))

def m2(t: Try[Int]) = t
  .map(_.toString)
  .recover {
    case ex => ex.getMessage
  }

def m3(t: Try[Int]) = t
  .map(_.toString)
  .getOrElse("asdasd")

m2(Try(40))
m2(Try(throw new RuntimeException("asdadsasd")))
