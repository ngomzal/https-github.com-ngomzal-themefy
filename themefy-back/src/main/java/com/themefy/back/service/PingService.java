/**
 * 
 */
package com.themefy.back.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.themefy.back.entity.Ping;
import com.themefy.back.repository.PingRepository;

/**
 * @author fangbe
 *
 */
@Service
public class PingService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PingService.class);
	
	@Autowired
	private PingRepository pingRepository;

	/**
	 * 
	 */
	public PingService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return
	 */
	public String ping(){
		return "pong(from service)";
	}
	
	/**
	 * 
	 * @param ping
	 */
	@Transactional
	public void create(Ping ping){
		pingRepository.save(ping);
	}
	
	/**
	 * 
	 * @return
	 */
	public Iterable<Ping> findAll(){
		LOGGER.info("-start findAll");
		Iterable<Ping> result = pingRepository.findAll();
		LOGGER.info("-end findAll");
		return result;
	}

}
