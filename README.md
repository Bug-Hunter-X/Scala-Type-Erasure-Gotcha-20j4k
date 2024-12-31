# Scala Type Erasure Example

This repository demonstrates a common issue related to type erasure in Scala.  The code defines a generic class `MyClass` that holds a value of type `T`.  While the code compiles and runs without errors, it highlights a potential issue that can occur during runtime related to type erasure. The example demonstrates how the type information is lost at runtime, despite the type parameter. 