import java.util.*;
public class Inbuilt {
     public static void printInbuilt(Integer arr[]){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   
    public static void main(String args[]){
        Integer arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        // Arrays.sort(arr, 1 , 3);
        // Arrays.sort(arr,Collections.reverseOrder());//This will work on objective type declaration.
        printInbuilt(arr);
    }
}