class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
}

public class ConsDemo {
    public static void main(String args[]){
        MyClass t1 = new MyClass(42);
        MyClass t2 = new MyClass(10086);
        System.out.println(t1.x + " " + t2.x);
    }
}