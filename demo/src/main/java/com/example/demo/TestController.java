package com.example.demo;





import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @ResponseBody
    @RequestMapping("/index")
    public String demo(){
        return "hello world!";
    }


}
