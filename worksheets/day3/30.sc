import example.typeclass.{Ord, Sorter}

val xs = List(1, 3, 10, 33, 94, 120, 145)

Sorter.sort(List(3, 2, 9, 10))(Ord.intOrd)

Sorter.sort(List("z", "a", "d"))
