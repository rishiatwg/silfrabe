package com.silfra.niss.exbond.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.data.InBond;
import com.silfra.niss.exbond.domain.InbondMaster;
import com.silfra.niss.exbond.request.data.BE;
import com.silfra.niss.exbond.request.data.Cert;
import com.silfra.niss.exbond.request.data.Common;
import com.silfra.niss.exbond.request.data.Invoice;
import com.silfra.niss.exbond.request.data.Item;
import com.silfra.niss.exbond.services.InBondService;
import com.silfra.niss.exbond.services.InbondMasterService;

@Component("inBondService")
public class InBondServiceImpl implements InBondService {

	private final InbondMasterService inbondMasterService;

	@Autowired
	public InBondServiceImpl(InbondMasterService inbondMasterService) {
		this.inbondMasterService = inbondMasterService;
	}

	@Override
	public InBond getBeDataFromInBond(String beNo, String beDate, String invoiceNo, String invoiceSerialNo, String itemSrNo) throws Exception {
		InBond inBond = new InBond();
		System.out.println(beNo);
		System.out.println(beDate);
		System.out.println(invoiceNo);
		System.out.println(invoiceSerialNo);
		System.out.println(itemSrNo);
		InbondMaster inbondMaster = inbondMasterService.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumberAndItemSrNo(beNo, beDate,
				invoiceNo, invoiceSerialNo, itemSrNo);
		System.out.println("Found inbond master");
		System.out.println(inbondMaster);
		System.out.println(inbondMaster.getPortOfOrigin());
		System.out.println(inbondMaster.getCountryOfOrigin());
		System.out.println(inbondMaster.getCountryOfConsignment());
		System.out.println(inbondMaster.getPortOfShipment());
		inBond.setPortOfOrigin(inbondMaster.getPortOfOrigin());
		inBond.setCountryOfOrigin(inbondMaster.getCountryOfOrigin());
		inBond.setCountryOfConsignment(inbondMaster.getCountryOfConsignment());
		inBond.setPortOfShipment(inbondMaster.getPortOfShipment());
		inBond.setPackageCode(inbondMaster.getPackageCode());
		inBond.setUnitOfMeasurement(inbondMaster.getUnitOfMeasurement());

		return inBond;
	}

	@Override
	public InBond getInvoiceDataFromInBond(String beNo, String beDate, String invoiceNo, String invoiceSerialNumber)
			throws Exception {
		InBond inBond = new InBond();

		InbondMaster inbondMaster = inbondMasterService
				.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumber(beNo, beDate, invoiceNo,
						invoiceSerialNumber);

		inBond.setActualInvoiceNumber(inbondMaster.getActualInvoiceNumber());

		return inBond;
	}

	@Override
	public InBond getItemDataFromInBond(String beNo, String beDate, String invoiceNo, String invoiceSerialNumber,
			String itemSrNo) {
		InBond inBond = new InBond();

		InbondMaster inbondMaster = inbondMasterService
				.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumberAndItemSrNo(beNo, beDate, invoiceNo,
						invoiceSerialNumber, itemSrNo);

		inBond.setUnitQuantityCode(inbondMaster.getUnitQuantityCode());
		inBond.setRitcCode(inbondMaster.getRitcCode());
		inBond.setCth(inbondMaster.getCth());
		inBond.setCeth(inbondMaster.getCeth());
		inBond.setUnitPriceInvoiced(inbondMaster.getUnitPriceInvoiced());

		return inBond;
	}
	
	@Override
	public ExbondRequest getFilteredExbondRequest(List<Item> itemList) {
		
		ExbondRequest exbondRequest = new ExbondRequest();
		
		List<InbondMaster> selectedData = new ArrayList<InbondMaster>();
		for(Item item : itemList){
			selectedData.add(inbondMasterService.findInbondMasterByBeNoAndBeDateAndInvoiceNoAndInvoiceSerialNumberAndItemSrNo(
					item.getBeNumber(), item.getBeDate().toString(), item.getInvoiceNumber(), item.getInvoiceSerialNumber(), item.getItemSrNo()));
		}
		
		if (selectedData.size() > 0) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");

			InbondMaster inbondData = selectedData.get(0);

			Common common = generateCommonData(dateFormat, timeFormat, inbondData);

			BE be = generateBE(inbondData);

			List<Invoice> invoices = new ArrayList<Invoice>();

			List<Item> items = new ArrayList<Item>();

			Cert cert = generateCert();

			for (Iterator<InbondMaster> it = selectedData.iterator(); it.hasNext();) {
				inbondData = it.next();

				Invoice invoice = generateInvoice(inbondData);

				if (!invoices.contains(invoice)) {
					invoices.add(invoice);
				}

				Item item = generateItem(inbondData);

				items.add(item);
			}

			exbondRequest.setCommon(common);
			exbondRequest.setBe(be);
			exbondRequest.setInvoices(invoices);
			exbondRequest.setItems(items);
			exbondRequest.setCert(cert);	
			
		}
		return exbondRequest;
	}

	@Override
	public ExbondRequest getRandomExbondRequest(int noOfItems) {

		ExbondRequest exbondRequest = new ExbondRequest();

		List<InbondMaster> inbondMasterData = inbondMasterService.getAllInbondMaster();

		List<InbondMaster> selectedData = new ArrayList<InbondMaster>();

		Random rand = new Random();

		if (noOfItems > 0) {
			for (int i = 0; i < noOfItems; i++) {
				InbondMaster inbondData = inbondMasterData.get(noOfItems);

				if (!selectedData.contains(inbondData)) {
					selectedData.add(inbondData);
				}
			}

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");

			InbondMaster inbondData = selectedData.get(0);

			Common common = generateCommonData(dateFormat, timeFormat, inbondData);

			BE be = generateBE(inbondData);

			List<Invoice> invoices = new ArrayList<Invoice>();

			List<Item> items = new ArrayList<Item>();

			Cert cert = generateCert();

			for (Iterator<InbondMaster> it = selectedData.iterator(); it.hasNext();) {
				inbondData = it.next();

				Invoice invoice = generateInvoice(inbondData);

				if (!invoices.contains(invoice)) {
					invoices.add(invoice);
				}

				Item item = generateItem(inbondData);

				items.add(item);
			}

			exbondRequest.setCommon(common);
			exbondRequest.setBe(be);
			exbondRequest.setInvoices(invoices);
			exbondRequest.setItems(items);
			exbondRequest.setCert(cert);
		}

		return exbondRequest;
	}

	private Cert generateCert() {
		Cert cert = new Cert();

		cert.setCertificateNumber("LL-LRP/2228");
		cert.setCertificateDate("20160618");
		cert.setCertificateType("MS");

		return cert;
	}

	private Item generateItem(InbondMaster inbondData) {
		Item item = new Item();

		item.setBeNumber(inbondData.getId().getBeNo());
		item.setBeDate(inbondData.getId().getBeDate());
		item.setInvoiceNumber(inbondData.getId().getInvoiceNo());
		item.setInvoiceSerialNumber(inbondData.getId().getInvoiceSerialNumber());
		item.setItemSrNo(inbondData.getId().getItemSrNo());
		item.setQuantity(inbondData.getQuantity());

		return item;
	}

	private Invoice generateInvoice(InbondMaster inbondData) {
		Invoice invoice = new Invoice();

		invoice.setInvoiceNumber(inbondData.getId().getInvoiceNo());
		invoice.setInvoiceSerialNumber(inbondData.getId().getInvoiceSerialNumber());

		return invoice;
	}

	private BE generateBE(InbondMaster inbondData) {
		BE be = new BE();
		be.setIecCode(inbondData.getIEC_code());
		be.setBranchSrNo(inbondData.getBranchSrNo());
		be.setNameOfTheImporter(inbondData.getNameOfTheImporter());
		be.setAddress1(inbondData.getAddress1());
		be.setAddress2(inbondData.getAddress2());
		be.setCity(inbondData.getCity());
		be.setState(inbondData.getState());
		be.setPin(inbondData.getPin());
		be.setModeOfTransport(inbondData.getModeOfTransport());
		be.setImporterType(inbondData.getImporterType());
		be.setGreenChannelRequested(inbondData.getGreenChannelRequested());
		be.setSection48Requested(inbondData.getSection48Requested());
		be.setAuthorizedDealerCode(inbondData.getAuthorizedDealerCode());
		be.setFirstCheckRequested(inbondData.getWarehouseCode());
		be.setWarehouseCode(inbondData.getWarehouseCode());
		be.setWarehouseCustomsSiteId(inbondData.getWarehouseCustomsSiteId());
		be.setWarehouseBeNo(inbondData.getWarehouseBeNo());
		be.setWarehouseBeDate(inbondData.getWarehouseBeDate());
		be.setNoOfPackagesReleased(inbondData.getNoOfPackagesReleased());
		be.setGrossWeight(inbondData.getGrossWeight());
		return be;
	}

	private Common generateCommonData(SimpleDateFormat dateFormat, SimpleDateFormat timeFormat,
			InbondMaster inbondData) {
		Common common = new Common();
		common.setCustomHouseCode("INBLR4");
		common.setWarehouseBeNo(inbondData.getId().getBeNo());
		common.setWarehouseBeDate(inbondData.getId().getBeDate());
		common.setUserJobNo("560001");
		common.setUserJobDate(dateFormat.format(Calendar.getInstance().getTime()));
		common.setTime(timeFormat.format(Calendar.getInstance().getTime()));
		return common;
	}

	

}
