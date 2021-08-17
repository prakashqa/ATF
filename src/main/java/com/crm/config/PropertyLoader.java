package com.crm.config;

import java.util.ResourceBundle;

public class PropertyLoader {
	
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("configuration");
	
	public static String getBrowser() {
		return RESOURCE_BUNDLE.getString("browserType");
	}
	
	public static String getUrl() {
		return RESOURCE_BUNDLE.getString("qaUrl");
	}

}
