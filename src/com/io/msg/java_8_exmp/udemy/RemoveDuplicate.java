package java_8_exmp.udemy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    /**
     * Create list with duplicate values, Then print list values without duplicate.
     */

    public static void main(String[] args) {
        //Before java8
        List<String> listOString = new ArrayList<>(0);
        listOString.add("krishna");
        listOString.add("sai");
        listOString.add("ganesh");
        listOString.add("sai");

        List<String> nonDupList = new ArrayList<>(0);
        Iterator<String> stringIterator = listOString.iterator();
        while(stringIterator.hasNext()) {
            String val1 = stringIterator.next();
            if (!nonDupList.contains(val1)) {
                nonDupList.add(val1);
            }
        }

        //From java8
        List<String> nonDupList1 = listOString.stream().distinct().collect(Collectors.toList());
    }

}
