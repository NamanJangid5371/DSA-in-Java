import java.util.Scanner;

public class syntaxparameters{
    public static void sum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("the sum of 2 numbers:" + sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int a = sc.nextInt();
        System.out.println("Enter the num2: ");
        int b = sc.nextInt();
        sum(a,b);
        System.out.println("Enter the num1: ");
        int c = sc.nextInt();
        System.out.println("Enter the num2: ");
        int d = sc.nextInt();
        sum(c,d);
        sc.close();

    }
}