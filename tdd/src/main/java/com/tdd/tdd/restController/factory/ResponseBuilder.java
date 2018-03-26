package com.tdd.tdd.restController.factory;

import org.springframework.http.ResponseEntity;

public interface ResponseBuilder {


    ResponseEntity createMessage(String content);
}
