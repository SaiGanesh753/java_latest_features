package java_8_exmp.udemy;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class CharBoolean {
    public static void main(String[] args) {
        /**
         * char and boolean are the primitive types.
         * char type will define a single character, and it optimizes 2 bytes because it's support to store UniCodes.
         * UniCode its represents a uniquely defined codes. almost 6500+ uni-codes are exists to support diff languages.
         * Each single uniCode can place in Char property.
         */
        char myCharVal = 'D';
        System.out.println("myCharVal : "+myCharVal);
        char uniChar = '\u0040';
        System.out.println("uniChar : "+uniChar);

        /**
         * boolean primitive type having two fixed values either it's stores true or false.
         * in application boolean type plays a key role
         */

        boolean myBooleanValTure = true;
        boolean myBooleanValFalse = false;
       // boolean myBooleanVal1 = 1; can't assign int to boolean
       // boolean myBooleanVal0 = 0; can't assign int to boolean
        boolean myBooleanValTRUE = TRUE; // Assigning a static variable , Boolean object ref with true val.
        boolean myBooleanValFALSE = FALSE; // Assigning a static variable.
        System.out.println("myBooleanValTure : "+myBooleanValTure);
        System.out.println("myBooleanValFalse : "+myBooleanValFalse);
        System.out.println("myBooleanValTRUE : "+myBooleanValTRUE);
        System.out.println("myBooleanValFALSE : "+myBooleanValFALSE);

    }
}
