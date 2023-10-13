package functional_interfaces;

/*
 * @author Karansing Rajput
 * @version 1.0
 * @since 13/10/23, 11:16 am
 */

public class MethodReference {

    public static void runMethodImplementation(){
        for (int counter = 0; counter < 5; counter++){
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
        Runnable runnable = MethodReference::runMethodImplementation;

        /*
        * NOTE: In case of static method, syntax is `class_name::method_name`
        *       whereas for instance methods it is `object_reference::method_name`.
        * */

        Thread thread = new Thread(runnable);
        thread.start();

        for (int counter = 0; counter < 5; counter++){
            System.out.println("Main Thread");
        }
    }
}
