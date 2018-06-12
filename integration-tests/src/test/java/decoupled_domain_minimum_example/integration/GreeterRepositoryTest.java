package decoupled_domain_minimum_example.integration;

import decoupled_domain_minimum_example.configuration.RepositoryProviderConfiguration;
import decoupled_domain_minimum_example.configuration.DataBaseConfiguration;
import decoupled_domain_minimum_example.core.Greeter;
import decoupled_domain_minimum_example.repositories.GreeterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@ContextConfiguration(classes = {DataBaseConfiguration.class, RepositoryProviderConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class GreeterRepositoryTest {

    @Autowired
    GreeterRepository greeterRepository;

    @Test
    public void
    can_read_the_default_greeter_from_it() {
        Greeter greeter = greeterRepository.getDefaultGreeter();
        assertThat(greeter.toString(),is("Great Greeter Paul"));
    }

}
