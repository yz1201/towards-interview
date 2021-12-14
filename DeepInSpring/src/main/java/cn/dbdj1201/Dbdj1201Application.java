package cn.dbdj1201;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class Dbdj1201Application {

    public static void main(String[] args) {
        SpringApplication.run(Dbdj1201Application.class, args);
    }


    @RequestMapping("/test")
    public String test(){
        return "test hello";
    }


}
