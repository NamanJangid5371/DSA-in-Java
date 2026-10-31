public class Bubble {
    public static void bubbleSort(int arr[]){
        int swap = 0;
        for (int turns = 0;turns<arr.length-1; turns++){
            for (int j=0;j<arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                }
                swap ++;
            }
        }
        System.out.println("Total Swaps: "+swap);

    }

    public static void printbubble(int arr[]){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printbubble(arr);
    }
}