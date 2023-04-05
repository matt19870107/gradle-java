package com.kingland.neusoft.gradle;

import com.kingland.neusoft.gradle.impl.MyTestServiceImpl;

public class Test {
    public static void main(String[] args) {
       String[] strs = new String[2];
       strs[0] = "test";
       for(String str: strs){
           System.out.println("++++++:"+str);
       }
    }
}
