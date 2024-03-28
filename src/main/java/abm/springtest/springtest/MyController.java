package abm.springtest.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")

public class MyController {
    public MyController(){

    }

    @GetMapping("/greetings")
    public String greetings() {
        return new String("Hello");
    }

    @PostMapping("/sum")
    public int sum(@RequestBody int a ) {
        return a+a ;
    }

}
