package pl.shonsu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTest {

    @GetMapping("/")
    public String getWebTest(){
        return "WEB TEST";
    }
}
