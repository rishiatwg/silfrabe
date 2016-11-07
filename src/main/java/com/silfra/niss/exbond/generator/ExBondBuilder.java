package com.silfra.niss.exbond.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.data.ExbondRequest;
import com.silfra.niss.exbond.data.InBond;
import com.silfra.niss.exbond.data.StaticConfiguration;
import com.silfra.niss.exbond.icegate.data.BillOfEntry;
import com.silfra.niss.exbond.icegate.data.Cert;
import com.silfra.niss.exbond.icegate.data.ExBond;
import com.silfra.niss.exbond.icegate.data.Invoice;
import com.silfra.niss.exbond.icegate.data.Item;
import com.silfra.niss.exbond.icegate.data.MessageHeader;
import com.silfra.niss.exbond.services.InBondService;

@Component("exBondBuilder")
public class ExBondBuilder {

	private final InBondService inbondService;

	@Autowired
	public ExBondBuilder(InBondService inbondService) {
		this.inbondService = inbondService;
	}

	public ExBond build(StaticConfiguration staticConfiguration, ExbondRequest exbondRequest) {
		ExBond exBond = new ExBond();

		exBond.setHeader(generateMessageHeader(staticConfiguration, exbondRequest));
		exBond.setBe(generateBE(staticConfiguration, exbondRequest));
		exBond.setInvoices(generateInvoices(staticConfiguration, exbondRequest));
		exBond.setItems(generateItems(staticConfiguration, exbondRequest));
		
		if(exbondRequest.getCert() != null && exbondRequest.getCert().getCertificateNumber() != null && !exbondRequest.getCert().getCertificateNumber().isEmpty()) {
			exBond.setCert(generateCert(staticConfiguration, exbondRequest));
		}

		return exBond;
	}

	private Cert generateCert(StaticConfiguration staticConfiguration, ExbondRequest exbondRequest) {
		Cert cert = new Cert();
		
		cert.setUserJobNo(exbondRequest.getCommon().getUserJobNo());
		cert.setUserJobDate(exbondRequest.getCommon().getUserJobDate());
		cert.setCustomHouseCode(exbondRequest.getCommon().getCustomHouseCode());
		cert.setCertificateNumber(exbondRequest.getCert().getCertificateNumber());
		cert.setCertificateDate(exbondRequest.getCert().getCertificateDate());
		cert.setCertificateType(exbondRequest.getCert().getCertificateType());
		
		return cert;
	}

	private List<Item> generateItems(StaticConfiguration staticConfiguration, ExbondRequest exbondRequest) {
		List<Item> items = new ArrayList<Item>();
		for (Iterator<com.silfra.niss.exbond.request.data.Item> it = exbondRequest.getItems().iterator(); it
				.hasNext();) {

			Item item = new Item();
			com.silfra.niss.exbond.request.data.Item requestItem = it.next();
			item.setCustomHouseCode(exbondRequest.getCommon().getCustomHouseCode());
			item.setUserJobNo(exbondRequest.getCommon().getUserJobNo());
			item.setUserJobDate(exbondRequest.getCommon().getUserJobDate());
			item.setInvoiceSerialNumber(requestItem.getInvoiceSerialNumber());
			item.setItemSrNo(requestItem.getItemSrNo());
			item.setQuantity(requestItem.getQuantity());
			item.setBcdNotification(requestItem.getBcdNotification());
			item.setBcdNotificationSrNo(requestItem.getBcdNotificationSrNo());
			item.setCvdNotification(requestItem.getCvdNotification());
			item.setCvdNotificationSrNo(requestItem.getCvdNotificationSrNo());
			item.setAdditionalNotification1(requestItem.getAdditionalNotification1());
			item.setAdditionalNotification1SrNo(requestItem.getAdditionalNotification1SrNo());
			item.setCusEducessNotificationNumber(requestItem.getCusEducessNotificationNumber());
			item.setCusEducessNotificationNumberSrNo(requestItem.getCusEducessNotificationNumberSrNo());
			item.setCexEducessNotn(requestItem.getCexEducessNotn());
			item.setCexEducessNotnSlNo(requestItem.getCexEducessNotnSlNo());
			item.setIsRspApplicability(staticConfiguration.getIsRspApplicability());
			item.setIsReImport(staticConfiguration.getIsReImport());

			InBond inBond;
			try {
				System.out.println("New Item");
				System.out.println(exbondRequest.getCommon().getWarehouseBeNo());
				System.out.println(exbondRequest.getCommon().getWarehouseBeDate());
				System.out.println(requestItem.getInvoiceNumber());
				System.out.println(item.getInvoiceSerialNumber());
				System.out.println(item.getItemSrNo());
				inBond = inbondService.getItemDataFromInBond(exbondRequest.getCommon().getWarehouseBeNo(),
						exbondRequest.getCommon().getWarehouseBeDate(), requestItem.getInvoiceNumber(),
						item.getInvoiceSerialNumber(),item.getItemSrNo());
				
				item.setUnitQuantityCode(inBond.getUnitQuantityCode());
				//item.setCountryOfOrigin(inBond.getCountryOfOrigin()); //enter country of origin here
				item.setRitcCode(inBond.getRitcCode());
				item.setCth(inBond.getCth());
				item.setIsPreferentialStandard(staticConfiguration.getIsPreferentialStandard());
				item.setCeth(inBond.getCeth());
				item.setUnitPriceInvoiced(inBond.getUnitPriceInvoiced());

				items.add(item);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Got Items Exception");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return items;
	}

	private List<Invoice> generateInvoices(StaticConfiguration staticConfiguration, ExbondRequest exbondRequest) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		//Iterator<com.silfra.niss.exbond.request.data.Item> itm = exbondRequest.getItems().iterator();
		for (Iterator<com.silfra.niss.exbond.request.data.Invoice> it = exbondRequest.getInvoices().iterator();it
				.hasNext();) {
			com.silfra.niss.exbond.request.data.Invoice requestInvoice = it.next();
			//com.silfra.niss.exbond.request.data.Invoice requestItem = itm.next();
			Invoice invoice = new Invoice();
			invoice.setCustomHouseCode(exbondRequest.getCommon().getCustomHouseCode());
			invoice.setUserJobNo(exbondRequest.getCommon().getUserJobNo());
			invoice.setUserJobDate(exbondRequest.getCommon().getUserJobDate());
			invoice.setInvoiceSerialNumber(requestInvoice.getInvoiceSerialNumber());

			InBond inBond;
			try {
				System.out.println("New Invoice");
				System.out.println(exbondRequest.getCommon().getWarehouseBeNo());
				System.out.println(exbondRequest.getCommon().getWarehouseBeDate());
				System.out.println(requestInvoice.getInvoiceNumber());
				System.out.println(invoice.getInvoiceSerialNumber());
				//System.out.println(item.getItemSrNo());
				inBond = inbondService.getInvoiceDataFromInBond(exbondRequest.getCommon().getWarehouseBeNo(),
						exbondRequest.getCommon().getWarehouseBeDate(), requestInvoice.getInvoiceNumber(),
						invoice.getInvoiceSerialNumber());

				invoice.setActualInvoiceNumber(inBond.getActualInvoiceNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Got Invoice Exception");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			invoices.add(invoice);
			//itm.hasNext();
		}
		return invoices;
	}

	private BillOfEntry generateBE(StaticConfiguration staticConfiguration, ExbondRequest exbondRequest) {
		BillOfEntry be = new BillOfEntry();
		be.setCustomHouseCode(exbondRequest.getCommon().getCustomHouseCode());
		be.setUserJobNo(exbondRequest.getCommon().getUserJobNo());
		be.setUserJobDate(exbondRequest.getCommon().getUserJobDate());
		be.setBeType("X"/*staticConfiguration.getBeClass()*/); // hard coded to X
		be.setIecCode(exbondRequest.getBe().getIecCode());
		be.setBranchSrNo(exbondRequest.getBe().getBranchSrNo());
		be.setNameOfTheImporter(exbondRequest.getBe().getNameOfTheImporter());
		be.setAddress1(exbondRequest.getBe().getAddress1());
		be.setAddress2(exbondRequest.getBe().getAddress2());
		be.setCity(exbondRequest.getBe().getCity());
		be.setState(exbondRequest.getBe().getState());
		be.setPin(exbondRequest.getBe().getPin());
		be.setBeClass("N"/*staticConfiguration.getBeClass()*/); //
		be.setModeOfTransport(exbondRequest.getBe().getModeOfTransport());
		be.setImporterType(exbondRequest.getBe().getImporterType());
		be.setKachchaBe(staticConfiguration.getKachchaBe());
		be.setHighSeaSaleFlag(staticConfiguration.getHighSeaSaleFlag()); // what happend to port of origin
		be.setChaCode(staticConfiguration.getChaCode());
		be.setGreenChannelRequested(exbondRequest.getBe().getGreenChannelRequested());
		be.setSection48Requested(exbondRequest.getBe().getSection48Requested());
		be.setIsPriorBe(staticConfiguration.getIsPriorBe());
		be.setAuthorizedDealerCode(exbondRequest.getBe().getAuthorizedDealerCode());
		be.setFirstCheckRequested(exbondRequest.getBe().getFirstCheckRequested());
		be.setWarehouseCode(exbondRequest.getBe().getWarehouseCode());
		be.setWarehouseCustomsSiteId(exbondRequest.getCommon().getCustomHouseCode());
		be.setWarehouseBeNo(exbondRequest.getBe().getWarehouseBeNo());
		be.setWarehouseBeDate(exbondRequest.getBe().getWarehouseBeDate());
		be.setNoOfPackagesReleased(exbondRequest.getBe().getNoOfPackagesReleased());
		be.setGrossWeight(exbondRequest.getBe().getGrossWeight());
		be.setAdditionalChargesIfAnyPurchaseOnHighSeas(
				staticConfiguration.getAdditionalChargesIfAnyPurchaseOnHighSeas());
		be.setMiscellaneousLoad(staticConfiguration.getMiscellaneousLoad());
		be.setPaymentMethodCode(staticConfiguration.getPaymentMethodCode());

		InBond inBond;
		try {
			System.out.println(exbondRequest.getCommon().getWarehouseBeNo());
			System.out.println(exbondRequest.getCommon().getWarehouseBeDate());
			System.out.println(exbondRequest.getInvoices().get(0).getInvoiceNumber());
			System.out.println(exbondRequest.getInvoices().get(0).getInvoiceSerialNumber());
			inBond = inbondService.getBeDataFromInBond(exbondRequest.getCommon().getWarehouseBeNo(),
					exbondRequest.getCommon().getWarehouseBeDate(), exbondRequest.getInvoices().get(0).getInvoiceNumber(), exbondRequest.getInvoices().get(0).getInvoiceSerialNumber(), "1"); //get the first record

			be.setPortOfOrigin(inBond.getPortOfOrigin());
			be.setCountryOfOrigin(inBond.getCountryOfOrigin());
			be.setCountryOfConsignment(inBond.getCountryOfOrigin());
			be.setPortOfShipment(inBond.getPortOfOrigin());
			be.setPackageCode(inBond.getPackageCode());
			be.setUnitOfMeasurement(inBond.getUnitOfMeasurement());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Got Exception in generate BE");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}

		return be;
	}

	private MessageHeader generateMessageHeader(StaticConfiguration staticConfiguration, ExbondRequest exbondRequest) {
		MessageHeader header = new MessageHeader();
		header.setSenderId(staticConfiguration.getSenderId()); //get senderID
		header.setReceiverId(exbondRequest.getCommon().getCustomHouseCode());
		header.setVersionNo(staticConfiguration.getVersionNo());
		header.setTpIndicator(staticConfiguration.getTpIndicator());
		header.setMessageId(staticConfiguration.getMessageId());
		header.setSequenceNo(exbondRequest.getCommon().getUserJobNo());
		header.setDate(exbondRequest.getCommon().getUserJobDate());
		header.setTime(exbondRequest.getCommon().getTime());

		return header;
	}
}
