package com.tao.org.hello_word.controller;


import com.tao.org.hello_word.model.UserAuthentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HelloController {

    @GetMapping("/hello")
    public UserAuthentication hello(){
        UserAuthentication obj = new UserAuthentication();
        obj.setUsername("test");
        obj.setMsg("test msg");
        return obj;
    }

    @GetMapping("/bye")
    public String bye(){




        return "Bye..";
    }
}
