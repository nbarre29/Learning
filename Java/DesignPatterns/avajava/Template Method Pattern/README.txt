http://www.avajava.com/tutorials/lessons/template-method-pattern.html

A behavioral design pattern uses inheritance for distribution of behavior. In the template method pattern, a method (the 'template method') defines the steps of an algorithm. The implementation of these steps (ie, methods) can be deferred to subclasses. Thus, a particular algorithm is defined in the template method, but the exact steps of this algorithm can be defined in subclasses. The template method is implemented in an abstract class. The steps (methods) of the algorithm are declared in the abstract class, and the methods whose implementations are to be delegated to subclasses are declared abstract.


Meal.java:
Meal is an abstract class with a template method called doMeal() that defines the steps involved in a meal. We declare the method as final so that it can't be overridden. The algorithm defined by doMeal() consists of four steps: prepareIngredients(), cook(), eat(), and cleanUp(). The eat() method is implemented although subclasses can override the implementation. The prepareIngredients(), cook(), and cleanUp() methods are are declared abstract so that subclasses need to implement them.

HamburgerMeal.java:
The HamburgerMeal class extends Meal and implements Meal's three abstract methods.

TacoMeal.java:
The TacoMeal class implements Meal's three abstract methods and also overrides the eat() method.

Demo.java:
The Demo class creates a HamburgerMeal object and calls its doMeal() method. It creates a TacoMeal object and calls doMeal() on the TacoMeal object.

As we can see, the template method design pattern allows us to define the steps in an algorithm and pass the implementation of these steps to subclasses.


References:
https://en.wikipedia.org/wiki/Template_method_pattern