package com.app.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.configuration.JpaConfig;
import com.app.configuration.RootConfig;
import com.app.configuration.SecurityConfiguration;
import com.app.configuration.WebAppConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class, JpaConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebAppConfig.class, SecurityConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*", "/htm", "/html", "/mvc", "/do" };
	}

}
