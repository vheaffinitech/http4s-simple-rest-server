
import org.http4s._
import org.http4s.dsl._
import org.http4s.server._
import org.http4s.server.blaze.BlazeBuilder



object greetingService {
  val service = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(s"Hello, ${name}")
    case GET -> Root / "bonjour" / name =>
      Ok(s"Bonjour, ${name}")
  }
}

object byeService {
  val service = HttpService {
    case GET -> Root / "bye" / name =>
      Ok(s"Bye, ${name}")
    case GET -> Root / "aurevoir" / name =>
      Ok(s"Au revoir, ${name}")
  }
}


object RestServer extends App {

  val port = 8080

  BlazeBuilder.bindHttp(port)
    .mountService(greetingService.service, "/greeting/")
    .mountService(byeService.service, "/bye/")
    .run
    .awaitShutdown()
}
