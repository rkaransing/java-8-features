package functional_interfaces;

/*
 * @author Karansing Rajput
 * @version 1.0
 * @since 11/10/23, 1:29 pm
 */

import java.util.function.Consumer;

public class ConsumerHelloWorld {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Hey, " + s);
        consumer.accept("Karansing.");
    }
}
