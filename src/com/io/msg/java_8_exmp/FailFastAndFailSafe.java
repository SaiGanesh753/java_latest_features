package java_8_exmp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastAndFailSafe {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);

        // Fail-Fast: throws ConcurrentModificationException
        for (Integer val : list) {
            list.add(val);
        }

        // Fail-Safe: No exception
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.println("val : " + val);
            if (val == 2) {
                iterator.remove();
            }
        }

    }
}
