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
     - ```
          interface Predicate<T> {
             public boolean test(T t);    
          }
       ```
     - 
   - Function
     - ```
        interface Function<T, R>{
            public R apply(T t);
        }
       ```

   - Consumer
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


