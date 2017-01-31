
{

}

sealed abstract class Day(index: Int) {
  def valueOf(string: String): Day
}
object Day {
  case object Sunday extends Day(1) 
  case object Monday extends Day(2)

  val values = Seq(Sunday, Monday)
}

Day.Sunday
Day.Monday

