package java_8_exmp.interviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sai";
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }
}
