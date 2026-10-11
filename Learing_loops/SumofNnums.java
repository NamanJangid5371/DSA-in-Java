import java.util.*;
public class SumofNnums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to add: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of N numbers: " + sum);
        sc.close();
    }
}