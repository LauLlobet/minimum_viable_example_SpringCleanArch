package decoupled_domain_minimum_example.repositories;

import decoupled_domain_minimum_example.core.Greeter;
import org.springframework.jdbc.core.JdbcTemplate;

public class GreeterRepository {
    private final JdbcTemplate jdbcTemplate;

    public GreeterRepository(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public Greeter getDefaultGreeter() {
        return new Greeter(jdbcTemplate.queryForObject("SELECT name FROM GREETERS WHERE isDefault = 1",String.class));
    }
}
