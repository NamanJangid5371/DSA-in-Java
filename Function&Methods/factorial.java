public class factorial{
    public static int fact(int n){
        int f=1;
        for (int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args){
        int n = 4;
        int fac = fact(n);
        System.out.println("Factorial of "+n+" is: "+fac);
    }
}