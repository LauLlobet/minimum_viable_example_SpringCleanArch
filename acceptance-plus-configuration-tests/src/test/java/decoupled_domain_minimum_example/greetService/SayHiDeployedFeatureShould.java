package decoupled_domain_minimum_example.greetService;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import decoupled_domain_minimum_example.entrypoints.SayHiEndpoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan({"decoupled_domain_minimum_example"})
public class SayHiDeployedFeatureShould {

    @LocalServerPort
    protected int serverPort;

	@Test
	public void saysHi() throws Exception{
	    String apiPath = SayHiEndpoint.API_PATH.replace("{myname}","Peter-the-User");
        String apiUrl = "http://localhost:"+ serverPort + apiPath;

        HttpResponse<String> httpResponse = Unirest.get(apiUrl).asString();

        int responseStatus = httpResponse.getStatus();

        String responseContent = httpResponse.getBody();

        assertThat(responseContent,is("I'm Great Greeter Paul, hi Peter-the-User"));
	}




}
