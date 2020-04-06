import java.util.Arrays;
public class ArrayMethod {
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        // two sets of progress in java
        for(int i =0, j= result.length-1;i<list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
    public static void print(int[] list){
        //print list 
        for(int i:list){
            System.out.print(i+"\t");
        }
        System.out.print("\n");
    }
    public static void main(String args[]){
        int[] aList = {1,2,3,4,5};
        print(aList);
        int[] bList = reverse(aList);
        print(bList);
        Arrays.sort(bList);
        print(bList);
        Arrays.fill(bList,42);
        print(bList);
    }
}