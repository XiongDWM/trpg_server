package com.xiong.trpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan("com.xiong.trpg.bean")
public class TrpgApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrpgApplication.class,args);
	}
}
