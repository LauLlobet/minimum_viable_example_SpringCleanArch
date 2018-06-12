package decoupled_domain_minimum_example.entrypoints;


import decoupled_domain_minimum_example.services.SayHiService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SayHiEndpoint {

    public static final String API_PATH = "/sayHi/{myname}";

    private SayHiService sayHiService;

    public SayHiEndpoint(SayHiService sayHiService) {
        this.sayHiService = sayHiService;
    }

    @RequestMapping(value = API_PATH, method = GET)
    public String sayHi(@PathVariable String myname) {
        try {
            String capacity = sayHiService.sayHi(myname);
            return capacity;
        } catch (Exception e) {
            throw new NotFoundException();
        }
    }
}
