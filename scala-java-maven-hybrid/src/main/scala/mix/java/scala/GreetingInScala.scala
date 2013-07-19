package mix.java.scala

class GreetingInScala {
  def greet() {
    val delegate = new GreetingInJava
    delegate.greet()
  }
}
