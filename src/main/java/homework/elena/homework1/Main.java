package homework.elena.homework1;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        // Первое задание
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(22);
        list.add(15);

        findMinMax(list.stream(), Integer::compareTo, (intMin, intMax) -> {
            System.out.println("Min: " + intMin);
            System.out.println("Max: " + intMax);
        });

        // Второе задание
        getNumberOfEvenNumbers(list.stream());
    }

    public static void findMinMax(Stream<? extends Integer> stream, Comparator<? super Integer> order, BiConsumer<? super Integer, ? super Integer> minMaxConsumer)
    {
        try
        {
            Integer min = stream.min(order).get();
            Integer max = stream.max(order).get();
            minMaxConsumer.accept(min, max);
        }
        catch (NoSuchElementException ex)
        {
            minMaxConsumer.accept(null, null);
        }
    }

    public static void getNumberOfEvenNumbers(Stream<? extends Integer> stream)
    {
        long count = stream.filter(e -> e % 2 == 0).peek(e -> System.out.println(e)).count();
        System.out.println("Количество - " + count);
    }
}