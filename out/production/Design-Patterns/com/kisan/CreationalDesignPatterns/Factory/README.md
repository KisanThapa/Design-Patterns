####1. When to use factory pattern?
Factory pattern introduces loose coupling between classes which is the most important principle one should consider and apply while designing the application architecture. Loose coupling can be introduced in application architecture by programming against abstract entities rather than concrete implementations. This not only makes our architecture more flexible but also less fragile.

If we are unfortunate then we will create instances of car types (e.g. SmallCar) in our application classes and thus we will expose the car building logic to the outside world and this is certainly not good. It also prevents us in making changes to car making process because the code is not centralized, and making changes in all composing classes seems not feasible.

####2. Benefits of factory pattern
By now, you should be able to count the main advantages of using the factory pattern. Let’s note down:

The creation of an object precludes its reuse without significant duplication of code.
The creation of an object requires access to information or resources that should not be contained within the composing class.
The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.

####3. Final notes
Factory pattern is most suitable where there is some complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used. We can see many realtime examples of factory pattern in JDK itself e.g.

`java.sql.DriverManager#getConnection()`

`java.net.URL#openConnection()`

`java.lang.Class#newInstance()`

`java.lang.Class#forName()`