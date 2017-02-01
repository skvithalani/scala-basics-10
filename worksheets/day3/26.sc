
val email = "mushtaq@thoughtworks.com"

object Email {
  def unapply(string: String): Option[(String, String)] = string.split("@") match {
    case Array(name, domain) => Some((name, domain))
    case _                   => None
  }
}


def parse(email: String) = email match {
  case Email(user, domain) => s"Hello $user from $domain"
  case _                   => "error"
}

parse("mushtaq@thoughtworks.com")
parse("mushtaq@thoughtworks.com@asdasd")
parse("asasdasd")