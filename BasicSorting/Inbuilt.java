import java.util.*;
public class Inbuilt {
     public static void printInbuilt(int arr[]){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        printInbuilt(arr);
    }
}