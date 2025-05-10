package com.ty;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.ty", "org.pack1", "org.pack2" })
public class AppConfig {

}
