package optional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//optional example
/*of , ofNullable, empty => different ways to create optional object

 */

//methods
/* static <T> Optional<T>  => empty()
* equals()
* filter()
* flatMap()
* get() =>if value is not present it return NoSuchElementException
* hashCode() =>return the hash if any value and return 0 if no value
* isPresent() => It returns true if there is a value present, otherwise false
* orElseThrow(Supplier)
* toString()
* orElseGet(Supplier)
* orElse(T other)
* ofNullable(T value)
* */
public class OptionalExample {
    public static void main(String[] args) {

//        1. method boilerplate code
        String str="demo";
//        if(str ==null){
//            System.out.println();
//        }else{
//            System.out.println();
//        }
        Optional<String> op1 = Optional.ofNullable(str);
        System.out.println(op1.isPresent());

        String str2 = "new String";

//        System.out.println(Optional.ofNullable(str).orElse("Second new String"));
        System.out.println(Optional.of(str2).isEmpty());
        int [] numbers = new int[]{1,2,3,4,5,6};
        List list = List.of(numbers);
//        Optional.of(list).ifPresent(elements-> {
//            elements.stream().forEach(element-> System.out.println(element));
//        });

//        filter

    }

}
