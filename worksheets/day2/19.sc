
val m = Map(1 -> "a", 2 -> "b")

m(1)
m(2)

m.apply(2)

//m(3)

val x: Option[String] = m.get(3)
val y: Option[String] = m.get(1)

def add(o1: Option[String], o2: Option[String]): Option[String] = {
  if(o1 != None && o2 != None) {
    val a = o1.asInstanceOf[Some[String]].value
    val b = o2.asInstanceOf[Some[String]].value
    new Some(a + b)
  } else if(o1 == None) o2 else o1
}

add(Some("abc"), Some("111"))
add(None, None)
