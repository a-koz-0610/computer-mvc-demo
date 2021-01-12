package com.example.SpringDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringDemoApplicationTests {

	@Autowired
	private ComputerController compController;

	@Test
	void contextLoads() throws Exception {
		assertThat(compController).isNotNull();
	}

}
