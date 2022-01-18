package java_8_exmp.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractClass {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(0);
        stringList.add("a");
        stringList.add("bI");
        stringList.add("a");
        List<String> nonDupList = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println("stringList : "+stringList);
        System.out.println("nonDupList : "+nonDupList);
        /*Iterator<String> stringIterable = stringList.iterator();
        while(stringIterable.hasNext()) {
            String val1 = stringIterable.next();
            if (!nonDupList.contains(val1)) {
                nonDupList.add(val1);
            }
        }
        System.out.println("nonDup list : "+nonDupList);*/
    }
    public abstract void abstractMethod();
    public int m1(int a, int b) {return 0;}

}
