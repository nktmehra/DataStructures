package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutivrSubsequence {


    static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxValue = 0;
        int currentNum = 0;
        int count = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                currentNum = num;
                count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxValue = Math.max(count, maxValue);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,3,2,1}));
    }
}


