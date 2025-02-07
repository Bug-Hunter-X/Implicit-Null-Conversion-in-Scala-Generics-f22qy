```scala
class MyClass[T](val value: T) {
  def this() = this(null.asInstanceOf[T])
}

class MySafeClass[T](val value: Option[T]) {
  def this() = this(None)
  def getValue: T = value.getOrElse(throw new Exception("Value is null")) 
  def getOrDefault(defaultValue: T): T = value.getOrElse(defaultValue) 
}
```