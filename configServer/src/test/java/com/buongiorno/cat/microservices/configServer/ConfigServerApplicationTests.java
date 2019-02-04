package com.buongiorno.cat.microservices.configServer;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.Assert;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
@ContextConfiguration(classes = ConfigServerApp.class )
public class ConfigServerApplicationTests {

	
	private int port = 0;
	
	@Test
	public void contextLoads() {
	}

//	@Test
//	public void prueba1() {
//		ResponseEntity<Map> entity = new TestRestTemplate().getForEntity("http://localhost:" + port , Map.class);
//		Assert.assertEquals(HttpStatus.OK, entity.getStatusCode());
//	}

	
}

