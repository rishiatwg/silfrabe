
package com.silfra.niss.exbond.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.data.StaticConfiguration;
import com.silfra.niss.exbond.domain.NissExbondStatic;
import com.silfra.niss.exbond.services.NissExbondStaticService;
import com.silfra.niss.exbond.services.StaticConfigurationService;

@Component("staticConfigurationService")
public class StaticConfigurationServiceImpl implements StaticConfigurationService {
	
	private final NissExbondStaticService nissExbondStaticService;
	
	@Autowired
	public StaticConfigurationServiceImpl(NissExbondStaticService nissExbondStaticService) {
		this.nissExbondStaticService = nissExbondStaticService;
	}

	@Override
	public StaticConfiguration getStaticConfiguration() throws Exception {
		StaticConfiguration staticConfiguration = new StaticConfiguration();
		
		NissExbondStatic nissExbondStatic = nissExbondStaticService.findNissExbondStaticById(1);
		
		staticConfiguration.setSenderId(nissExbondStatic.getSenderId());
		staticConfiguration.setVersionNo(nissExbondStatic.getVersionNo());
		staticConfiguration.setTpIndicator(nissExbondStatic.getTpIndicator());
		staticConfiguration.setMessageId(nissExbondStatic.getMessageId());
		staticConfiguration.setBeType(nissExbondStatic.getBeType());
		staticConfiguration.setBeClass(nissExbondStatic.getBeClass());
		staticConfiguration.setKachchaBe(nissExbondStatic.getKachchaBe());
		staticConfiguration.setHighSeaSaleFlag(nissExbondStatic.getHighSeaSaleFlag());
		staticConfiguration.setChaCode(nissExbondStatic.getChaCode());
		staticConfiguration.setIsPriorBe(nissExbondStatic.getIsPriorBe());
		staticConfiguration.setAdditionalChargesIfAnyPurchaseOnHighSeas(nissExbondStatic.getAdditionalChargesIfAnyPurchaseOnHighSeas());
		staticConfiguration.setMiscellaneousLoad(nissExbondStatic.getMiscellaneousLoad());
		staticConfiguration.setPaymentMethodCode(nissExbondStatic.getPaymentMethodCode());
		staticConfiguration.setIsPreferentialStandard(nissExbondStatic.getIsPreferentialStandard());
		staticConfiguration.setIsRspApplicability(nissExbondStatic.getIsRspApplicability());
		staticConfiguration.setIsReImport(nissExbondStatic.getIsReImport());
		
		return staticConfiguration;
	}
}
