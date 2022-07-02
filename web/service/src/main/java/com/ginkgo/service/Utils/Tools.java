package com.ginkgo.service.Utils;

import java.util.UUID;

public class Tools {

    public static String createId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}