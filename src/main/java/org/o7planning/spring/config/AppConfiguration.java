package org.o7planning.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.o7planning.spring.lang.Language;
import org.o7planning.spring.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"org.o7.spring.bean"})
public class AppConfiguration {

	@Bean(name="language")
	public Language getLanguage()
	{
		return new Vietnamese();
	}
}
