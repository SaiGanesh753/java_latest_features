package java_8_exmp.udemy.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {
    public static void main(String[] args) {
        /**
         * In coming to Wrapper classes. it's already implemented by Comparable interface.
         */
        List<String> stringsList = new ArrayList<>();
        stringsList.add("sai");
        stringsList.add("ganesh");
        stringsList.add("aaa");
        Collections.sort(stringsList);
        System.out.println("Comparable list : "+stringsList);

        List<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike("hero", 2022, 100));
        bikes.add(new Bike("bajaj", 2020, 1000));
        bikes.add(new Bike("ganesh", 2050, 10));

        Collections.sort(bikes); //Comparable
        System.out.println("Comparable bikes list : "+bikes);

        Collections.sort(bikes, new Comparator<Bike>() { //Comparator
            @Override
            public int compare(Bike b1, Bike b2) {
                return b2.getbName().compareTo(b1.getbName());
            }
        });
        System.out.println("Comparator bikes : "+bikes);
    }
}
