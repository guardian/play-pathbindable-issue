package controllers

import javax.inject._
import model.{Apple, Dog}
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def dogDescription(dog: Dog) = Action { implicit request: Request[AnyContent] =>
    Ok(s"Just like a dog $dog")
  }

  def appleChecker(apple: Apple) = Action { implicit request: Request[AnyContent] =>
    Ok(s"The best kind of apple is $apple")
  }
}
