
val divide100: Int => Int = x => 100/ x
val divide100a: Int => Int = {
  x => 100/ x
}
val divide100b: Int => Int = {
  case x if x != 0 => 100/ x
}

val f1: Function1[Int, Int] = {
  case x if x != 0 => 100/ x
}

val pf: PartialFunction[Int, Int] = {
  case x if x != 0 => 100/ x
}

pf(10)
pf(5)
pf.isDefinedAt(11)
pf.isDefinedAt(0)

pf(0)
