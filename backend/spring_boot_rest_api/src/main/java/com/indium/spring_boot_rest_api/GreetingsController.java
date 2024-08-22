package com.indium.spring_boot_rest_api;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {

    //    http://localhost:8080/hello
    @GetMapping("/hello")
    public String greet() {
        return "Hello there!";
    }

//    http://localhost:8080/hi/Sam -> Hi Sam
//    http://localhost:8080/hi/Ram -> Hi Ram

    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hi " + name;
    }

//    http://localhost:8080/bye?name=Sam -> Bye Sam
//    http://localhost:8080/bye?name=Joe -> Bye Joe

    @PostMapping("/bye")
    public String sayBye(@RequestParam("name") String name) {
        return "Bye " + name;
    }

}
