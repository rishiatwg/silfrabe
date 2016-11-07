package com.silfra.niss.exbond.rest.delegators;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.response.RestRequest;
import com.silfra.niss.exbond.response.RestResponse;
import com.silfra.niss.exbond.rest.lookup.RestLookUp;
import com.silfra.niss.exbond.rest.processor.RestProcessor;
@Component("restDelegator")
public class RestDelegator {
	
	private RestResponse response = null;
	@SuppressWarnings("rawtypes")
	private RestRequest request = null;

	private RestLookUp lookupService = new RestLookUp();
	@SuppressWarnings("rawtypes")
	private RestProcessor restService;
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void executeService() throws BeansException, ClassNotFoundException {
		getService();
		response = (RestResponse) restService.execute();
	}
	
	private void getService() throws BeansException, ClassNotFoundException {
		restService = lookupService.getService(serviceType);
		restService.setRequest(request);
	}
	
	public RestResponse getResponse() {
		return response;
	}

	public void setResponse(RestResponse response) {
		this.response = response;
	}

	@SuppressWarnings("rawtypes")
	public RestRequest getRequest() {
		return request;
	}

	@SuppressWarnings("rawtypes")
	public void setRequest(RestRequest request) {
		this.request = request;
	}
}
