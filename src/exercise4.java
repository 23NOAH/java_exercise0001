import java.util.ArrayList;
import java.util.Arrays;

public class exercise4 {
    public static void main(String[] args) {
        // Q5  리스트와 객체
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        //ArrayList<Integer> b = a;
        ArrayList<Integer> b = new ArrayList<>(a);
        a.add(4);
        System.out.println(b.size());
        System.out.println(a==b);
    }
}
