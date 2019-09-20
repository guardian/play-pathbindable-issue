package model

import play.api.mvc.PathBindable

case class Apple(variety: String)

object AppleBinding {

  implicit val pathBinder = new PathBindable[Apple] {
    override def bind(key: String, value: String): Either[String, Apple] = {
      Right(Apple(value))
    }

    override def unbind(key: String, apple: Apple): String = apple.variety
  }
}