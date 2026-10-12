import java.util.Scanner;

public class Primeno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to checke weather it is prime or not: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i<=n-1; i++){
            if (n%i==0){
                isPrime = false;
            }
        }
        if (isPrime==true){
            System.out.println("N is prime.");

        }
        else{
            System.out.println("N is not prime.");
        }
        sc.close();
    }
}