package fa.training.unit4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 5, 6, 12, 20);

        list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
        
        Set set = new TreeSet<>();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");

    }

}
