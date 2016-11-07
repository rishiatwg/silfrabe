package com.silfra.niss.exbond.rest.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.data.InBond;
import com.silfra.niss.exbond.data.StaticConfiguration;
import com.silfra.niss.exbond.generator.ExBondBuilder;
import com.silfra.niss.exbond.generator.ExbondGenerator;
import com.silfra.niss.exbond.icegate.data.ExBond;
import com.silfra.niss.exbond.response.RestResponse;
import com.silfra.niss.exbond.services.InBondService;
import com.silfra.niss.exbond.services.StaticConfigurationService;

//Component annotation must be defined for creation of Autowired fields in Rest Controllers
@Component("requestExbondRequestJSONProcessor")
public class RequestExbondRequestJSONProcessor extends RestProcessor<RestResponse<ExbondRequest>>{

	@Autowired
	private InBondService inbondService;
	
	int noOfItems = 0;
	
	public InBondService getInbondService() {
		return inbondService;
	}

	public void setInbondService(InBondService inbondService) {
		this.inbondService = inbondService;
	}
	
	@Override
	protected void preProcess() {
		noOfItems = (Integer) request.data;
	}

	@Override
	protected void doProcess() {
		
		RestResponse<ExbondRequest> response = new RestResponse<ExbondRequest>();
		
        try {
        	ExbondRequest exbondRequest = inbondService.getRandomExbondRequest(noOfItems);
        	
        	response.setStatus(true);
        	response.setData(exbondRequest);
        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
        
        result = response;
	}
	
}
