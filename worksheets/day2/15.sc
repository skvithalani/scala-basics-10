
object A extends AnyRef {
  private def square(x: Int) = x * x
  def m = new A().obj
}

class A {
  private def obj = 10
  A.square(11)
}

A: A.type
new A : A
new A : A.ty

val A1 = new AnyRef{}

class A1 extends AnyRef

A: AnyRef
A1: AnyRef


A.toString


"asdasd"
10
val x: Int => Int = x => x * x


object DDD
object EEE

DDD: AnyRef
DDD: DDD.type
