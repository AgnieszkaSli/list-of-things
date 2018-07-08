package com.aga.listofthings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/list")
public class MainController {

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public String demo() {
        return "{\"hello\":\"world\"}";

    }

}


