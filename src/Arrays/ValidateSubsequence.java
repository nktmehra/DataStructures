package Arrays;

public class ValidateSubsequence {

    static boolean checkSubsequence(int[] a, int[] b) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[j]) {
                j++;
            }
            if (j == b.length) {
               return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2,4};
        System.out.println(checkSubsequence(a, b));
    }
}
