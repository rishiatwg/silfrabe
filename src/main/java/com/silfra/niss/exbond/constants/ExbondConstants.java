package com.silfra.niss.exbond.constants;

public class ExbondConstants {
	
	public static final String APP_HOME_DIR = System.getenv("NISS_HOME");
	
	public static final String APP_CONFIG_DIR = APP_HOME_DIR + "/conf/config/";
	
	public static final String REST_CONFIG_FILE = APP_CONFIG_DIR + "rest-config.properties";
	
	public static final String TEMPLATE_DIR = APP_HOME_DIR + "/conf/templates/";
	
	public static final String TEMPLATE_FILE = "exbond_template.ftl";
	
	public static final String OUTPUT_DIR = APP_HOME_DIR + "/generated-be/";
}
