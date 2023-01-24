public class MyExcep extends Exception {

    private String message;

    public String getMessage() { return message; }

    public MyExcep(String message)
    {
        this.message = message;
    }
}
