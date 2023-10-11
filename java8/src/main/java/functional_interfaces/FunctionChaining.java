package functional_interfaces;

/*
 * @author Karansing Rajput
 * @version 1.0
 * @since 11/10/23, 1:28 pm
 */

/*
 * @author Karansing Rajput
 * @version 1.0
 * @since 11/10/23, 1:03 pm
 */

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> functionOne = input -> 2 * input;
        Function<Integer, Integer> functionTwo = input -> input * input * input;

        System.out.println(functionOne.andThen(functionTwo).apply(2));
        System.out.println(functionTwo.andThen(functionOne).apply(2));
    }
}
