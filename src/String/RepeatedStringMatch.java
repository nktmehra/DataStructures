package String;

public class RepeatedStringMatch {

    static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int count = 1;
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (sb.indexOf(b) >= 0) {
            return count;
        }
        sb.append(a);
        count++;
        if (sb.indexOf(b) >= 0) {
            return count;

        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }
}
