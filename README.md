# Java 8 features

 - Lambda expressions were first used in LISP language.
 - Lambda Expression is nothing but an anonymous functions (function without name, modifier and return type).
 - We use functional interfaces to access lambda expressions. 
 - Interfaces contains only single abstract method (SAM).
 - Are lambda expression internally converted into .class file -> NO


 - Why we need default methods -> Without affecting implementation classes if we want to add new methods to the interface in that case we need default methods (To extend interface functionality).
 - Why we need static modifier -> To define general utility methods inside interface. (These methods by default not available to the implementation classes)
 - Predefined functional interfaces
   - Predicate 
     - `Predicate<T>` returns`boolean`.
     - ```
          interface Predicate<T> {
             public boolean test(T t);    
          }
       ```
   - Function
     - `Function<T, R>` returns`R`.
     - ```
        interface Function<T, R>{
            public R apply(T t);
        }
       ```
       
     - Function chaining is possible because of which we can form complex functions, example: <code>f1.andThen(f2).apply(i), f1.compose(f2).apply(i)</code>
       - In case of `andThen` first the `f1` is executed with passed input and then `f2` is executed with the value we got from `f1`.
       - In case if `compose` first `f2` will be executed with manually passed argument value and then `f1` will be executed with the output of `f2`.
       - Check class `FunctionChaining` for the example. 

   - Consumer
     - `Consumer<T>` does not return anything.
     - ```
        interface Consumer<T>{
            public void accpet(T t);
        }
       ``` 
     - 
   - Supplier
 - Two argument predefined functional interfaces
   - BiPredicate
   - BiFunction
   - BiConsumer
 - Primitive functional interfaces
   - IntPredicate
   - IntFunction
   - IntConsumer
 - `java.util.function` contains many predefined functional interfaces.


