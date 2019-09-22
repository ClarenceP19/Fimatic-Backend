package com.Fimatic.fimatic.helper;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class ParseData {

    public String[] parseProducts(String productStr){

        String tempStr = productStr.substring(1,productStr.length()-1);
//        System.out.println("checking parse");
//        System.out.println(tempStr);
        return tempStr.split(",");
    }

    public double[] parseEffects(String effectStr){

        String tempStr = effectStr.substring(3,effectStr.length()-3);
//        System.out.println(effectStr);
//        System.out.println(tempStr);
//        System.out.println(tempStr.split(",")[0]);
//        System.out.println(Arrays.stream(tempStr.split(",")).mapToDouble(Double::parseDouble).toArray().toString());
//        System.out.println(Arrays.stream(tempStr.split(",")).mapToDouble(Double::parseDouble).toArray()[0]);
//        System.out.println(Arrays.stream(tempStr.split(",")).mapToDouble(Double::parseDouble).toArray()[1]);
//        System.out.println(Arrays.stream(tempStr.split(",")).mapToDouble(Double::parseDouble).toArray()[2]);
//        System.out.println(Arrays.stream(tempStr.split(",")).mapToDouble(Double::parseDouble).toArray()[3]);
        return Arrays.stream(tempStr.split(",")).mapToDouble(Double::parseDouble).toArray();
    }
}
