import java.util.*;

public class VectorTest {
    /*Vector implements a dynamic array. It is similar to ArrayList, but with two differences −

            Vector is synchronized.

            ector contains many legacy methods that are not part of the collections framework.

            Vector proves to be very useful if you don't know the size of the array 
                
            in advance or you just need one that can change sizes over the lifetime of a program. 
    
     */
    public static void printVec(Vector v){
        Enumeration vEnum = v.elements();
        System.out.println("\n Elements in vector:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement()+" ");

        System.out.println();
    }
    public static void main(String args []){
        // initial size is 3, increment is 2
        Vector v = new Vector(3,2);
        System.out.println("Initial size:\t" + v.size());
        System.out.println("Initial capacity:\t" + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        printVec(v);

        v.addElement(new Double(5.45));
        printVec(v);

        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));

        printVec(v);
        

        System.out.println(v.contains(new Integer(3)));
    }
    
}