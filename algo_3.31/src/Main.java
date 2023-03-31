import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("거스름돈 입력:");
        int w = scanner.nextInt();



        System.out.println(w);

        int n500 = 0;
        int n100 = 0;
        int n50 = 0;
        int n10 = 0;
        int n1 = 0;


        int change =w;

        while (change >= 500) {
            n500 +=1;
            change -= 500;
        }
        while (change >= 100) {
            n500 +=1;
            change -= 100;
        }
        while (change >= 50) {
            n500 +=1;
            change -= 50;
        }
        while (change >= 10) {
            n500 +=1;
            change -= 10;
        }
        while (change >= 5) {
            n500 +=1;
            change -= 5;
        }
        while (change >= 1) {
            n500 +=1;
            change -= 1;
        }



        System.out.println(n500+n100+n50+n10+n1);
    }
}