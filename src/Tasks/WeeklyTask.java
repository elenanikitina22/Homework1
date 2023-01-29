package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task {

    public WeeklyTask(String title, String description, Type type, LocalDateTime dateTime) throws IncorrectArgumentException {
        super(title, description, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        if ((date.isAfter(getDateTime().toLocalDate()) ||
             date.isEqual(getDateTime().toLocalDate())) &&
             date.getDayOfWeek() == getDateTime().getDayOfWeek())
        {
            return true;
        }

        return false;
    }
}