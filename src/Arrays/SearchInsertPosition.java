package Arrays;

public class SearchInsertPosition {

    static void searchInsertPosition(int[] a, int x){
        int i =0;

        while(i<a.length){
            if(a[i] <x && x<a[i+1]){
                System.out.println("The x should be placed at position: "+ (i+1));
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] a ={1,2,4,5};
        searchInsertPosition(a,3);
    }
}
