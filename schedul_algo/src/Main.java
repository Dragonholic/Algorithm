import java.util.*;

class Work {

    int start;
    int end;


    public Work(int start, int end ){
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

        int size = scanner.nextInt();

        ArrayList<Work> worklist = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            worklist.add(new Work(scanner.nextInt(),scanner.nextInt()));

        }

        worklist.sort(Comparator.comparing(Work::getEnd).thenComparing(Work::getStart));


        int count = 1;
        int first_work = worklist.get(0).end;

        for (int i = 1; i < size; i++) {
            if (worklist.get(i).start >= first_work) {
                count++;
                first_work = worklist.get(i).end;

            }
        }

        System.out.println("work count :"+ count);


    }
}