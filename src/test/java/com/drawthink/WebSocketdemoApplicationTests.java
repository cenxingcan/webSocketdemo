package com.drawthink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.StringUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebSocketdemoApplication.class)
@WebAppConfiguration
public class WebSocketdemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(StringUtils.replace("lincoln", "/", "%2F"));
	}

}
