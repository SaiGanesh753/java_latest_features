package java_8_exmp.intefaces.MultipleInheritance;

public interface InterfaceA {

    default void sample() {
        System.out.println("Interface A");
    }

    static void sampleStaticMethod() {
        System.out.println("this is interface static method.");
    }
}
