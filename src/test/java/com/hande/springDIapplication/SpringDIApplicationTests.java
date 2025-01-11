package com.hande.springDIapplication;

import com.hande.springDIapplication.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringDIApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHallo());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHallo());
	}

	@Test
	void contextLoads() {
	}

}
