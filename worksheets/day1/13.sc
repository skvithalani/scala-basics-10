import data.AliceData

val words = AliceData.bookText.split(AliceData.bookRegex)
val noise = AliceData.stopWordText.split(AliceData.stopWordRegex).toSet

val strings = words
  .toList
  .filterNot(noise)

strings
  .groupBy(identity)
  .mapValues(_.length)
  .toList
  .sortBy(-_._2)
  .take(10)
  .foreach(println)

strings.take(3)
