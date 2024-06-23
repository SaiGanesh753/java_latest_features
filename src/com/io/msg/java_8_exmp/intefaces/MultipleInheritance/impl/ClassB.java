package java_8_exmp.intefaces.MultipleInheritance.impl;

import java_8_exmp.intefaces.MultipleInheritance.InterfaceA;
import java_8_exmp.intefaces.MultipleInheritance.InterfaceB;

public class ClassB extends ClassA implements InterfaceA, InterfaceB {

    //In this case multiple inheritance is possible.
    // In java class have more power when compare to interface.

    //There is no mandatory to implement default methods in child class.
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.sample();

        //we can define static methods inside interface and we can call the static method directly
        // with the interface name.
        InterfaceA.sampleStaticMethod();
    }
}
