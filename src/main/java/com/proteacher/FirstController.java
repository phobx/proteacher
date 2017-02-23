package com.proteacher;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FirstController {

    @RequestMapping("/")
    public String index() {
        return "Testing web...";
    }

}
