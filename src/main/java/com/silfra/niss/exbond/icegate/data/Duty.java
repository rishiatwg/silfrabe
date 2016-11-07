package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Duty")
public class Duty {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String invoiceSerialNumber = "";
	private String itemSrNoInInvoice = "";
	private String notificationNo = "";
	private String notificationSrNo = "";
	private String dutyType = "";
	private String addlDutyFlag = "";
	private String itemSino = "";
	private String supplierSino = "";
	private String nou = "";

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

	public String getDutyType() {
		return dutyType;
	}

	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
	}

	public String getAddlDutyFlag() {
		return addlDutyFlag;
	}

	public void setAddlDutyFlag(String addlDutyFlag) {
		this.addlDutyFlag = addlDutyFlag;
	}

	public String getItemSino() {
		return itemSino;
	}

	public void setItemSino(String itemSino) {
		this.itemSino = itemSino;
	}

	public String getSupplierSino() {
		return supplierSino;
	}

	public void setSupplierSino(String supplierSino) {
		this.supplierSino = supplierSino;
	}

	public String getNou() {
		return nou;
	}

	public void setNou(String nou) {
		this.nou = nou;
	}

}
