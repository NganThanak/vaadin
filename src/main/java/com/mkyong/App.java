package com.mkyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    @Autowired
    private Student student;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/index")
    public String welcome(){
        return "Hello from spring boot"+ student.showInfo();
    }
}
