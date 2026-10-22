import java.util.Scanner;

public class createion {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int num[] = {1,2,3};
        int morenumbers[] = {4,5,6};
        String fruits[] = {"Apple","Watermelon","Orange"};
        for (int i = 0;i<num.length;i++){
            System.out.println("Eelments of array num: "+num[i]);
        }
        for (int i=0;i<morenumbers.length;i++){
            System.out.println("Elements of array more numbers: "+morenumbers[i]);
        }
        for (int i=0;i<fruits.length;i++){
            System.out.println("Elements of array more fruits: "+fruits[i]);
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<marks.length; i++){
            System.out.println("Enter the elements in marks array:");
            marks[i] = sc.nextInt();
            
        }
        sc.close();
        for (int i = 0; i<marks.length; i++){
            System.out.println("Eneter the element in marks array: ");
            System.out.println(marks[i]);
        }
    }
}