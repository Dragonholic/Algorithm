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

        worklist.sort(Comparator.comparing(work -> work.start));


        int count = 1;
        int first_work = worklist.get(0).start;
        System.out.println("start worklist start :"+ first_work);

        for (int i = 1; i < size; i++) {
            if (worklist.get(i).end >= first_work) {
                count++;
                first_work = worklist.get(i).start;
                System.out.println("worklist start :"+ first_work);

            }
        }


        System.out.println("work count :"+ count);







    }
}