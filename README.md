# SOLID Principle

SOLID principle is a pronciple devised to reduce the complexity int he code as the code gets more bulkier and it is easier for us to resuse the code wherever possible and to make it simpler for implementations.
The Five Concepts that make up the solit Principles are
1. **S**ingle Responsibilty
2. **O**pen for extension Closed for Modification
3. **L**iskov Substitution
4. **I**nterface Seggregation
5. **D**ependency Inversion


## Single Responsibility.
A class should only have one responsibility. It should only have one reason to to change.
The advantages it provides
1. **Testing** : A calss with one responsibility will have fewer test cases.
2. **Lower Coupling** : Less Functionality in a single class will have fewer dependencies.
3. **Organization** : Smaller, well organized classes are easier to search than monolithic ones


## Open for Extension, Closed for Modification.
The classes should be open for extension and the modification of an existing method/functionality is a big no no.The only time we do modification is when there is a bug.
The Advantages it provides
1. **Lesser Bugs** : The number of potential bugs introduced is lower.


## Liskov Substitution
If class A is a subtype of class B then we should be able to replace B with A without disrupting the behaviour of our program.

## Interface Seggregation
Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them

## Dependency Inversion
The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
