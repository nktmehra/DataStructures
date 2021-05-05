package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static void majorityElement(int[] a, int size){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <size ; i++) {
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }

        }

      for(Map.Entry<Integer,Integer> entry : map.entrySet()){

          if(entry.getValue()>size/2){
              System.out.println("Majority element: "+ entry.getKey());
          }

      }


    }

    public static void main(String[] args) {
        int[] a ={1,1,1,1,2,2,2,2,2,2};
        int size =a.length;
        majorityElement(a,size);
    }
}
