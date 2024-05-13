package Java_Practice;

public class PracSet06_08 {
    public static void main(String[] args) {
        int [] a = {12,14,15,15,16,20,21,22,24};
        boolean isSorted = true;
        for (int i=0; i<a.length-1; i++){
            if (a[i]>a[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted ");
        }
        else {
            System.out.println("The Array is not sorted");
        }
    }
}
