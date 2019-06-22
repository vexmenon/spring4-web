package com.web.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
public class AppInitializer implements WebApplicationInitializer{
	
	//Method is scanned on spring application startup since the WebApplicationIntiliazer
	public void onStartup(ServletContext container) throws ServletException {
	   
		/*
		 * Creates the root application context based on java config class provided
		 * It also supports serving xml definition from classpath or filesystem
		 */
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebMvcConfig.class);
		
		
		ctx.setServletContext(container);
		//Creates the dispatcher servlet
		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}
