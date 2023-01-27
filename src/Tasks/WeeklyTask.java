package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;

public class WeeklyTask extends Task {

    public WeeklyTask(String title, String description, Type type) throws IncorrectArgumentException {
        super(title, description, type);
    }

    @Override
    public Boolean appearsIn(LocalDate date) {
        if (getDateTime().toLocalDate().plusWeeks(1).equals(date))
            return true;

        return false;
    }
}