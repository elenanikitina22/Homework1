package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;

public class MonthlyTask extends Task {
    public MonthlyTask(String title, String description, Type type) throws IncorrectArgumentException {
        super(title, description, type);
    }

    @Override
    public Boolean appearsIn(LocalDate date) {
        if (getDateTime().toLocalDate().plusMonths(1).equals(date))
            return true;

        return false;
    }
}