package com.ginkgo.service.Utils;

public class IDCreator {

    /*生成一个uuid*/
    public static String newId() {
        return java.util.UUID.randomUUID().toString().replaceAll("-","");
    }
}