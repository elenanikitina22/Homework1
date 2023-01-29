package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {
    public YearlyTask(String title, String description, Type typeTask, LocalDateTime dateTime) throws IncorrectArgumentException {
        super(title, description, typeTask, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        if ((date.isAfter(getDateTime().toLocalDate()) ||
             date.isEqual(getDateTime().toLocalDate())) &&
             date.getDayOfYear() == getDateTime().getDayOfYear())
        {
            return true;
        }

        return false;
    }
}