package java_8_exmp.steamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Write a Java program to calculate the average of a list of integers using streams.
public class AvrIntegersValues {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,1,4,2,4,2,22,33,22);
        Double avrgVal = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(avrgVal);
    }
}
