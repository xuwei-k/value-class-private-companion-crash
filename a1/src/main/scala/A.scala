package p1

final class A(private val x1: String) extends AnyVal {
  def f: String = x1 + A.x2
}

private object A {
  private val x2: String = "x2"
}

trait C {
  implicit def stringToA(s: String): A = new A(s)
}
