package com.shanshuan.rabbitmqhello;

import com.shanshuan.rabbitmqhello.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(RabbitmqHelloApplication.class)
public class RabbitmqHelloApplicationTests {

	@Autowired
	private Sender mysend;
	@Test
	public void contextLoads() {
		mysend.sned();
	}

}
