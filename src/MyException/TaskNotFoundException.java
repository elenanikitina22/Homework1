package MyException;

public class TaskNotFoundException extends Exception {

    private String message;

    public TaskNotFoundException(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message + "\n";
    }
}