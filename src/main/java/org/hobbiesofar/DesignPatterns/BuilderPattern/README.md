# Builder pattern
* Builder pattern is a creational design pattern that lets you create a complex object step by step.
* The pattern allows you to produce different types and representations of an object using the same contruction code.
* The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.
* The pattern organizes object creation inot a set of steps.
* TO create an object you execute a series of these steps on a builder object. The most important part is that you need not call all of the steps. You can call only the steps that are necessary for producing a particular configuration of an object.
* Some of the construction steps might require different implementation when you need to build various representations of the product.
* In this case, you can create several different builder classes that implement the same set of building steps, but in a different manner. However, this would only work if the client code that calls the building steps is able to interact with builders using a common interface.
* **Director** : extract a series of calls to the builder steps you use to construct a product into a separate class. The director class might be a good place to put various construction routines so you can reuse them across your program.
