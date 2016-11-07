package com.silfra.niss.exbond.rest.lookup;

import org.springframework.beans.BeansException;

import com.silfra.niss.exbond.configuration.ConfigurationManager;
import com.silfra.niss.exbond.rest.processor.RestProcessor;

public class RestLookUp {
	
	@SuppressWarnings("rawtypes")
	public RestProcessor getService(String serviceType) throws BeansException, ClassNotFoundException {
		RestProcessor service = null;

		String className = ConfigurationManager.getInstance().getRestConfiguration().getRestConfigMap().get(serviceType);
		if (className != null && !className.isEmpty()) {
			service = (RestProcessor) ConfigurationManager.getInstance()
					.getConfiguration().getApplicationContext()
					.getBean(Class.forName(className));
		}

		return service;
	}
}
