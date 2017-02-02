
Array(1, 2, 3)
List(1, 2, 3)

val flag = true

trait Base
class D1 extends Base
class D2 extends Base

def x1: Base = if(flag) new D1 else new D2

def x2: D1 = if(flag) new D1 else null
def x3: D2 = if(flag) new D2 else null
def x4: String = if(flag) "mushtaq" else null
def x5: AnyRef = if(flag) "mushtaq" else new D1

def x6: AnyVal = if(flag) 10 else true
def x7: Any = if(flag) 10 else "mushtaq"

def x8: Nothing = throw new RuntimeException
def x9: String = if(flag) "mushtaq" else throw new RuntimeException
def x10: Int = if(flag) 10 else throw new RuntimeException
def x11: Null = if(flag) null else throw new RuntimeException
def x12: AnyVal = if(flag) 10
def x13: Any = if(flag) "mushtaq"

Array((), ())

1: Int
1: Unit
"asdasd": String
"asdasd": Unit

def n: Null = null

