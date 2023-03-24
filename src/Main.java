import java.util.Scanner;

public class Main {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            // 왼쪽 절반을 먼저 정렬
            mergeSort(arr, l, m);
            // 오른쪽 절반을 정렬
            mergeSort(arr, m + 1, r);
            // 정렬된 두 배열을 합치기
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l,int m, int r){

        int l = arr.length/2-1;
        for (int i=0; i<=l; i++){

        }

    }




    public static void main(String[] args) {

        int[] num_a ;

        Scanner scanner = new Scanner(System.in);


//        System.out.print("숫자를 띄어 써서 입력하세요: ");
//        String str = scanner.nextLine();
//
//        for (int i =0; i<=str.length(); i++){
//
//        }


        System.out.print("배열의 크기를 입력하세요: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "번째 정수를 입력하세요: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("입력된 배열: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


        int l = arr.length/2-1;



    }
}