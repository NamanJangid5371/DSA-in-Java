import java.util.Scanner;

public class PrintNumberFrom1toN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your favouret number: ");
        double N = sc.nextInt();
        int counter = 1;

        while (counter<=N) {
            System.out.println(counter + " ");
            counter++;            
        }
        sc.close();


    }
}