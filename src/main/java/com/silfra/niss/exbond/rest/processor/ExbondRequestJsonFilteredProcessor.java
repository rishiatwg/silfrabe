package com.silfra.niss.exbond.rest.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.request.data.Item;
import com.silfra.niss.exbond.response.RestResponse;
import com.silfra.niss.exbond.services.InBondService;

@Component("requestExbondRequestJsonFilteredProcessor")
public class ExbondRequestJsonFilteredProcessor extends RestProcessor<RestResponse<ExbondRequest>> {
	
	@Autowired
	private InBondService inbondService;
	
	List<Item> itemList;
	
	public InBondService getInbondService() {
		return inbondService;
	}

	public void setInbondService(InBondService inbondService) {
		this.inbondService = inbondService;
	}
	
	@Override
	protected void preProcess() {
		itemList = (List<Item>) request.data;
	}

	@Override
	protected void doProcess() {
		
		RestResponse<ExbondRequest> response = new RestResponse<ExbondRequest>();
		
		try {
        	ExbondRequest exbondRequest = inbondService.getFilteredExbondRequest(itemList);
        	
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

