##Command Design Pattern
Command pattern is a behavioral design pattern which is useful to abstract business logic into discrete actions which we call commands. This command object helps in loose coupling between two classes where one class (invoker) shall call a method on other class (receiver) to perform a business operation.

####Introduction
In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action, a business operation or trigger an event e.g. method name, receiver object reference and method parameter values, if any. This object is called command.

The similar approach is adapted into chain of responsibility pattern as well. Only difference is that in command there is one request handler, and in chain of responsibility there can be many handlers for single request object.


####Design Participants
Participants for command design pattern are:

**Command interface** – for declaring an operation.

**Concrete command classes** – which extends the Command interface, and has execute method for invoking business operation methods on receiver. It internally has reference of the receiver of command.

**Invoker** – which is given the command object to carry out the operation.

**Receiver** – which execute the operation.
In command pattern, the invoker is decoupled from the action performed by the receiver. The invoker has no knowledge of the receiver. The invoker invokes a command, and the command executes the appropriate action of the receiver. Thus, the invoker can invoke commands without knowing the details of the action to be performed. In addition, this decoupling means that changes to the receiver’s action don’t directly affect the invocation of the action.


####Problem Statement
Suppose we need to build a remote control for home automation system which shall control different lights/electrical units of the home. A single button in remote may be able to perform same operation on similar devices e.g. a TV ON/OFF button can be used to turn ON/OFF different TV set in different rooms.

Here this remote will be a programmable remote, and it would be used to turn on and off various lights/fan etc.



####When to Use Command Pattern
You can use command pattern for solving many design problems e.g.

- Handling actions for Java menu items and buttons.
- Providing support for macros (recording and playback of macros).
- Providing “undo” support.
- Progress bars implementations.
- Creating multi-step wizards.



####Popular Command Pattern Implementations
These are some real world examples of command pattern implementations:

- Runnable interface (java.lang.Runnable)
- Swing Action (javax.swing.Action) uses command pattern
- Invocation of Struts Action class by Action Servlet uses command pattern internally.


####Summary
Command pattern is a behavioral design pattern.
In command pattern, an object is used to encapsulate all the information required to perform an action or trigger an event at any point time, enabling developer to decentralize business logic. It is called command.
Client talks to invoker and pass the command object.
Each command object has reference to it’s receiver.
Command’s execute() method invoke actual business operation defined in receiver.
receiver executes the business operation.
Here are some of the pros and cons of this pattern. It may help you in taking the right decision about using command pattern.


####Advantages
Makes our code scalable as we can add new commands without changing existing code.
Increase loose-coupling between the invoker and the receiver using the command object.


####Disadvantages
Increase in the number of classes for each individual command, in a different view. It may not be preferred in some specific scenarios.