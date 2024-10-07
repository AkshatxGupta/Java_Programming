public class Maxsubarraysum_bruteforce {
    public static int maxsubarraysum(int numbers[]) {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<numbers.length; i++) {
            int start =i;
            for(int j=i;j<numbers.length; j++){
                int end = j;
                for(int k =start; k<=end ;k++) {//print
                    //subarray sum
                    currSum+=numbers[k];
                }
                // System.out.println(currSum);
                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxsubarraysum(numbers);
    }
}
