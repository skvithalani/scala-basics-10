{}
trait Animal
class Tiger extends Animal
class Lion extends Animal

val tigers: Array[Tiger] = Array(new Tiger)
//val animals: Array[Animal] = tigers

val tigers1: List[Tiger] = List(new Tiger)
val animals2 = new Lion :: tigers1
1 :: new Lion :: tigers1
val animals1 = tigers1
animals2.tail
