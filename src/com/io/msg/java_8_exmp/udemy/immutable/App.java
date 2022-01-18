package java_8_exmp.udemy.immutable;

public class App {
    public static void main(String[] args) {
        /**
         * What is immutable object
         * 1. Once the object is created, it can't be changed.
         * JVM : once the object is constructed, and it's state can't be changed.
         */

        AddressMutable homeAddress = new AddressMutable("eluru", "AP");
        StudentImmutable student = new StudentImmutable(1, "sai", homeAddress);
        System.out.println("student : "+student);

        AddressMutable address = student.getAddressMutable();
        address.setCity("Hyd");
        address.setState("TS");

        System.out.println("student : "+student);

        String str1 = "ganesh"; //ex : it's inserting the data in heapmap with 101 ref.
        String str2 = "ganesh"; // ex : it's inserting in the heatmap with 102 ref.
        System.out.println("str1 : "+str1.hashCode());
        System.out.println("str2 : "+str2.hashCode());
        str1 = "sai"; // ex: in this case it's not creating
        System.out.println("str1 : "+str1.hashCode());
        String str3 = "ganesh";
        System.out.println("str3 : "+str3.hashCode());
    }
}
