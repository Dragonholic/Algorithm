

public class QuickSort{
    public static void quickSort(int arr[],int start,int end){
        if(start<end){

            int p = patition(arr, start, end);


            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
    }



    public static int patition(int arr[], int start, int end){
        int p = (end-start)/2;


    }

    public static void main(String[] args) {


    }
}
