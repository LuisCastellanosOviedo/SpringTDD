package com.tdd.tdd.restControllerTest;

import static org.assertj.core.api.Assertions.assertThat;

import com.tdd.tdd.restController.CalcRestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalcRestControllerTest {


 @Autowired
 CalcRestController calcRestController;


    @Test
    public void notNull() {
       assertThat(calcRestController).isNotNull();
    }
}
