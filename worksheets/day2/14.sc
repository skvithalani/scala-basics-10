
case class Person(name: String, age: Int) {
  def mystring = s"hello $name your age is $age"
}

val p = new Person("abc", 33)
val p2 = new Person("abc", 33)

p == p2

p.mystring


p.hashCode()
p2.hashCode()

p.age
p.name

p.copy()
p.copy(name = "mushtaq")
