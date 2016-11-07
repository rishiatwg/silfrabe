package com.silfra.niss.exbond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.silfra.niss.exbond.configuration.ConfigurationManager;

@SpringBootApplication
public class ExbondApplication {
	
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ExbondApplication.class, args);
        ConfigurationManager.getInstance().getConfiguration().setApplicationContext(applicationContext);
    }
}
