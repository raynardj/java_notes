import java.lang.Math;

public class ArrayTest {
    public static void main(String args[])
    {
        double[] Counting  = new double[20];
        for(int i=0; i< Counting.length; i++)
        {
            Counting[i] = Math.pow(2,i);
        }
        for (double i:Counting){
            System.out.println(i);
        }
        
    }
}