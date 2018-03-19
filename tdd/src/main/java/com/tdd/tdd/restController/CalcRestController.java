package com.tdd.tdd.restController;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcRestController {

    @RequestMapping(path = "/echo/{msg}",method = RequestMethod.GET)
    public String getMsg(@PathVariable("msg") String msg){
            return "hello";
    }




}
