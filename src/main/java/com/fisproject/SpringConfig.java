package com.fisproject;

import com.fisproject.entity.Designer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.fisproject.entity")
@PropertySource("designerProperty.properties")
public class SpringConfig {

}
