import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Properties;

class Product {
    String name;
    int weight;
    int value;
    double unitValue;

    public Product(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.unitValue = (double) value / weight;
    }

    @Override
    public String toString() {
        return String.format("[%s] (%d, %d) => %.1f", name, weight, value, unitValue);
    }
}
public class Main {
    public static void main(String[] args) {

        ArrayList<Product> s =new ArrayList<Product>();

        s.add(new Product("주석",50, 50000));
        s.add(new Product("백금",10, 600000));
        s.add(new Product("은",25, 100000));
        s.add(new Product("금",15, 750000));

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.unitValue - o1.unitValue);
            }

        };


        Collections.sort(s, comp);



        ArrayList<Product> x =new ArrayList<>();

        int w =0;
        int v = 0;
        int capacity = 40;

        Product tmp = s.remove(0);
        while (w + tmp.weight <= capacity ){
            x.add(tmp);
            w += tmp.weight;
            v += tmp.value;

            tmp = s.remove(0);
        }

        if (capacity - w >0){
            int value = (int)((capacity-w) * tmp.unitValue);
            x.add(new Product(tmp.name,capacity-w, value));
            v += value;
        }




        System.out.println(x);
        System.out.println(v);
    }
}