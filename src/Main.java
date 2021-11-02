import java.lang.reflect.Method;

/**
 * This is the main class that is used to demonstrate the idea at hand.
 *
 * @author Omar M. Radwan
 * @version Demo
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Getting Methods...");
        Method favNum = null;
        Method favAnimal = null;
        Method printName = null;
        try {
            favNum = ExampleMethods.class.getMethod("favNum", int.class);
            favAnimal = ExampleMethods.class.getMethod("favAnimal", String.class);
            printName = ExampleMethods.class.getMethod("printName", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("DONE!");

        System.out.print("Creating MethodWrapper for favNum...");
        MethodWrapper favNumW = new MethodWrapper(favNum);
        favNumW.addArg(32);
        System.out.println("DONE!");

        System.out.print("Creating MethodWrapper for favAnimal...");
        MethodWrapper favAnimalW = new MethodWrapper(favAnimal);
        favAnimalW.addArg("cat");
        System.out.println("DONE!");

        System.out.print("Creating MethodWrapper for printName...");
        MethodWrapper printNameW = new MethodWrapper(printName);
        printNameW.addArg("Omar");
        System.out.println("DONE!");

        System.out.print("Creating TestClass \"test\" instance...");
        TestClass test = new TestClass();
        System.out.println("DONE!");

        System.out.print("Adding methods to \"test\"...");
        test.addMethod(printNameW);
        test.addMethod(favAnimalW);
        test.addMethod(favNumW);
        System.out.println("DONE!");

        System.out.println("Running \"test\"...");

        test.run();
    }
}
