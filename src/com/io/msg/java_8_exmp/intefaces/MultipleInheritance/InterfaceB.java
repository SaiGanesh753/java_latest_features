package java_8_exmp.intefaces.MultipleInheritance;

public interface InterfaceB {

    default void sample() {
        System.out.println("Interface B");
    }
}
