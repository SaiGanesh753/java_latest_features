package java_8_exmp.udemy;

public interface InterfaceDemo {

    public void printName();
    default public void strength() {
        System.out.println("its a dummy implementation");
    }
}
