/**
 * This is class is what the methods gets added to so it can run.
 *
 * @author Omar M. Radwan
 * @version Demo
 */
public class TestClass {
    private MethodWrapper[] methods = new MethodWrapper[10];
    private int count = 0;

    public TestClass() {}

    public void addMethod(MethodWrapper method) {
        methods[count] = method;
        count++;
    }

    public void run() {
        for(int i = 0; i < count; i++) {
            methods[i].run();
        }
    }
}
