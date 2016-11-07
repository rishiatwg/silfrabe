package com.silfra.niss.exbond.rest.processor;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.constants.ExbondConstants;
import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.response.RestResponse;

/**
 * @author bharadwd
 * Downloads the given file with the path sent from the server
 */
@Component("downloadFileProcessor")
public class DownloadFileProcessor extends RestProcessor<RestResponse<ExbondRequest>>{

	String fileName;
	
	@Override
	protected void preProcess() {
		fileName = (String) request.data;
	}
	
	@Override
	protected void doProcess() {
	}
	
	private File getFile(String fileName) {
        File file = new File(ExbondConstants.OUTPUT_DIR + fileName);
        try {
        	if (!file.exists()){
        		throw new FileNotFoundException("file with path: " + ExbondConstants.OUTPUT_DIR + fileName + " was not found.");
        	}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return file;
    }
}
