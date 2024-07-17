package java_8_exmp;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "sdfkaabaajaslfdkjamadamlsfdja";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));
            if (i + 5 < str.length()) {
                String subString = str.substring(i, i + 5);
                String reverseStr = new StringBuilder(subString).reverse().toString();
                if (subString.equals(reverseStr)) {
                    System.out.println("Is palindrome string : " + subString);
                    // break;
                }
            }
        }
    }
}
