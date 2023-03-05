package homework.elena.homework1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        GetNumberOfEvenNumbers(list.stream());
    }

    public static void findMinMax(Stream<? extends Integer> stream, Comparator<? super Integer> order, BiConsumer<? super Integer, ? super Integer> minMaxConsumer)
    {
        Integer min = stream.min(order).get();
        Integer max = stream.max(order).get();

        if (min != null || max != null)
        {
            minMaxConsumer.accept(min, max);
        }
        else
        {
            minMaxConsumer.accept(null, null);
        }
    }

    public static long GetNumberOfEvenNumbers(Stream<? extends Integer> stream)
    {
        return stream.filter(e -> e % 2 == 0).peek(e -> System.out.println(e)).count();
    }
}