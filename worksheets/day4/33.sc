
trait Context {
  def m = 10
}

object Context {
  implicit val context = new Context {}
  type Box[T] = Context

  def apply[T](implicit ct: Box[T]): Box[T] = ct
}


def controllerMethod[T: Context.Box](product: Int) = {
  Context[T].m
}

controllerMethod(100)