package com.lucas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})*/
@SpringBootApplication
@MapperScan("com.lucas.mapper")
public class UserCenterApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserCenterApplication.class, args);
	}

}
