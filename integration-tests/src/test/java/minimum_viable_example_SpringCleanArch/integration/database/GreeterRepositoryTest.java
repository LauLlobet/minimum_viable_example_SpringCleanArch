package minimum_viable_example_SpringCleanArch.integration.database;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {DatasourceConfiguration.class, DatabaseDataProviderConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class GreeterRepositoryTest {


}
