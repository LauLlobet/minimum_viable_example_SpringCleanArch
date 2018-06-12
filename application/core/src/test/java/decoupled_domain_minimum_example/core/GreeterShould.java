package decoupled_domain_minimum_example.core;

import decoupled_domain_minimum_example.services.SayHiService;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GreeterShould {
    @Test
    public void
    say_hi_as_default_greeter() {
        Greeter greeter = new Greeter("DefaultGreeter");
        assertThat(greeter.sayHi(),is("Hi! I'm DefaultGreeter"));
    }
}
