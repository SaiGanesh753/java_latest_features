package java_8_exmp.interviewQuestions;

public class SeparateEvenOddNumbers {

    public static void main(String[] args) {
        int[] actualInp = {33, 2, 23, 22, 12, 10, 55, 45, 32};
        String oddStr = "";
        String evenStr = "";
        for (int i = 0; i < actualInp.length; i++) {
            if (actualInp[i] % 2 == 0) {
                if (evenStr == "") {
                    evenStr = evenStr + actualInp[i];
                } else {
                    evenStr = evenStr + ", " + actualInp[i];
                }
            } else {
                if (oddStr == "") {
                    oddStr = evenStr + actualInp[i];
                } else {
                    oddStr = oddStr + ", " + actualInp[i];
                }
            }
        }
        String[] oddArr = oddStr.split(" ");
        String[] evenArr = evenStr.split(" ");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i]);
        }
        System.out.println();
        for (int i = 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i]);
        }
    }
}
