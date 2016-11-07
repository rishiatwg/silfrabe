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
@Component("generateBEProcessor")
public class GenerateBEProcessor extends RestProcessor<RestResponse<String>>{

	@Autowired
	private ExBondBuilder exBondBuilder;
	
	@Autowired
	private ExbondGenerator exbondGenerator;
	
	@Autowired
	private InBondService inbondService;
	
	@Autowired
	private StaticConfigurationService staticConfigurationService;
	
	private ExbondRequest exbondRequest;

	public InBondService getInbondService() {
		return inbondService;
	}

	public void setInbondService(InBondService inbondService) {
		this.inbondService = inbondService;
	}

	public StaticConfigurationService getStaticConfigurationService() {
		return staticConfigurationService;
	}

	public void setStaticConfigurationService(StaticConfigurationService staticConfigurationService) {
		this.staticConfigurationService = staticConfigurationService;
	}

	public ExbondRequest getExbondRequest() {
		return exbondRequest;
	}

	public void setExbondRequest(ExbondRequest exbondRequest) {
		this.exbondRequest = exbondRequest;
	}
	
	@Override
	protected void preProcess() {
		exbondRequest = (ExbondRequest) request.data;
	}

	@Override
	protected void doProcess() {
		
		RestResponse<String> response = new RestResponse<String>();
		
        try {
			StaticConfiguration staticConfiguration = this.staticConfigurationService.getStaticConfiguration();
			
			ExBond exBond = this.exBondBuilder.build(staticConfiguration, exbondRequest);
        	File beFile = this.exbondGenerator.generateExbondBE(exBond);
        	
        	BufferedReader br = new BufferedReader(new FileReader(beFile));
        	StringBuilder sb = new StringBuilder();
        	String line;
			while((line = br.readLine()) != null) {
        		sb.append(line);
        	}
        	
        	response.setStatus(true);
        	response.setData("/download/" + beFile.getName());
        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
        
        result = response;
	}
	
}
