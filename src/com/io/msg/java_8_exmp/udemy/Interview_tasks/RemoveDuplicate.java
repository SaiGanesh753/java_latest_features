package java_8_exmp.udemy.Interview_tasks;

import java.util.ArrayList;
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
        for (String val1 : listOString) {
            if (!nonDupList.contains(val1)) {
                nonDupList.add(val1);
            }
        }

        //From java8
        List<String> nonDupList1 = listOString.stream().distinct().collect(Collectors.toList());
        System.out.println("nonDupList1 : "+nonDupList1);
    }

}
