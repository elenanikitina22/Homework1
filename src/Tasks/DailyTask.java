package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;

public class DailyTask extends Task {
    public DailyTask(String title, String description, Type type) throws IncorrectArgumentException {
        super(title, description, type);
    }

    @Override
    public Boolean appearsIn(LocalDate date) {
        if(LocalDate.now().equals(date) || getDateTime().toLocalDate().plusDays(1).equals(date))
            return true;

        return false;
    }
}