package java_8_exmp.intefaces.imps;

import java_8_exmp.intefaces.DefaultMethodInterface;

public class SampleBOverrideSampleMethod implements DefaultMethodInterface {

    @Override
    public void sample() {
        System.out.println("sample implements default method interface...");
    }

    public static void main(String[] args) {
        SampleBOverrideSampleMethod obj = new SampleBOverrideSampleMethod();
        obj.sample();
    }
}
