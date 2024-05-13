package Java_Practice;

public class PracSet06_06 {
    public static void main(String[] args) {
        int[] a = {-12, 15, 21, -6, 1, -21, 5};
        int max = Integer.MIN_VALUE;
        for (int el : a) {
            if (max < el) {
                max = el;
            }
        }
        System.out.println(max);
    }
}
