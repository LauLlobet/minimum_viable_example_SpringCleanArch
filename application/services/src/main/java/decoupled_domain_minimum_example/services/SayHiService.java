package decoupled_domain_minimum_example.services;


import decoupled_domain_minimum_example.core.Greeter;
import decoupled_domain_minimum_example.repositories.GreeterRepository;

public class SayHiService {
    private GreeterRepository greeterRepository;

    public SayHiService(GreeterRepository greeterRepository) {
        this.greeterRepository = greeterRepository;
    }

    public String sayHi(String myName){
        Greeter greeter = greeterRepository.getDefaultGreeter();
        return greeter.sayHi(myName);
    }

}
