package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RSP")
public class RSP {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String invoiceSerialNumber = "";
	private String itemSrNoInInvoice = "";
	private String itemSrNoInRsp = "";
	private String rsp = "";
	private String quantity = "";
	private String descriptionItem = "";
	private String rspNotification = "";
	private String rspNotificationSerialNo = "";

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

	public String getItemSrNoInRsp() {
		return itemSrNoInRsp;
	}

	public void setItemSrNoInRsp(String itemSrNoInRsp) {
		this.itemSrNoInRsp = itemSrNoInRsp;
	}

	public String getRsp() {
		return rsp;
	}

	public void setRsp(String rsp) {
		this.rsp = rsp;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDescriptionItem() {
		return descriptionItem;
	}

	public void setDescriptionItem(String descriptionItem) {
		this.descriptionItem = descriptionItem;
	}

	public String getRspNotification() {
		return rspNotification;
	}

	public void setRspNotification(String rspNotification) {
		this.rspNotification = rspNotification;
	}

	public String getRspNotificationSerialNo() {
		return rspNotificationSerialNo;
	}

	public void setRspNotificationSerialNo(String rspNotificationSerialNo) {
		this.rspNotificationSerialNo = rspNotificationSerialNo;
	}

}
