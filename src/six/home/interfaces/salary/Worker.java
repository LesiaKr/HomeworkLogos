package six.home.interfaces.salary;

public abstract class Worker {
    private final String name;

    public Worker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
