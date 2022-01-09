package java_8_exmp.udemy;

public class FloatDouble {
    public static void main(String[] args) {

        /**
         * float and double are the floating types and in primitive types.
         * float and double are best to perform general calculations. we are not using all time calculation because
         * those primitive types having some limitation and precision errors. For real time calculations and application wise we as to use
         * BigData class. it's a simple class to perform realtime application wise calculations.
         */

        float floatMaxVal = Float.MAX_VALUE;
        float divNumber = floatMaxVal/2;
        float divNumber1 = floatMaxVal/2.0f;
        double divNumber2 = floatMaxVal/1.0;
        double divNumber3 = floatMaxVal/2.2f;
        System.out.println("floatMaxVal : "+floatMaxVal);
        System.out.println("divNumber by int "+divNumber);
        System.out.println("div by float : "+divNumber1);
        System.out.println("div by float without sign : "+divNumber2);
        System.out.println("div by float without sign : "+divNumber3);

    }
}
