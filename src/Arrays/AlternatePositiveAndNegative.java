package Arrays;

public class AlternatePositiveAndNegative {

    static void rearrange(int[] a){
      int i =0;
      int j = a.length-1;
      int temp =0; int temp1=0;
      while(i<j){
          if(a[i]>0 && a[j]<0){
              i++;
              j--;
          }else if(a[i]<0 && a[j]>0){
             temp = a[i];
             a[i] =a[j];
             a[j] = temp;
          }else if(a[i]>0){
              i++;
          }else if(a[j]<0){
              j--;
          }
        }

      if(i==0 || i==a.length){
          for(int m =0; m<a.length;m++){
              System.out.println(a[m]);
          }
      }else{
          int k =0;
          int pos = i+1;
          while(k<pos && pos<a.length && k<a.length){
              temp1 = a[k];
              a[k] =a[pos];
              a[pos] = temp1;
                k=k+2;
                pos++;
          }

      }
        for(int m =0;m<a.length;m++){
            System.out.print(a[m]+" ");
        }
    }



    public static void main(String[] args) {
        int[] a = {-5, -2, 5, 2, 4, -7,4,6,7,8};
        rearrange(a);
    }
}
