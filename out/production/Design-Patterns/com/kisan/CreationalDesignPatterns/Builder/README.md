####1. Builder Design Pattern:
The builder pattern, as name implies, is an alternative way to construct complex objects. This should be used only when you want to build different immutable objects using same object building process.

Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.”

####2. Where we need Builder Pattern:
We already know the benefits of immutability and immutable instances in application. If you have any question over it, the please let me remind you of String class in java. And as I already said, builder pattern helps us in creating immutable classes with large set of state attributes.
       
Let’s discuss a common problem in our application. In any user management module, primary entity is User, let’s say. Ideally and practically as well, once a user object is fully created, you will not want to change it’s state. It simply does not make sense, right? Now, let’s assume, our User object has following 5 attributes i.e. firstName, lastName, age, phone and address.

####3. Benefits and Advantages of Builder Pattern:
Undoubtedly, the number of lines of code increase at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code. The parameters to the constructor are reduced and are provided in highly readable method calls.
       
Builder pattern also helps minimizing the number of parameters in constructor and thus there is no need to pass in null for optional parameters to the constructor. It’s really attracts me.
       
Another advantage is that Object is always instantiated in a complete state rather than sitting in an incomplete state until the developer calls (if ever calls) the appropriate “setter” method to set additional fields.
       
And I finally I can build immutable objects without much complex logic in object building process.
       
####4. Costs and Disadvantages of Builder Pattern:
Though Builder pattern reduce some line of code buy eliminating the need of setter methods, still in double up total lines by introducing the Builder object. Furthermore, although client code is more readable, the client code is also more verbose. Though for me, readability weighs more than lines of code.
       
That’s only disadvantage I can think of.