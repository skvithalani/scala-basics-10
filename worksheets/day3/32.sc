
import data.Book
import data.Data.books
import play.api.libs.json.Json

books.head

val json = Json.toJson(books.head)

json.as[Book]