package Bai6;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static <T extends Comparable<T>> void sort(T[] array){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++){
                if(array[j].compareTo(array[j+1]) > 0){
                    swap(array, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) break; // mang da sap xep xong thi dung som.
        }
    }
    public static <T> void print(T[] array){
        for(int i=0; i< array.length; i++){
            System.out.println(array[i] + (i< array.length-1 ? " " : " "));
        }
        System.out.println();
    }
}
