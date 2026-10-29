public class MaxSumSubarr {
    public static void maxSubarrSum(int numbers[]){
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                cursum = 0;
                
                for(int k=start; k<=end; k++){
                    cursum += numbers[k];
                }
                System.out.println(cursum);
                if (maxsum < cursum){
                    maxsum = cursum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }
   
        
    
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxSubarrSum(numbers);

    }
}