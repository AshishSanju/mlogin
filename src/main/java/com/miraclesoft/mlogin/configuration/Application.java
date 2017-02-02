/**
 * 
 */
package com.miraclesoft.mlogin.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Phani Mahesh
 *
 */
@SpringBootApplication
@ComponentScan({"com.miraclesoft.mlogin"})
public class Application {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);

	}

}
