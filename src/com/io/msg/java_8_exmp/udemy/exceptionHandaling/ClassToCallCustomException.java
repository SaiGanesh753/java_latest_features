package java_8_exmp.udemy.exceptionHandaling;

public class ClassToCallCustomException {

    public static void main(String[] args) throws CustomException{
        int i = 10;
        if (i > 5) {
            System.out.println("i value is more than 5 call custom exception.");
            throw new CustomException("i value should not exceed 5.");
        }
    }
}
