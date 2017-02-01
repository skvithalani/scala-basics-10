
class Person(val name: String, val age: Int)

object Person123 {
  def apply(name: String, age: Int) = new Person(name, age)
  def unapply(p: Person): Option[(String, Int)] = Some((p.name, p.age))
}

val p = Person123("abc", 33)

val Person123(n, a) = p

def m(x: Any) = x match {
  case 1 => 10
  case "asdasd" =>
  case Person123(name, age) => age
  case x => x
}