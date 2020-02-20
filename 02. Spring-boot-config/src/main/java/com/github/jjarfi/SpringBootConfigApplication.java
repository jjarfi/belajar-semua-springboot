package com.github.jjarfi;

import com.github.jjarfi.bean.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class SpringBootConfigApplication {

	public static void main(String[] args) {
		SpringApplication apps = new SpringApplication((SpringBootConfigApplication.class));
		apps.setAddCommandLineProperties(false);
		apps.run(args);
	}

}
