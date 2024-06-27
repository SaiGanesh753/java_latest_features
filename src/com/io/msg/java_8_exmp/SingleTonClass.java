package java_8_exmp;

public class SingleTonClass {

    private SingleTonClass() {

    }

    public static SingleTonClass SINGLE_TAN_CLASS = null;

    public static SingleTonClass getInstance() {
        if (SINGLE_TAN_CLASS == null) {
            SINGLE_TAN_CLASS = new SingleTonClass();
        }
        return SINGLE_TAN_CLASS;
    }
}
