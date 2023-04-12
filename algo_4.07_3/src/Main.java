import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");
    }



    class Task{
        int s;
        int e;
        int id;

        static int x =0;

        public Task(int id, int s, int e){
            this.id = x++;
            this.s = s;
            this.e =e;

        }
    }

    class Machine {
        int id;
        int e;
        ArrayList<Task> tasks;




    }
}