package Arrays;

public class SlidingWindowsProblems {


    static int findMaxSumSubArray(int [] a,int k){
        int maxValue    =   Integer.MIN_VALUE;
        int currentSum  =   0;
        for (int i = 0; i < a.length ; i++) {
            currentSum  =   currentSum  +   a[i];
            if(i    -   (k  -   1)  >=  0){
                maxValue    =   Math.max(maxValue   ,   currentSum);
                currentSum  =   currentSum  -   a[i -   (k  -   1)];
            }
        }
        return  maxValue;
    }


    static int findSmallestSubArrayWithTargetedSum(int[] a, int targetSum){

        int minValue    =   Integer.MAX_VALUE;

        int windowStart =   0;
        int windowEnd   =   0;
        int currentSum  =   0;
        for(windowEnd   =   0;windowEnd <   a.length;   windowEnd++){
            currentSum  =   currentSum  +   a[windowEnd];

                while(currentSum   >=   targetSum)  {

                    minValue = Math.min(minValue, (windowEnd - windowStart + 1));
                    currentSum = currentSum - a[windowStart];
                    windowStart++;

            }
        }
       return   minValue;
    }
    public static void main(String[] args) {

        System.out.println(findMaxSumSubArray(new int[]{4,2,1,7,8,1,2,8,1,1,0},3));
        System.out.println(findSmallestSubArrayWithTargetedSum(new  int[]   {4,2,2,1,7,8,2,4},8));
    }
}
