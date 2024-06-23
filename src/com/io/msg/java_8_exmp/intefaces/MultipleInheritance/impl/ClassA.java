package java_8_exmp.intefaces.MultipleInheritance.impl;

import java_8_exmp.intefaces.MultipleInheritance.InterfaceA;
import java_8_exmp.intefaces.MultipleInheritance.InterfaceB;

public class ClassA implements InterfaceA, InterfaceB {
    //If two parent interfaces have same method declaration, we should implement the parent method.

    //In this case multiple inheritance is not possible. to overcome this issue.
    //Developer provide method define here.

    @Override
    public void sample() {
        System.out.println("override method in sub class...");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.sample();
    }
}
