package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//methods

/*
* boolean allMatch(Predicate<? super T> predicate)
* boolean anyMatch(Predicate<? super T> predicate)
* static <T> Stream.Builder<T> builder()
* <R,A> R collect(Collector<? super T,A,R> collector)
* <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
* static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
* long count()
* Stream<T> distinct()
* static <T> Stream<T> empty()
* Stream<T> filter(Predicate<? super T> predicate)
* Optional<T> findAny()
* Optional<T> findFirst()
* <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
* DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
* IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
* LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
* void forEach(Consumer<? super T> action)
* void forEachOrdered(Consumer<? super T> action)
* static <T> Stream<T> generate(Supplier<T> s)
* static <T> Stream<T> iterate(T seed,UnaryOperator<T> f)
* Stream<T> limit(long maxSize)
* <R> Stream<R> map(Function<? super T,? extends R> mapper)
* Optional<T> max(Comparator<? super T> comparator)
* Optional<T> min(Comparator<? super T> comparator)
* boolean noneMatch(Predicate<? super T> predicate)
* static <T> Stream<T> of(T t)
* Stream<T> peek(Consumer<? super T> action)
* Optional<T> reduce(BinaryOperator<T> accumulator)
* T reduce(T identity, BinaryOperator<T> accumulator)
* Stream<T> sorted()
* Stream<T> sorted(Comparator<? super T> comparator)
* Object[] toArray()
* <A> A[] toArray(IntFunction<A[]> generator)
*
*
* */
public class StreamApiPractice {
    public static void main(String[] args) {
//        list down even numbers of filter even numbers using stream.

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        list1.stream().map(i->i*i).forEach(e-> System.out.println(e));


        List<Integer> collect1 = list1.stream().map((i) -> i * 2).collect(Collectors.toList());
        System.out.println(collect1);




    }
}
