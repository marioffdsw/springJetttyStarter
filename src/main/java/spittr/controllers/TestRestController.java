package spittr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( "/" )
public class TestRestController {

    @RequestMapping( method = RequestMethod.GET, produces = "application/json; charset=utf-8" )
    public String sayHello(){
        return "{ \"greeting\": \"Hello World!\"}";
    } // end method sayHello

} // end class TestRestController
