package Java_Practice;

public class PracSet06_07 {
    public static void main(String[] args) {
        int[] a = {-12, 15, 21, -6, 1, -21, 5};
        int min = Integer.MAX_VALUE;
        for (int el : a) {
            if (min > el) {
                min = el;
            }
        }
        System.out.println(min);
    }
}
