package Java_Practice;

public class PracSet06_03 {
    public static void main(String[] args) {
        int[] marks ={45,89,45,75,84,63,41};
        int sum, average, stnum;
        sum = 0;
        for (int element:marks){
            sum+= element;
        }
        System.out.println(sum/ marks.length);
    }
}
