package Arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    static void twoNumberSum(int[] a, int sum){
        int temp =0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            temp = sum-a[i];
            if(set.contains(temp)){
                System.out.println("The pair of 9 is: ("+a[i]+","+temp+")");
                break;
            }
            set.add(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,7,2,3,4,1};
        int sum =9;
        twoNumberSum(a,sum);
    }
}
