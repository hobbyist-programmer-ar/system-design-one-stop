# Abstract Factory pattern
* Abstract factory method is again an Creational pattern that lets you produce families of related objects without specifying their concrete class.
* We need to cxreate an interface for each of the disticnt product of the product family. Then we can make the actual concrete products that follows the interface.
* The next steps is to declasre the Abstract Factory and interface with a list of creations method for all the products that are a part of the product family.
* These methods must return abstract product types represented by the interfaces we extracted previously
* A factory is a class that returns products of a particular kind.
* The client code has to work with both factories and products via their respective abstract interfaces. This lets you change the type of a factory that you pass to the client code, as well as the product variant that the client code receives, without breaking the actual client code.
