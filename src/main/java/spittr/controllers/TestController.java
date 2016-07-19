package spittr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( value = "/home" )
public class TestController {

    @RequestMapping( method = RequestMethod.GET )
    public String home(){
        return "home";
    } // end method home

} // end class TestController
