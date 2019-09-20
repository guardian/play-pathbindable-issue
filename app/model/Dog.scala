package model

import play.api.mvc.PathBindable

case class Dog(age: Int)

object DogBinding {

  implicit val pathBinder = new PathBindable[Dog] {
    override def bind(key: String, value: String): Either[String, Dog] = {
      Right(Dog(value.toInt))
    }

    override def unbind(key: String, dog: Dog): String = dog.age.toString
  }
}