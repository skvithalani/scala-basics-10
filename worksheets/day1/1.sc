class Person(age: Int, isFemale: Boolean) {
  def isWise = if(isFemale) age > 18 else age > 21

  def canMarry(canDrink: Int => Boolean): Boolean = {
    isWise && canDrink(this.age)
  }
}

val p = new Person(33, true)
p.canMarry(new ((Int) => Boolean) {
  override def apply(age: Int) = age > 30
})

//val canDrink: Int => Boolean = age => age > 30
def canDrink2(age: Int) = age > 30
val canDrink3: Int => Boolean = canDrink2
val canDrink4 = canDrink2 _

p.canMarry(age => age > 30)
//p.canMarry(canDrink)
p.canMarry(canDrink2)





