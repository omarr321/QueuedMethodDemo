import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * This is a wrapper class that can store a method and its arguments together.
 *
 * @author Omar M. Radwan
 * @version Demo
 */
public class MethodWrapper {
    private Object[] args = new Object[10];
    private Method method;
    private int count = 0;

    public MethodWrapper(Method method) {
        this.method = method;
    }

    public void addArg(Object arg) {
        args[count] = arg;
        count++;
    }

    public void run() {
        Object[] arg = Arrays.copyOfRange(args, 0, count);
        try {
            method.invoke(null, arg);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
