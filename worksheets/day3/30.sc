import example.typeclass.Sorter

val xs = List(1, 3, 10, 33, 94, 120, 145)

Sorter.sort(List(3, 2, 9, 10))

Sorter.sort(List("z", "a", "d"))

Sorter.sort(List(Some(10), None, Some(3)))

Sorter.sort(List(Some("z"), None, Some("a")))

Sorter.sort(List(("z", 10), ("z", 1), ("s", 30)))

Sorter.sort(List((Option("z"), Some(10)), (Some("z"), None), (Some("s"), Some(30))))

Sorter.sort(data.Data.books)
