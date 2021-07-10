package com.franktran.spring.web.mvc.startup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc // <mvc:annotation-driven />
@ComponentScan(basePackages = "com.franktran.spring.web.mvc") // <context:component-scan base-package="com.franktran.spring.web.mvc" />
@Configuration
public class ApplicationContextConfig {

  /**
   * <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
   *   <property name="prefix" value="/WEB-INF/jsp/" />
   *   <property name="suffix" value=".jsp" />
   * </bean>
   */
  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/jsp/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
  }
}
