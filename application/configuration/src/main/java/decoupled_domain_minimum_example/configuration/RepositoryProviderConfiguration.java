package decoupled_domain_minimum_example.configuration;

import decoupled_domain_minimum_example.repositories.GreeterRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class RepositoryProviderConfiguration {

    @Bean
    public GreeterRepository ProvideGreeterRepository(JdbcTemplate jdbcTemplate) {
        return new GreeterRepository(jdbcTemplate);
    }
}
