/**
 * 
 */
package com.themefy.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.themefy.back.entity.Ping;
import com.themefy.back.service.PingService;

/**
 * @author fangbe
 *
 */
@RestController
@RequestMapping("/ping")
public class PingController {
	
	@Autowired
	private PingService pingService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return pingService.ping();
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public Iterable<Ping> list(){
		return pingService.findAll();
	}
	
	/**
	 * 
	 * @param ping
	 */
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public void save(Ping ping){
		pingService.create(ping);
	}

}
