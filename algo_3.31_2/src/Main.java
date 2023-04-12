import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class Edge{

    int weight;
    char v1;
    char v2;


    @Override
    public String toString() {
        return String.format("[%c(%02d)%c", v1, weight, v2);
    }

    public Edge(int weight, char v1, char v2){
        this.weight = weight;
        this.v1 =v1;
        this.v2 =v2;



    }
}

public class Main {


    public static void main(String[] args) {

        int[] weight ={1, 1, 2, 3, 4, 4, 7, 8, 9};
        char[] v1s = {'B', 'C', 'b', ''};
        char[] v2s = {};


        ArrayList<Edge> L =new ArrayList<Edge>();

        for(int i=0; i< weight.length; i++){
            L.add(new Edge(weight[i], v1s[i], v2s[i]));

        }

        Comparator<Edge> comparator = new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.v1 -o2.v1;
            }
        };

        Collections.sort(L, comparator);


        while(T.size() < vertices.size() -1)

            ;
        private static boolean isNotCyclic(HashSet<Edge>T, Edge tmp){

            HashSet<Character> x = new HashSet<Character>();
            for (Edge e: T){
                x.add(e.v1);
                x.add(e.v2);

            }
            return !x.contains(tmp.v1) && x.contains((tmp.v2));
        }


        System.out.println(L);
    }
}