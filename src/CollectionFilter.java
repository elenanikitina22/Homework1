import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CollectionFilter {

    public static List<Flight> filterPastFlights(List<Flight> collection) {

        List<Flight> filteredList = new ArrayList<>();
        LocalDateTime currentDateTime = LocalDateTime.now();

        for (Flight item : collection) {
            List<Segment> segments = item.getSegments();

            for (Segment segment: segments) {
                if (segment.getDepartureDate().isBefore(currentDateTime))
                {
                    filteredList.add(item);
                }
            }
        }

        return filteredList;
    }

    public static List<Flight> filterByDepartureDateAndArrivalDate(List<Flight> collection)
    {
        List<Flight> filteredList = new ArrayList<>();

        for (Flight item : collection) {
            List<Segment> segments = item.getSegments();

            for (Segment segment: segments) {
                if (segment.getArrivalDate().isBefore(segment.getDepartureDate()))
                {
                    filteredList.add(item);
                }
            }
        }

        return filteredList;
    }

    public static List<Flight> filteringByFlightTime(List<Flight> collection)
    {
        List<Flight> filteredList = new ArrayList<>();

        for (Flight item : collection) {
            List<Segment> segments = item.getSegments();

            IntStream.range(0, segments.size() - 1)
                    .forEach(i -> {
                        Segment currentElement = segments.get(i);
                        Segment nextElement = segments.get(i + 1);

                        Duration duration = Duration.between(currentElement.getArrivalDate(), nextElement.getDepartureDate());
                        long hoursDifference = duration.toHours();

                        if (hoursDifference >= 2)
                        {
                            filteredList.add(item);
                        }
                    });
        }

        return filteredList;
    }
}