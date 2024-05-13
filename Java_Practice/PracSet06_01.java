package Java_Practice;

public class PracSet06_01 {
    public static void main(String[] args) {
        float[] num={12.4f,13.5f,15.2f,19.4f,49.2f};
        float sum=0;
        for (int i=0; i< num.length; i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
