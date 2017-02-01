
def pf1: PartialFunction[Int, Int] = {
  case x if x != 0 => 100/x
}

def pf2: PartialFunction[Int, Int] = {
  case x if x == 50 => 1
}

def pf3: PartialFunction[Int, Int] = {
  case x if x == 150 => 0
}

val pf = pf1.orElse(pf2).orElse(pf3)

val f = pf.lift

f(100)
f(10)
f(0)
