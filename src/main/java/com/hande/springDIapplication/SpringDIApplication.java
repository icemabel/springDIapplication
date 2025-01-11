package com.hande.springDIapplication;

import com.hande.springDIapplication.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDIApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDIApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("In main method");
		System.out.println(controller.sayHallo());
	}

}
