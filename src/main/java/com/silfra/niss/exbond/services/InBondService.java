package com.silfra.niss.exbond.services;

import java.util.List;

import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.data.InBond;
import com.silfra.niss.exbond.request.data.Item;

public interface InBondService {

	InBond getBeDataFromInBond(String beNo, String beDate, String invoiceNo, String invoiceSerialNo,String itemSrNo) throws Exception;

	InBond getInvoiceDataFromInBond(String beNo, String beDate, String invoiceNo, String invoiceSerialNumber)
			throws Exception;

	InBond getItemDataFromInBond(String userJobNo, String userJobDate, String invoiceNumber, String invoiceSerialNumber,
			String itemSrNo);

	ExbondRequest getRandomExbondRequest(int noOfItems);
	
	ExbondRequest getFilteredExbondRequest(List<Item> itemList);

}
