public class DataType{
    /* A literal is a source code representation of a fixed value. 
    They are represented directly in the code without any computation. */
    static byte a = 68;
    static char b = 'A';

    /*
    byte, int, long, and short can be expressed in decimal(base 10), 
    hexadecimal(base 16) or octal(base 8) number systems as well.
    Prefix 0 is used to indicate octal, and prefix 0x indicates 
    hexadecimal when using these number systems for literals. For example −
    */
    static int decimal = 100;
    static int octal = 0144;
    static int hexa =  0x64;

    /*
    String literals in Java are specified like they are in most other languages 
    by enclosing a sequence of characters between a pair of double quotes. 
    Examples of string literals are −
    */

    static char thechar = '\u0042';
    static String thestring = "\u1080";

    public static void main(String args[]){
    System.out.println(a);
    System.out.println(b);

    System.out.println(decimal);
    System.out.println(octal);
    System.out.println(hexa);

    System.out.println(thechar);
    System.out.println(thestring);
    }
}