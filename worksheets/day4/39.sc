import scala.util.Try

def readAsync(callback: Array[Byte] => Unit): Unit = ???

def readAsync1: (Try[Array[Byte]] => Unit) => Unit = ???

type Async[T] = (Try[T] => Unit) => Unit
type Sync[T] = Unit => (Unit => Try[T])

def async[T]: Async[T] = ???

def readFile(): Iterator[Array[Byte]]
def sync[T]: Unit => Iterator[T]
