import java.util.Scanner;

public class even_or_odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
        sc.close();
    }
}