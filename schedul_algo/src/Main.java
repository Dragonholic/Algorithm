import java.util.*;

class work{

    int start;
    int end;


    public work(int start, int end ){
        this.start = start;
        this.end = end;
    }


}




public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<work> worklist = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            worklist.add(new work(scanner.nextInt(),scanner.nextInt()));

        }

        worklist.sort(Comparator.comparing(work -> work.end));


        int count = 1;
        int last_work = worklist.get(0).end;
        System.out.println("start worklist end :"+ last_work);

        for (int i = 1; i < size; i++) {
            if (worklist.get(i).start < last_work) {
                count++;
                last_work = worklist.get(i).end;
                System.out.println("worklist end :"+ last_work);

            }
        }


        System.out.println("work count :"+ count);







    }
}