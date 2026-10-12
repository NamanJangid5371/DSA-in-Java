import java.util.Scanner;

public class Break{
    public static void main(String[] args){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
        sc.close();
    }
}