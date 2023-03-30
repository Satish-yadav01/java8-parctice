package comparator;

import java.util.Comparator;

//compareTo method
//we are using comparator when we have to change logic of comparable or when we are not using comparable
public class Example1 implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());
    }

    public static void main(String[] args) {
        Example1 example = new Example1();
        Employee satish = new Employee(1, "satish", 21);
        Employee satish1 = new Employee(2, "Satish", 22);
        int compare = example.compare(satish, satish1);
        System.out.println(compare);
    }
}
