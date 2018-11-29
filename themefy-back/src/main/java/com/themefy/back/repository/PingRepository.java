/**
 * 
 */
package com.themefy.back.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.themefy.back.entity.Ping;

/**
 * @author fangbe
 *
 */
public interface PingRepository extends MongoRepository<Ping, String> {

}
