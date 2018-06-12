package decoupled_domain_minimum_example.core;

public class Greeter {
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    public Greeter(String name) {

        this.name = name;
    }

    public String sayHi() {
        return "Hi! I'm "+name;
    }
}
