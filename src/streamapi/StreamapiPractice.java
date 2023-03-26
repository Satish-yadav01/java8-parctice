package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamapiPractice {
    public static void main(String[] args) {
//        list down even numbers of filter even numbers using stream.

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        list1.stream().map(i->i*i).forEach(e-> System.out.println(e));


    }
}
