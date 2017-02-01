package example

import play.api.libs.json.{JsArray, JsNumber, JsObject, JsValue}

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value)  => JsNumber(value * value)
    case JsArray(values)  => JsArray(values.map(transform))
    case JsObject(values) => JsObject(values.mapValues(transform))
    case _                => json
  }
}
