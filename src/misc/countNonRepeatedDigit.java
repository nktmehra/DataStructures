package misc;

import java.util.HashSet;
import java.util.Set;

public class countNonRepeatedDigit {



    static int repeatedDigit(int n){
        Set<Integer> set = new HashSet<>();
        int temp =0;
        while(n!=0){
            temp = n%10;

            if(set.contains(temp)){
                return 0;
            }
            set.add(temp);

            n = n/10;

        }
        return 1;
    }


    static int calculate(int l,int r){
        int ans =0;
        for(int i=l ;i<=r;i++){
            ans =ans +repeatedDigit(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 100));
    }


}
