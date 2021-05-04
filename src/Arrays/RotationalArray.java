package Arrays;

public class RotationalArray {

    static void rotateArray(int[] arr, int d){
        for(int i=0;i<d;i++){
            rotateArrayByOne(arr);
        }
    }

    static void rotateArrayByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[4] = temp;
    }

    static void printArray(int[] arr){
        for ( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        RotationalArray rotate = new RotationalArray();
        int[] arr = {1,2,3,4,5};
        rotateArray(arr,2);
        printArray(arr);
    }
}
