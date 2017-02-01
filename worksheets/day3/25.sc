
class Person(val name: String, val age: Int)

object Person {
  def apply(name: String, age: Int) = new Person(name, age)
  def unapply(p: Person): Option[(String, Int)] = Some((p.name, p.age))
}

val p = Person("abc", 33)

val Person(n, a) = p

