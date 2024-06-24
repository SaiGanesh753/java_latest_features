package java_8_exmp.steamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().filter(i -> { //This one will not print any values because it's an intermediate method and lazy validation.
            System.out.println("Hello i");
            return true;
        });

        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println); //Will execution
        stream.forEach(System.out::println); // Will give illegalStateException we can't run stream object multiple times in stream api.
    }
}
