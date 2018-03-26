package com.tdd.tdd.restController.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component("badRequest")
public class BadRequest implements ResponseBuilder {

    @Override
    public ResponseEntity createMessage(String content) {
        return new ResponseEntity("fuck ! error 400 ", HttpStatus.BAD_REQUEST);
    }
}
