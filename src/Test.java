import java.util.concurrent.atomic.AtomicLong;

public class Test {

    public static void main(final String[] args) {
        final AtomicLong longValue = new AtomicLong(123L);
        System.out.println("longValue = " + longValue);
    }
}
