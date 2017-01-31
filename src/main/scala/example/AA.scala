package example

sealed trait Day
object Day {
  case object Weekday extends Day
  case object Weekend extends Day
}

sealed trait Customer
object Customer {
  case object Rewards extends Customer
  case object Regular extends Customer
}

case class Category(customer: Customer, day: Day)

case class Hotel(name: String, rating: Int, rateCard: Map[Category, Int]) {
  def priceFor(bookingRequest: BookingRequest): Int =
    bookingRequest.categories.map(rateCard).sum
}

case class BookingRequest(customer: Customer, days: List[Day]) {
  def categories: List[Category] = days.map(day => Category(customer, day))
}

class ReservationService(hotels: Hotel*) {
  def findBestHotel(bookingRequest: BookingRequest): String =
    hotels.minBy(h => (h.priceFor(bookingRequest), -h.rating)).name
}

