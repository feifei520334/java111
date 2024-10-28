public class lab4task6 {
    public static void main(String[] args){
        int x= 1;
        System.out.println("Before the call,xis "+ x);
        increment(x);
        System.out.println("After the call, x is " + x);
}
public static void increment(int n){
    n++;
    System.out.println("n inside the method is " + n);
}
}