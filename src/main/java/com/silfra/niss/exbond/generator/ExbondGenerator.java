package com.silfra.niss.exbond.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.constants.ExbondConstants;
import com.silfra.niss.exbond.icegate.data.ExBond;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Component("exbondGenerator")
public class ExbondGenerator {

	public File generateExbondBE(ExBond exBond) {
		
		File beFile = new File(generateFileName(exBond));
		try {
			beFile.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Freemarker configuration object
		Configuration cfg = new Configuration();
		
		try {
			//Set templates folder
			TemplateLoader loader = new FileTemplateLoader(new File(ExbondConstants.TEMPLATE_DIR));
			cfg.setTemplateLoader(loader);
			
			// Load template from template folder
			Template template = cfg.getTemplate(ExbondConstants.TEMPLATE_FILE);

			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("delimiter", (char) 29);
			data.put("exBond", exBond);

			/*// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();*/

			// File output
			Writer fileWriter = new FileWriter(beFile);
			template.process(data, fileWriter);
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
		
		return beFile;
	}

	private String generateFileName(ExBond exBond) {
		String fileName = "";
		
		fileName = ExbondConstants.OUTPUT_DIR + "00" + exBond.getHeader().getSequenceNo() + exBond.getHeader().getDate().substring(2, 4) + ".be";
		
		return fileName;
	}
}
