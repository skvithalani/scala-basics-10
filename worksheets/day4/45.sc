import scala.util.control.NonFatal
import scala.util.{Failure, Success, Try}


Try(10)
Try[Int](throw new RuntimeException("asdas"))

def m(t: Try[Int]) = t
  .flatMap { x =>
    Try(100).map {
      y => x + y
    }
  }

m(Try(10))
m(Try[Int](throw new RuntimeException("asdas")))

val t2 = Try[Int](throw new RuntimeException("asdas")).recover {
  case NonFatal(ex) => 90
}

m(t2)
