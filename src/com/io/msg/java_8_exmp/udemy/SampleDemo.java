package java_8_exmp.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class SampleDemo {
    public static void main(String[] args) throws CustomException {
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

        m1(10);
    }
    public abstract void abstractMethod();

    public static int m1(int a) throws CustomException{
        int i = 0;
        if (i ==0) {
            throw new CustomException("check once..");
        }
        return i;
    }
    public int m1(int a, int b) {return 0;}

}
