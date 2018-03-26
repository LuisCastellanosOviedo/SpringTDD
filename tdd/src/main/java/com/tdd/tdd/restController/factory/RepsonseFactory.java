package com.tdd.tdd.restController.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


@Component
public class RepsonseFactory {


    @Autowired
    @Qualifier("okMessagge")
    ResponseBuilder okMessagge;

    @Autowired
    @Qualifier("badRequest")
    ResponseBuilder badRequest;

    final static Map<String,ResponseBuilder> msg= new HashMap<>();


    @PostConstruct
    public void  loadFactoryValues() {
        msg.put("hello",okMessagge);
        msg.put("400",badRequest);
    }


    public ResponseEntity builderMsg(String codeMsg, String content){
        ResponseBuilder responseBuilder = msg.get(codeMsg);
        if(responseBuilder!=null){
            return responseBuilder.createMessage(content);
        }else
            return msg.get("400").createMessage("fuck ! error 400 ");
    }

}
