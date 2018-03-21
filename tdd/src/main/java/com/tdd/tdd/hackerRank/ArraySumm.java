package com.tdd.tdd.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySumm {


    static int simpleArraySum(int[] ar) {

        if(ar.length==1){
            return ar[0];
        }else if(ar.length==0){
            return 0;
        }else {
           return Arrays.stream(ar).reduce(0,(a,b)-> a+b);
        }

    }
}
