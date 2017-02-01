
val seq = Seq("a", "b")

seq(1)
seq.apply(1)

seq
seq: Seq[String]
seq: Int => String

List(1).map(index => seq(index))
List(0, 1).map(seq)

val set = Set("a", "d", "c", "c")

set("a")
set.apply("a")
set("aa")

set
set: Set[String]
set: String => Boolean

seq.filter(x => set(x))
seq.filter(set)


val dict = Map("a" -> 1, "b" -> 2)

dict("a")
dict.apply("b")

dict: Map[String, Int]
dict: String => Int

seq.map(dict)

