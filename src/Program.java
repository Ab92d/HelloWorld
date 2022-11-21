import java.sql.SQLOutput;(public class Program {
    public static void main(String[] args) { // psv
        String fullName = "Fred Flintstone";  // fullName is camel case
        String Lastname = "Flinstone";         // pascal case
        int age =30;                           // integer range=+-2 mil. byte,short,int,long
        System.out.println("Hello World");
        // print line forces a line after the text
        // case sensitive
        // always end code with ;
        // short cut- type 'sout'
        System.out.println(fullName + " is " + age + " years old!");
        System.out.println(fullName + " will be " + (age+1) + " years old next year");
    }
}

// comparisons
public class Program {
    public static void main(String[] args) {
        String name1 = "Fred";
        String name2 = "Fred";
        String name3 = "Barney";
        String name4 = "Fred";
        String name5 = "Fred";                      // for integers can do
        String name6 = new String("Fred");   // Integer age1 = new Integer(45);
        System.out.println(name1 == name6);         // dont use == as it allocated name1 name2 name4 and name5 to the location
        System.out.println(name1.equals(name6));    // use this instead
    }
}
