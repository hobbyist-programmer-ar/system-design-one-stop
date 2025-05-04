# Singleton Pattern
It is one of the creational pattern. The singleton pattern is a simple design pattern where we use a single instance of the class throughout the code. But it breaks the **Single responsibility Principle** and here is how
1. **Ensure that a class has just a single instance** : These instances are created once when the program starts up and is given everytime the instace fo the class is called upon. These are only used when we want to create a database instace or a file. But the caveat is if you want a modified instance for the same class it can;t be done. This behavior is impossible to implement with a regular constructor since a constructor call must always return a new object by design.
2. **Provide a global access point to that instance** : Singleton pattern allows you access some object from anywhere in the program and this instance cannot be overwritten. But The problem is the instance we create at one place we should not be allowing other pieces of code accessing it. Like I dont want my database instance to be accessed by a data validator utility I created.

Inorder to avoid the above disadvantages/Problem we can do the following steps.
* Make the default contructor private, to prevent other object from using the new operator with the singleton class.
* Create a static creation method that acts as a contructor. Under the hood, this method calls the private contructor to create an object and saves it in a static field. All following calls to this method return the cached object.
