/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.silfra.niss.exbond.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.domain.InbondMaster;
import com.silfra.niss.exbond.domain.InbondMasterPK;
import com.silfra.niss.exbond.repository.InbondMasterRepository;
import com.silfra.niss.exbond.services.InbondMasterService;

@Component("inbondMasterService")
public class InbondMasterServiceImpl implements InbondMasterService {

	private final InbondMasterRepository inbondMasterRepository;

	@Autowired
	public InbondMasterServiceImpl(InbondMasterRepository inbondMasterRepository) {
		this.inbondMasterRepository = inbondMasterRepository;
	}

	@Override
	public InbondMaster findInbondMasterByBeNoAndBeDateAndInvoiceNo(String beNo, String beDate, String invoiceNo) {

		InbondMaster inbondMaster = inbondMasterRepository.findInbondMasterByBeNoAndBeDateAndInvoiceNo(beNo, beDate, invoiceNo);

		return inbondMaster;
	}

	@Override
	public InbondMaster findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumber(String beNo, String beDate,
			String invoiceNo, String invoiceSerialNumber) {

		//InbondMaster inbondMaster = inbondMasterRepository.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumber(beNo, beDate, invoiceNo, invoiceSerialNumber);
		//System.out.println(inbondMaster);
		InbondMaster inbondMaster = inbondMasterRepository.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumberAndItemSrNo(beNo, beDate, invoiceNo, invoiceSerialNumber, "1");

		return inbondMaster;
	}
	
	@Override
	public InbondMaster findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumberAndItemSrNo(String beNo,
			String beDate, String invoiceNo, String invoiceSerialNumber, String itemSrNo) {

		InbondMaster inbondMaster = inbondMasterRepository.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumberAndItemSrNo(beNo, beDate, invoiceNo, invoiceSerialNumber, itemSrNo);

		return inbondMaster;
	}

	@Override
	public InbondMaster findInbondById(InbondMasterPK id) {

		InbondMaster inbondMaster = inbondMasterRepository.getOne(id);

		return inbondMaster;
	}

	@Override
	public List<InbondMaster> getAllInbondMaster() {
		List<InbondMaster> inbondMasterData = inbondMasterRepository.findAll();
		
		return inbondMasterData;
	}

}
