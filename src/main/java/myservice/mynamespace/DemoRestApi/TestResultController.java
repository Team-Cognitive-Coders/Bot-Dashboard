package myservice.mynamespace.DemoRestApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import myservice.mynamespace.DemoRestApi.TextClientApplication;

@RestController
public class TestResultController {
	@RequestMapping("/testResult")
    public TestResult testResult(@RequestParam(value="name", defaultValue="World") String name) {
		
		int[] result = (new TextClientApplication()).main1(); 
		
		int pass = result[0];
		int fail = result[1];
		int review = result[2];
		return new TestResult(review, fail, pass);
    }
}
