```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("hello")
  myInt.printValue()
  myString.printValue()
}
```