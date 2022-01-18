package java_8_exmp.udemy;

public class primitiveTypes extends AbstractClass {
    /**
     * Variables to store the data.
     * DataTypes are used to specify the data with allocated space.
     * In order => byte(8bit), short(16bit), int(32bit), long(64bit), float, double
     * PrimitiveTypes : byte, short, int, long  => float, double.
     * Wrapper Classes : Byte, Short, Integer, Long, Float, Double, String
     * Floating && primitive types : float, double
     * boolean, Boolean
     * char, Char
     */
    public static void main(String[] args) {

        int minIntVal = Integer.MIN_VALUE;
        int maxIntVal = Integer.MAX_VALUE;
        System.out.println("int min val : "+minIntVal);
        System.out.println("int max val : "+maxIntVal);
        System.out.println("burst int val : "+(minIntVal-1)); //It's flowing 
        System.out.println("burst int val : "+(maxIntVal+1)); //It's flowing

        System.out.println("\nbyte min val : "+Byte.MIN_VALUE);
        System.out.println("byte max val : "+Byte.MAX_VALUE);

        System.out.println("\nshort min val : "+Short.MIN_VALUE);
        System.out.println("short max val : "+Short.MAX_VALUE);

        System.out.println("\nlong min val : "+Long.MIN_VALUE);
        System.out.println("long max val : "+Long.MAX_VALUE);

        System.out.println("\nFloat min val : "+Float.MIN_VALUE);
        System.out.println("Float max val : "+Float.MAX_VALUE);

        System.out.println("\nDouble min val : "+Double.MIN_VALUE);
        System.out.println("Double max val : "+Double.MAX_VALUE);

        int i = Integer.parseInt("20");
        System.out.println(i);

        Integer intVal = 20;
        System.out.println(intVal);
    }

    @Override
    public void abstractMethod() {
    }

}
