package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {
    public MonthlyTask(String title, String description, Type type, LocalDateTime dateTime) throws IncorrectArgumentException {
        super(title, description, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        if ((date.isAfter(getDateTime().toLocalDate()) ||
             date.isEqual(getDateTime().toLocalDate())) &&
             date.getDayOfMonth() == getDateTime().getDayOfMonth())
        {
            return true;
        }

        return false;
    }
}