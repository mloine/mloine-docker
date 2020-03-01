package com.mloine.docker.dockermloine.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "内容列表接口")
@RestController
public class MloineController {

    @GetMapping("/mloine")
    public String helloWorld(){
        return "mloine";
    }
    @GetMapping("/mloine3")
    public String helloWorld2(){
        return "mloine3";
    }
}
