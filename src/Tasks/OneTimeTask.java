package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String title, String description, Type type, LocalDateTime dateTime) throws IncorrectArgumentException {
        super(title, description, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        if (getDateTime().toLocalDate().equals(date))
            return true;

        return false;
    }
}