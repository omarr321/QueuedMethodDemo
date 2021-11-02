import java.lang.reflect.Method;

/**
 * This is the main class that is used to demonstrate the idea at hand.
 *
 * @author Omar M. Radwan
 * @version Demo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting static example...");

        System.out.print("Getting Methods...");
        Method favNum = null;
        Method favAnimal = null;
        Method printName = null;
        try {
            favNum = ExampleMethodsStatic.class.getMethod("favNum", int.class);
            favAnimal = ExampleMethodsStatic.class.getMethod("favAnimal", String.class);
            printName = ExampleMethodsStatic.class.getMethod("printName", String.class);
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

        System.out.println("Starting dynamic example...");

        System.out.print("Getting Methods...");
        favNum = null;
        favAnimal = null;
        printName = null;
        try {
            favNum = ExampleMethodsDynamic.class.getMethod("setFavNum", int.class);
            favAnimal = ExampleMethodsDynamic.class.getMethod("setFavAnimal", String.class);
            printName = ExampleMethodsDynamic.class.getMethod("setName", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("DONE!");

        System.out.print("Creating ExampleMethodsDynamic \"exDyn\"...");
        ExampleMethodsDynamic exDyn = new ExampleMethodsDynamic();
        System.out.println("DONE!");

        System.out.print("Creating MethodWrapper for favNum...");
        favNumW = new MethodWrapper(favNum, exDyn);
        favNumW.addArg(124);
        System.out.println("DONE!");

        System.out.print("Creating MethodWrapper for favAnimal...");
        favAnimalW = new MethodWrapper(favAnimal, exDyn);
        favAnimalW.addArg("dog");
        System.out.println("DONE!");

        System.out.print("Creating MethodWrapper for printName...");
        printNameW = new MethodWrapper(printName, exDyn);
        printNameW.addArg("Bill");
        System.out.println("DONE!");

        System.out.print("Creating TestClass \"test\" instance...");
        test = new TestClass();
        System.out.println("DONE!");

        System.out.print("Adding methods to \"test\"...");
        test.addMethod(printNameW);
        test.addMethod(favAnimalW);
        test.addMethod(favNumW);
        System.out.println("DONE!");

        System.out.println("Values before test run...");
        exDyn.run();

        System.out.println("Running \"test\"...");
        test.run();

        System.out.println("Values after test run...");
        exDyn.run();
    }
}
