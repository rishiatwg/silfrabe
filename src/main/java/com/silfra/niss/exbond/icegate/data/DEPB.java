package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DEPB")
public class DEPB {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String invoiceSerialNumber = "";
	private String itemSrNoInInvoice = "";
	private String isExemptionRequired = "";
	private String bcdNotification = "";
	private String bcdNotificationSrNo = "";

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

	public String getIsExemptionRequired() {
		return isExemptionRequired;
	}

	public void setIsExemptionRequired(String isExemptionRequired) {
		this.isExemptionRequired = isExemptionRequired;
	}

	public String getBcdNotification() {
		return bcdNotification;
	}

	public void setBcdNotification(String bcdNotification) {
		this.bcdNotification = bcdNotification;
	}

	public String getBcdNotificationSrNo() {
		return bcdNotificationSrNo;
	}

	public void setBcdNotificationSrNo(String bcdNotificationSrNo) {
		this.bcdNotificationSrNo = bcdNotificationSrNo;
	}

}
