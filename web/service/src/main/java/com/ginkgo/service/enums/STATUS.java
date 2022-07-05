package com.ginkgo.service.enums;

/*Status value*/
public interface STATUS {

    Integer OK = 0;

    Integer INVALID_ACCOUNT = -1;

    Integer INVALID_TOKEN = -2;

    Integer PARAMETER_WRONG = -3;

    //UPLOAD FILE
    Integer UPLOAD_FILE_EMPTY = -101;

    Integer UPLOAD_STORE_FILE_WRONG = -102;
}
