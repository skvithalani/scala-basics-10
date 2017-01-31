import example.Customer.{Regular, Rewards}
import example.Day.{Weekday, Weekend}
import example.{BookingRequest, Category, Hotel, ReservationService}

val bookingService = new ReservationService(
  Hotel("Lakewood", 3, Map(
    Category(Regular, Weekday) -> 110,
    Category(Rewards, Weekday) -> 80,
    Category(Regular, Weekend) -> 90,
    Category(Rewards, Weekend) -> 80
  )),
  Hotel("Bridgewood", 4, Map(
    Category(Regular, Weekday) -> 160,
    Category(Rewards, Weekday) -> 110,
    Category(Regular, Weekend) -> 60,
    Category(Rewards, Weekend) -> 50
  )),
  Hotel("Ridgewood", 5, Map(
    Category(Regular, Weekday) -> 220,
    Category(Rewards, Weekday) -> 100,
    Category(Regular, Weekend) -> 150,
    Category(Rewards, Weekend) -> 40
  ))
)

val bookingRequests = Seq(
  BookingRequest(Regular, List(Weekday, Weekday, Weekday)),
  BookingRequest(Regular, List(Weekday, Weekend, Weekend)),
  BookingRequest(Rewards, List(Weekday, Weekday, Weekend))
)

bookingRequests.map(bookingService.findBestHotel)
