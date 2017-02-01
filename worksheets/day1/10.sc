

def m(xs: Int*) = xs
m(1, 2, 3, 4)

val t = (1, "a")
val t2 = (1, "a", 90.9)
t._1
t._2

List(1, 2, 3)
List.apply(1, 2, 3)
Set(1, 2, 2, 3, 3)
Set.apply(1, 2, 2, 3, 3)
Map(1 -> "a", 2 -> "b")
Map.apply(1 -> "a", 2 -> "b")

1 -> "a"
1.->("a")