import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class work{

    long start;
    long end;


    public work(long start, long end ){
        this.start = start;
        this.end = end;
    }


}




public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long size = scanner.nextLong();

        ArrayList<work> worklist = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            worklist.add(new work(scanner.nextLong(),scanner.nextLong()));
        }

        worklist.sort(Comparator.comparing(work -> work.end));


        long count = 1;
        long work1_end = worklist.get(0).end;

        for (int i = 1; i < size; i++) {
            if (worklist.get(i).start >= work1_end) {
                ++count;
                work1_end = worklist.get(i).end;
            }
        }
        System.out.println(count);

    }
}