package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;

public class YearlyTask extends Task {
    public YearlyTask(String title, String description, Type typeTask) throws IncorrectArgumentException {
        super(title, description, typeTask);
    }

    @Override
    public Boolean appearsIn(LocalDate date) {
        if (getDateTime().toLocalDate().plusYears(1).equals(date))
            return true;

        return false;
    }
}