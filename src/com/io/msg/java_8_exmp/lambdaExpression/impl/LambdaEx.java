package java_8_exmp.lambdaExpression.impl;

import java_8_exmp.lambdaExpression.InterfaceA;

public class LambdaEx {

    public static void main(String[] args) {
        InterfaceA obj = new InterfaceA() { //Its called inner call without having name.
            //ie, Anonymous inner class.
            @Override
            public void sample() {
                System.out.println("Hello...");
            }
        };
        obj.sample();
        //Note : The above will generate 2 ".class" files ie, LambdaEx.class, LambdaEx$.class

        //We can replace interface implementation without any class block by using lambda expression.
        InterfaceA intA = () -> System.out.println("Hello...");
        intA.sample();
        //The above lambda expression, it's replaced boilerplate code and will generate only one .class file.
    }
}
