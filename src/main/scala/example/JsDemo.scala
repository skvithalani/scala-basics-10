package example

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value)           => JsNumber(value * value)
    case JsArray(values)           => JsArray(values.map(transform))
    case JsString("urn" :: suffix) => JsString(s"Hello $suffix")
    case JsObject(values)          => JsObject(
      values.map {
        case (k@("m" | "n"), v) => s"Hello $k" -> v
        case (k, v)             => k -> transform(v)
      }
    )
    case _                         => json
  }
}

object :: {
  def unapply(string: String): Option[(String, String)] = string.split(":") match {
    case Array(prefix, suffix) => Some((prefix, suffix))
    case _                     => None
  }
}
