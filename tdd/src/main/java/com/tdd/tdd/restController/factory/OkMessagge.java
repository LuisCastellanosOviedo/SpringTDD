package com.tdd.tdd.restController.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component("okMessagge")
public class OkMessagge implements  ResponseBuilder {


    @Override
    public ResponseEntity createMessage(String content) {
        return  new ResponseEntity("hello", HttpStatus.OK);
    }
}
