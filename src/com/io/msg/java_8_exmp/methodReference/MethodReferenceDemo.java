package java_8_exmp.methodReference;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        PrintStatement printStatement = new PrintStatement();
        printStatement.print("Hello World", new Parse() {
            @Override
            public String parseStr(String str) {
                return ParseString.parseStr(str);
            }
        });

        //Converted into lambda expression with method reference
        printStatement.print("SAi Ganesh", ParseString::parseStr);
    }
}

interface Parse {
    String parseStr(String str);
}

class ParseString {
    public static String parseStr(String str) {
        return str.toUpperCase();
    }
}
class PrintStatement {
    public void print(String str, Parse parse) {
        str = parse.parseStr(str);
        System.out.println(str);
    }
}
