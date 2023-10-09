package lambda_functions;

/*
 * @author Karansing Rajput
 * @version 1.0
 * @since 08/10/23, 7:35 pm
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingUsingFunctionalInterfaceAndLambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(66, 77, 11, 0, 22));
        System.out.println("Before sorting : " + integerList);

        Comparator<Integer> comparator = (firstInteger, secondInteger) -> (firstInteger < secondInteger) ? -1 : (firstInteger > secondInteger) ? 1 : 0;
        integerList.sort(comparator);

        System.out.println("After sorting : " + integerList);
    }
}