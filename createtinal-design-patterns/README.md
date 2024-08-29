There are five creational design patterns that we will discuss.

### Singleton Pattern

To implement Singleton pattern, we have different approaches but all of
them have following common concepts.

- Private constructor to restrict instantiation of the class from other
  classes.
- Private static variable of the same class that is the only instance of the
  class.
- Public static method that returns the instance of the class, this is the
  global access point for outer world to get the instance of the singleton
  class.

    1. **Eager Initialized Singleton**:
        - Singleton class is not using a lot of resources. But in most of the scenarios, Singleton classes are created
          for resources such as File System, Database connections etc and we should avoid the
          instantiation until unless client calls the getInstance method.
        - Method doesn't provide any options for exception handling.
    2. **Static Block Initialization**: similar eager initialization, except that instance of class is created in the
       static
       block that provides option for exception handling.
    3. **Lazy Initialization**: Lazy initialization method to implement Singleton pattern creates the instance in the
       global
       access method.
        - Works fine in case of single threaded
    4. **Thread Safe Singleton**
        - implementation works fine and provides thread-safety but it reduces the performances because of cost
          associated with the synchronized method
    5. **Bill Pugh Singleton Implementation**
        - Prior to Java 5, java memory model had a lot of issues and above approaches
          used to fail in certain scenarios where too many threads try to get the
          instance of the Singleton class simultaneously. So Bill Pugh came up with a
          different approach to create the Singleton class using an inner static helper
          class. The Bill Pugh Singleton implementation goes like this;
        - Notice the private inner static class that contains the instance of the
          singleton class. When the singleton class is loaded, SingletonHelper class is
          not loaded into memory and only when someone calls the getInstance
          method, this class gets loaded and creates the Singleton class instance.
        - This is the most widely used approach for Singleton class as it doesn’t
          require synchronization. I am using this approach in many of my projects
          and it’s easy to understand and implement also.
    6. **Using Reflection to destroy Singleton Pattern**
    7. **Enum Singleton**

> Both **eager initialization** and **static block initialization** creates the instance
> even before it’s being used and that is not the best practice to use. So in
> further sections, we will learn how to create Singleton class that supports
> lazy initialization.

2. Factory Pattern
3. Abstract Factory Pattern
4. Builder Pattern
5. Prototype Pattern