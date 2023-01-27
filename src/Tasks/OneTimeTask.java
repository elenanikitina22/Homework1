package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;

public class OneTimeTask extends Task {
    public OneTimeTask(String title, String description, Type type) throws IncorrectArgumentException {
        super(title, description, type);
    }

    @Override
    public Boolean appearsIn(LocalDate date) {
        if (getDateTime().toLocalDate().equals(date))
            return true;

        return false;
    }
}