package java_8_exmp.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; //its a functional interface and it contains only one method ie, accept()

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        //Internal forloop will take Consumer object.
        Consumer<Integer> cons = new Consumer<Integer>() { //Anonymous inner class
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        values.forEach(cons); // cons -> Consumer object.
//        values.forEach(i -> System.out.println(i));
    }
}
