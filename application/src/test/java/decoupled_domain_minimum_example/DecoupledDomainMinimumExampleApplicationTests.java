package decoupled_domain_minimum_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DecoupledDomainMinimumExampleApplicationTests {

	@Test
	public void contextLoads() {
		assertThat(3,is(3));
	}

}
