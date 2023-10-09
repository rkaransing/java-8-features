package lambda_functions;

/*
 * @author Karansing Rajput
 * @version 1.0
 * @since 08/10/23, 7:35 pm
 */

import java.util.function.Function;

public class ConvertStringToUpperCaseUsingFunction {
    public static void main(String[] args) {
        Function<String, String> uppercase = s -> s.toUpperCase();
        System.out.println(uppercase.apply("karansing rajput"));
    }
}
