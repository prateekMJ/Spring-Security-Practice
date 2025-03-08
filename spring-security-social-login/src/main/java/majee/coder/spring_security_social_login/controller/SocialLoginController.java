package majee.coder.spring_security_social_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialLoginController {

    @GetMapping("/")
    public String publicUrl(){
        return "Hello , Peeps";
    }

    @GetMapping("/secured")
    public String securedUrl(){
        return "Hello , Secured Peeps";
    }
}
