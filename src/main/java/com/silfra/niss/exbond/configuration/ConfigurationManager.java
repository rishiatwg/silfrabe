package com.silfra.niss.exbond.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.silfra.niss.exbond.constants.ExbondConstants;

public class ConfigurationManager {

	private static ConfigurationManager configurationManager = null;

	private Configuration configuration;

	private RestConfiguration restConfiguration;
	
	private ConfigurationManager() {
		configuration = new Configuration();
		restConfiguration = new RestConfiguration();
	}

	public static ConfigurationManager getInstance() {

		if (configurationManager == null) {
			synchronized (ConfigurationManager.class) {
				if (configurationManager == null) {
					configurationManager = new ConfigurationManager();
					configurationManager.loadConfigurations();
				}
			}
		}

		return configurationManager;
	}

	private void loadConfigurations() {
		loadRestConfiguration();
	}

	private void loadRestConfiguration() {

		Properties properties = PropertyLoader
				.loadproperties(ExbondConstants.REST_CONFIG_FILE);

		Map<String, String> restMap = new HashMap<String, String>();

		for (String name : properties.stringPropertyNames()) {
			System.out.println(name + " " + properties.getProperty(name));
			restMap.put(name, properties.getProperty(name));
		}

		restConfiguration.setRestConfigMap(restMap);

	}
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public RestConfiguration getRestConfiguration() {
		return restConfiguration;
	}

	public void setRestConfiguration(RestConfiguration restConfiguration) {
		this.restConfiguration = restConfiguration;
	}
}
