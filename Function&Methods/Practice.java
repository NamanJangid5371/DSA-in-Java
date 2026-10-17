import java.util.Scanner;

public class Practice {
    //Question 1
    // public static int avg(int a,int b,int c){
    //     int avg = (a+b+c)/3;
    //     return avg;
    // }
    //Question 2
    // public static boolean inEven(int n){
    //     if (n%2==0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    //Question 3
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome%10;
            reverse = reverse *10 +remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : "+palindrome+" is a palindrome");
        } else {
            System.out.println("Number : "+palindrome+ " is not a palindrome");
        }
        sc.close();
    }
    
}