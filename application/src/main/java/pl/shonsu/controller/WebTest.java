package pl.shonsu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.shonsu.library.service.TestService;

@RestController
public class WebTest {

    private final TestService testService;

    public WebTest(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String getWebTest(){

        testService.testMethod();

        return "WEB TEST";
    }
}
