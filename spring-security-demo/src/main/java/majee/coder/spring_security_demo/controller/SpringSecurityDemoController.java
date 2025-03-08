package majee.coder.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityDemoController {

    @GetMapping("/hello")
    public String hello(){
        return  "Hello";
    }
}
