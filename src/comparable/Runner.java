package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laptop = new ArrayList<Laptop>();
        laptop.add(new Laptop(1,"Samsung",8));
        laptop.add(new Laptop(2,"dell",4));
        laptop.add(new Laptop(3,"hp",9));

        Collections.sort(laptop);
        for(Laptop l : laptop){
            System.out.println(l);
        }
    }
}
