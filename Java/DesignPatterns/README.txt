Design Patterns::: Design patterns are solutions to software design problems we find again and again in application development.

Creational:
Creational patterns are ones that create objects for us, rather than having us instantiate objects directly. This gives our program more flexibility in deciding which objects need to be created for a given case.

Structural:
These concern class and object composition. They use inheritance to compose interfaces and define ways to compose objects to obtain new functionality.

Behavioral:
Most of these design patterns are specifically concerned with communication between objects.

Creational Design Patterns:::
Singleton Pattern
Factory Pattern
Abstract Factory Pattern
Builder Pattern
Prototype Pattern

Structural Design Patterns:::
Adapter Pattern
Composite Pattern
Proxy Pattern
Flyweight Pattern
Facade Pattern
Bridge Pattern
Decorator Pattern

Behavioral Design Patterns:::
Template Method Pattern
Mediator Pattern
Chain of Responsibility Pattern
Observer Pattern
Strategy Pattern
Command Pattern
State Pattern
Visitor Pattern
Iterator Pattern
Memento Pattern




Decorator Pattern: Decorator patterns allows us to add a new functinality to an existing object. 
This pattern adds functionality by wrapping objects in other objects. Each time additional functionality is required, the object is wrapped in another object. Java I/O streams are a well-known example of the decorator pattern.
PrintWriter outputStream = new PrintWriter ( new BufferedWriter ( new FileWriter("C:/Users/nbarre/Desktop/OutputFile.txt"))); // PrintWriter writes buffered output, so no need for BufferedWriter here.

Factory Pattern:
The factory pattern (also known as the factory method pattern) is a creational design pattern. A factory is a class that encapsulates the object creation code. A factory class instantiates and returns a particular type of object based on data passed to the factory. The different types of objects that are returned from a factory typically are subclasses of a common parent class.

Abstract Factory Pattern:
An abstract factory is a factory that returns factories. Why is this layer of abstraction useful? A normal factory can be used to create sets of related objects. An abstract factory returns factories. Thus, an abstract factory is used to return factories that can be used to create sets of related objects.
As an example, you could have a Ford Explorer factory that returns car part objects (mufflers, air filters, etc) associated with a Ford Explorer. You could also have a Chevy Tahoe factory that returns car part objects associated with a Chevy Tahoe. We could create an abstract factory that returns these different types of car factories depending on the car that we were interested in. We could then obtain car part objects from the car factory. Via polymorphism, we can use a common interface to get the different factories, and we could could then use a common interface to get the different car parts.

