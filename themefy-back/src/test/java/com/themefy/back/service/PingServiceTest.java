/**
 * 
 */
package com.themefy.back.service;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.themefy.back.entity.Ping;
import com.themefy.back.repository.PingRepository;

/**
 * @author fangbe
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PingServiceTest {
	
	@Autowired
	private PingService pingService;
	
	@MockBean
	private PingRepository pingRepository;
	
	/**
	 * 
	 */
	@Before
	public void before(){
		Ping ping = new Ping();
		ping.setId("1");
		ping.setName("ping1");
		ping.setMessage("message1");
		List<Ping> theList = Collections.singletonList(ping);
		
		Mockito.when(pingRepository.findAll()).thenReturn(theList);
	}

	/**
	 * 
	 */
	@Test
	public void testPing(){
		String expected = "pong(from service)";
		String result = pingService.ping();
		Assert.assertEquals(expected, result);
	}
	
	/**
	 * 
	 */
	@Test
	public void testList(){
		Ping ping = pingService.findAll().iterator().next();
		Assert.assertEquals("1", ping.getId());
		Assert.assertEquals("ping1", ping.getName());
		Assert.assertEquals("message1", ping.getMessage());
	}

}
