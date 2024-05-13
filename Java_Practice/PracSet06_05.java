package Java_Practice;

public class PracSet06_05 {
//    First Method
    /*
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] reverseArray = {0,0,0,0,0,0,0,0,0};
        for(int i=0; i<array.length; i++){
            reverseArray[i]=array[8-i];
            System.out.print(reverseArray[i]+" ");
        }
    }
     */

//    Second Method
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int l = array.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0; i<n; i++){
            temp = array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }
        for(int el :array){
            System.out.print(el+" ");
        }
    }
}
