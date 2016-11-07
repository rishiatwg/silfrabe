package com.silfra.niss.exbond.rest.controller;

import java.io.IOException;
import java.util.List;

import org.neo4j.cypher.internal.compiler.v2_1.commands.expressions.PathValueBuilder;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silfra.niss.exbond.constants.ExbondConstants;
import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.request.data.Item;
import com.silfra.niss.exbond.response.RestRequest;
import com.silfra.niss.exbond.response.RestResponse;
import com.silfra.niss.exbond.rest.delegators.RestDelegator;

@RestController
public class BEController {

	@Autowired
	private RestDelegator restDelegator;
	
	@RequestMapping(value = "/generate-be", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public RestResponse<String> generateBe(@RequestBody ExbondRequest exbondRequest) {
		restDelegator.setRequest(new RestRequest<ExbondRequest>(exbondRequest));
		restDelegator.setServiceType("GenerateBE");
		try {
			restDelegator.executeService();
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return restDelegator.getResponse();
	}
	
	@RequestMapping(value = "/request-exbond-request-json/{noOfItems}", method = RequestMethod.GET, produces = "application/json")
	public RestResponse<ExbondRequest> getExbondRequestJson(@PathVariable int noOfItems) {
		restDelegator.setRequest(new RestRequest<Integer>(noOfItems));
		restDelegator.setServiceType("RequestExbondRequestJSON");
		try {
			restDelegator.executeService();
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return restDelegator.getResponse();
	}
	
	@RequestMapping(value = "/request-exbond-request-json/filter", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public RestResponse<String> getExbondRequestJsonFiltered(@RequestBody List<Item> itemsRequest) {
		restDelegator.setRequest(new RestRequest<List<Item>>(itemsRequest));
		restDelegator.setServiceType("ExbondRequestJsonFiltered");
		try {
			restDelegator.executeService();
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return restDelegator.getResponse();
	}
	
	@RequestMapping(value = "/download/{fileName}", method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> downloadFile(@PathVariable String fileName) {
		
		ClassPathResource pdfFile = new ClassPathResource(ExbondConstants.OUTPUT_DIR + fileName);

	    try {
			return ResponseEntity
			        .ok()
			        .contentLength(pdfFile.contentLength())
			        .contentType(
			                MediaType.parseMediaType("application/octet-stream"))
			        .body(new InputStreamResource(pdfFile.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return null;		
	}
}
