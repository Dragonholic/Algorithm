import java.util.ArrayList;
import java.util.Random;


public class Select {
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int selection(int[] arr, int start, int end , int k){
        int index = partition(arr, start, end);
        if (index == k) return arr[index];
        else if (index >k) return partition(arr, start, index-1);
        else return partition(arr, index, end);
    }
    public static void main(String[] args) {
        int[]arr = new int [20];

        ArrayList<Integer> List= new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<arr.length; i++) {
            arr[i] = r.nextInt(100);
            List.add(arr[i]);
        }


    }
}