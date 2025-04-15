package com.springbootdockerjenkinspipeline.springbootdockerjenkinspipelinedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SampleController {

    @GetMapping("/pipeline")
    String getResponse(){
        return "Hii this is jenkins pipeline project using docker";
    }
}
