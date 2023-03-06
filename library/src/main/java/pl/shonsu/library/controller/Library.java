package pl.shonsu.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library {

    @GetMapping("/library")
    public String getLibrary(){
        return "Library";
    }
}
