
val dict = Map("a" -> 1, "b" -> 2)

dict.map(t => t._1)
dict.keys
dict.map(t => t._2)
dict.values

dict.map(t => t._2 -> t._1)

dict.mapValues(v => v * v)
