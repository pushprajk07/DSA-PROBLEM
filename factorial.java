public class factorial {
    public static int factorialp(int n){
        int fact=n;
        if (n==0){
            return 1;  //base case:factorial of 0is 1
        }
        fact = fact*factorialp(n-1);
        return fact;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(factorialp(n));
    }
}
