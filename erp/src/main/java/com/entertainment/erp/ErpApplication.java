package com.entertainment.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
//用于设置哪些类不需要自动导入，例如需要设置多数据库连接时，DataSourceAutoConfiguration.class，就不会自动创建连接
@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class}*/)
//@ImportResource({"classpath:spring/spring-*.xml"})
//@PropertySource({"classpath:metrics.properties","classpath:disconf.properties",})
public class ErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}
}
