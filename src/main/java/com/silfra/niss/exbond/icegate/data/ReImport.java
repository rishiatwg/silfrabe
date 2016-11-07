package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ReImport")
public class ReImport {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String invoiceSerialNumber = "";
	private String itemSrNoInInvoice = "";
	private String shippingBillNo = "";
	private String shippingBillDate = "";
	private String portOfExport = "";
	private String invoiceNo = "";
	private String itemNo = "";
	private String notificationNo = "";
	private String notificationSrNo = "";
	private String exportFreight = "";
	private String exportInsurance = "";
	private String customsDuty = "";
	private String exciseDuty = "";

	public String getCustomHouseCode() {
		return customHouseCode;
	}

	public void setCustomHouseCode(String customHouseCode) {
		this.customHouseCode = customHouseCode;
	}

	public String getUserJobNo() {
		return userJobNo;
	}

	public void setUserJobNo(String userJobNo) {
		this.userJobNo = userJobNo;
	}

	public String getUserJobDate() {
		return userJobDate;
	}

	public void setUserJobDate(String userJobDate) {
		this.userJobDate = userJobDate;
	}

	public String getInvoiceSerialNumber() {
		return invoiceSerialNumber;
	}

	public void setInvoiceSerialNumber(String invoiceSerialNumber) {
		this.invoiceSerialNumber = invoiceSerialNumber;
	}

	public String getItemSrNoInInvoice() {
		return itemSrNoInInvoice;
	}

	public void setItemSrNoInInvoice(String itemSrNoInInvoice) {
		this.itemSrNoInInvoice = itemSrNoInInvoice;
	}

	public String getShippingBillNo() {
		return shippingBillNo;
	}

	public void setShippingBillNo(String shippingBillNo) {
		this.shippingBillNo = shippingBillNo;
	}

	public String getShippingBillDate() {
		return shippingBillDate;
	}

	public void setShippingBillDate(String shippingBillDate) {
		this.shippingBillDate = shippingBillDate;
	}

	public String getPortOfExport() {
		return portOfExport;
	}

	public void setPortOfExport(String portOfExport) {
		this.portOfExport = portOfExport;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getNotificationNo() {
		return notificationNo;
	}

	public void setNotificationNo(String notificationNo) {
		this.notificationNo = notificationNo;
	}

	public String getNotificationSrNo() {
		return notificationSrNo;
	}

	public void setNotificationSrNo(String notificationSrNo) {
		this.notificationSrNo = notificationSrNo;
	}

	public String getExportFreight() {
		return exportFreight;
	}

	public void setExportFreight(String exportFreight) {
		this.exportFreight = exportFreight;
	}

	public String getExportInsurance() {
		return exportInsurance;
	}

	public void setExportInsurance(String exportInsurance) {
		this.exportInsurance = exportInsurance;
	}

	public String getCustomsDuty() {
		return customsDuty;
	}

	public void setCustomsDuty(String customsDuty) {
		this.customsDuty = customsDuty;
	}

	public String getExciseDuty() {
		return exciseDuty;
	}

	public void setExciseDuty(String exciseDuty) {
		this.exciseDuty = exciseDuty;
	}

}
