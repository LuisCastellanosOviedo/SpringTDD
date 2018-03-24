package com.tdd.tdd.restController;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalcRestController {




    @RequestMapping(path = "/echo/{msg}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public ResponseEntity getMsg(@PathVariable("msg") String msg){
        ResponseEntity responseEntity;
        if(!msg.equals("hello")){
            responseEntity = new ResponseEntity("fuck ! error 400 ",HttpStatus.BAD_REQUEST);
        }else{
            responseEntity = new ResponseEntity("hello",HttpStatus.OK);
        }

        return responseEntity;
    }




}
