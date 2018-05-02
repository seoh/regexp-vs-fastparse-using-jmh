package methods

import fastparse.all._

object FastParse {

  def test(text: String): List[String] = {
    def column(name: String): Parser[String] =
      P( s"$name=" ~ (!"," ~ AnyChar).rep(1).! )

    P(
      column("school") ~ "," ~
      column("name") ~ "," ~
      column("code") ~ "," ~
      column("address") ~ "," ~
      column("major") ~ "," ~
      column("grade")
    ).parse(text) match {
      case Parsed.Success((s,n,c,a,m,g), _) => List(s,n,c,a,m,g)
      case _: Parsed.Failure => List.empty[String]
    }
  }
}

