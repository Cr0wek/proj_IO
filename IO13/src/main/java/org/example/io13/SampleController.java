package org.example.io13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/test")
    String someMethod()
    {
        return "nie wiem jak to dziala";
    }
    @GetMapping("/GetUserData")
    UserData metoda1()
    {
        return new UserData(1,"Jan","Cegiełka");
    }
}
