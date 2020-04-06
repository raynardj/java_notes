import java.util.BitSet;
/*
The BitSet class implements a group of bits or flags that can be set and cleared individually.

This class is very useful in cases where you need to keep up with a set of Boolean values; 

you just assign a bit to each value and set or clear it as appropriate.

true: has value

false: don't have value
*/
public class BitSetTest {
    public static void main(String args[]){
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for (int i = 0;i<16;i++){
            if((i%2)==0) bits1.set(i);
            if((i%5)!=0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nAND Bit");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nOR Bit");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nXOR Bit");
        System.out.println(bits2);

    }
}