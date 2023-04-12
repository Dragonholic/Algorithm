import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MySet<E> extends HashSet<E>{
    @SafeVarargs
    public MySet(E... vector) {
        addAll(Arrays.asList(vector));
    }
}


public class Main {
    public static void main(String[] args) {


        HashSet<Integer> u = new HashSet<>();
        for (int i =0; i<10; i++){
            u.add(i+1);
        }
        HashSet<MySet<Integer>> f = new HashSet<MySet<Integer>>();
        f.add(new MySet<>(1,2,3,8));
        f.add(new MySet<>(1,2,3,4,8));
        f.add(new MySet<>(1,2,3,4));
        f.add(new MySet<>(2,3,4,5,7,8));
        f.add(new MySet<>(4,5,6,7));
        f.add(new MySet<>(5,6,7,9,10));
        f.add(new MySet<>(4,5,6,7));
        f.add(new MySet<>(1,2,4,8));
        f.add(new MySet<>(6,9));
        f.add(new MySet<>(6,10));


        ArrayList<MySet<Integer>> c = new ArrayList<>();

        while (!u.isEmpty()){
            MySet<Integer> s = func(u, f); // u의 원소를 가장 많이 포함하는 f의 원소 찾기
            u.removeAll(s);
            f.remove(s);
            c.add(s);

        }

        System.out.println(c);

    }


    private static int func2(HashSet<Integer> u, MySet<Integer> s){
        int n =0;
        for (int i : s) {
            if (u.contains(i)) {
                n += 1;
            }
        }
            return n;

    }
    private static MySet<Integer> func(HashSet<Integer> u, HashSet<MySet<Integer>> f) {

        MySet y = null;
        int max = 0;



        for (MySet x : f){
            int i =func2(u, x);
            if (max < i ){
                max = i;
                y = x;
            }


        }

        return y;
    }
}