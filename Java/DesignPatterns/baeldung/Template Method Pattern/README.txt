Template Method Pattern:
https://www.baeldung.com/java-template-method-pattern


The template method pattern is a technique that defines the steps required for some action, implementing the boilerplate steps, and leaving the customizable steps as abstract. Subclasses can then implement this abstract class and provide a concrete implementation for the missing steps.

It makes it easier to implement complex algorithms by encapsulating logic in a single method.


ComputerBuilder.java:
the algorithm's structure will be defined in a base class that defines the template buildComputer() method.
The ComputerBuilder class is responsible for outlining the steps required to build a computer by declaring methods for adding and setting up different components, such as a motherboard and a processor.
Here, the buildComputer() method is the template method, which defines steps of the algorithm for assembling the computer parts and returns fully-initialized Computer instances. Notice that it's declared as final to prevent it from being overridden.

StandardComputerBuilder.java, HighEndComputerBuilder.java : 
With the base class already set, these two subclasses, one which builds a “standard” computer, and the other that builds a “high-end” computer.
As we can see, we didn't need to worry about the whole assembly process but only for providing implementations for separate methods.



Another example we can explain is Database Connectivity
1)Register the Driver class
2)Create connection
3)Create statement
4)Execute queries
5)Close connection

