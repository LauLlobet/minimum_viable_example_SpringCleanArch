package decoupled_domain_minimum_example.configuration;

import decoupled_domain_minimum_example.repositories.GreeterRepository;
import decoupled_domain_minimum_example.services.SayHiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EndpointConfiguration {

    @Bean
    public SayHiService getSayHiServiceEndpoint(GreeterRepository greeterRepository) {
        return new SayHiService(greeterRepository);
    }

}