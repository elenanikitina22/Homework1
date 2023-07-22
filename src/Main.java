import com.gridnine.testing.Flight;
import com.gridnine.testing.FlightBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> flights = FlightBuilder.createFlights();
        for (var flight : flights) {
            System.out.println(flight);
        }

        System.out.println("Вылет до текущего момента");

        var firstColl = CollectionFilter.filterPastFlights(flights);
        for (var flight : firstColl) {
            System.out.println(flight);
        }

        System.out.println("Дата прилета раньше даты вылета");

        var secondColl = CollectionFilter.filterByDepartureDateAndArrivalDate(flights);
        for (var flight : secondColl) {
            System.out.println(flight);
        }

        System.out.println("Более 2-х часов между перелетами");

        var thirdColl = CollectionFilter.filteringByFlightTime(flights);
        for (var flight : thirdColl) {
            System.out.println(flight);
        }
    }
}