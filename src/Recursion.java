public class Recursion {

    public static void fib(int n) {
        if(n>0){
            System.out.println(n);
            fib(n-1);
        }
    }
    public static void main(String[] args) {
        fib(5);
    }
}
