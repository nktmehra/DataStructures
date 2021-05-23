package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        Set<Integer> set  = new HashSet<Integer>();
        for( int i =0;i<nums.length;i++){
            if(!set.contains(nums[i]))
            set.add(nums[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
