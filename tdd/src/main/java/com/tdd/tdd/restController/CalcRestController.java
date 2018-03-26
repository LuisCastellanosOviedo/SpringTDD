package com.tdd.tdd.restController;


import com.tdd.tdd.restController.factory.RepsonseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@ComponentScan
public class CalcRestController {



    @Autowired
    RepsonseFactory repsonseFactory;


    @RequestMapping(path = "/echo/{msg}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public ResponseEntity getMsg(@PathVariable("msg") String msg){
          return   repsonseFactory.builderMsg(msg,"hello");
    }




}
