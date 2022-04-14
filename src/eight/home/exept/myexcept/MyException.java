package eight.home.exept.myexcept;

public class MyException extends Exception{
    private final String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}