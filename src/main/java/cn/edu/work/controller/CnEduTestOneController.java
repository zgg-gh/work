package cn.edu.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cn-edu-test-one-web")
public class CnEduTestOneController {

    @GetMapping("/helloWord")
    private String helloWord(){

        return "hello-word";
    }

}
