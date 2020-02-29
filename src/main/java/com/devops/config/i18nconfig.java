package com.devops.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class i18nconfig {
	@Bean
	public ReloadableResourceBundleMessageSource messageSource () {
		ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource=new ReloadableResourceBundleMessageSource();
		reloadableResourceBundleMessageSource.setBasename("classpath:i18n/messages");
		reloadableResourceBundleMessageSource.setCacheSeconds(1800);
		return reloadableResourceBundleMessageSource;
		
		
	}

}
