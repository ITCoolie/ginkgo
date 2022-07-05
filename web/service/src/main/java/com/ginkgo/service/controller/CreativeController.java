package com.ginkgo.service.controller;

import com.ginkgo.service.Result;
import com.ginkgo.service.Utils.IDCreator;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping(path = "/creative/v1")
public class CreativeController {

    @Autowired
    private TokenService accessService;

    @PostMapping("/upload_file")
    public Result UploadFile(@RequestParam String token, @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new Result(STATUS.UPLOAD_FILE_EMPTY);
        }

        String filename = file.getOriginalFilename();
        //获取后缀名
        String suffixname = filename.substring(filename.lastIndexOf("."));
        String tempDir = System.getProperty("java.io.tmpdir");
        String destPath = tempDir + "/" + IDCreator.newId();
        File dest = new File(destPath);

        //如果父目录不存在，则创建
        File parent = dest.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }

        try {
            file.transferTo(dest);
            return new Result(STATUS.OK);
        }
        catch (IllegalStateException stateEx) {
            stateEx.printStackTrace();
        }
        catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
        return new Result(STATUS.UPLOAD_STORE_FILE_WRONG);
    }
}
