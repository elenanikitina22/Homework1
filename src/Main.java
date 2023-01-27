import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку.");
        String text = scanner.nextLine();

        // Количество слов в строке
        System.out.println("Количество слов в строке: " + getWordCount(text));

        // Топ слов в строке
        getTopWords(text);
    }

    public static int getWordCount(String text)
    {
        int count = 0;

        if(text.length() != 0)
        {
            count++;

            for (int i = 0; i < text.length(); i++)
            {
                if (text.charAt(i) == ' ')
                    count++;
            }
        }

        return count;
    }

    public static void getTopWords(String text)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int maxValue = 0;

        String[] words = text.split(" ");

        for (var item : words)
        {
            if (map.containsKey(item) == false)
            {
                map.put(item, 1);
                if (maxValue <= 1) maxValue = 1;
            }
            else
            {
                map.put(item, map.get(item) + 1);
                maxValue = map.get(item);
            }
        }

        SortedSet<String> sortMap = new TreeSet<String>(map.keySet());

        while (maxValue >= 0)
        {
            for (var item : sortMap)
            {
                if (map.get(item) == maxValue)
                {
                    System.out.println(item + " - " + map.get(item));
                }
            }

            maxValue--;
        }
    }
}