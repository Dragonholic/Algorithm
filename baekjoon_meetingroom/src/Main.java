import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Work {

    long start;
    long end;


    public Work(long start, long end ){
        this.start = start;
        this.end = end;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }


}




public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long size = scanner.nextLong();

        ArrayList<Work> worklist = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            worklist.add(new Work(scanner.nextLong(),scanner.nextLong()));
        }


        worklist.sort(Comparator.comparing(Work::getEnd).thenComparing(Work::getStart));


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