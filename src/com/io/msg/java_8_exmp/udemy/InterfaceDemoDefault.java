package java_8_exmp.udemy;

public interface InterfaceDemoDefault {

    public void printName();
    default public void strength() {
        System.out.println("its a dummy implementation");
    }
}
