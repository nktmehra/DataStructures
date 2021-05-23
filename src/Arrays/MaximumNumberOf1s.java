package Arrays;

public class MaximumNumberOf1s {

    static  int    maxNumbersOf1(int[]  a){
        int maxValue    =   Integer.MIN_VALUE;
        int windowStart =   0;
        int windowEnd   =   0;
        int windowSize  =   0;

        for(windowEnd   =   0;windowEnd <   a.length;windowEnd++){
            if(a[windowEnd] ==  0){
                windowStart =   windowEnd   +   1;
            }
            windowSize  =   windowEnd   -   windowStart +1;
            maxValue    =   Math.max(windowSize ,   maxValue);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(maxNumbersOf1(new int[]{1,1,0,0,1,1,1,0,1,1,1,1,1}));
    }
}
