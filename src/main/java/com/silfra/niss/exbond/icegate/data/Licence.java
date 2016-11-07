package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Licence")
public class Licence {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String invoiceSerialNumber = "";
	private String itemSrNoInInvoice = "";
	private String itemSrNoInLicence = "";
	private String debitValue = "";
	private String debitQuantity = "";
	private String debitUnitOfMeasurement = "";
	private String licenceRegistrationNumber = "";
	private String licenceRegistrationDate = "";
	private String licenceCode = "";
	private String isRaLicenceRegnPort = "";

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

	public String getItemSrNoInLicence() {
		return itemSrNoInLicence;
	}

	public void setItemSrNoInLicence(String itemSrNoInLicence) {
		this.itemSrNoInLicence = itemSrNoInLicence;
	}

	public String getDebitValue() {
		return debitValue;
	}

	public void setDebitValue(String debitValue) {
		this.debitValue = debitValue;
	}

	public String getDebitQuantity() {
		return debitQuantity;
	}

	public void setDebitQuantity(String debitQuantity) {
		this.debitQuantity = debitQuantity;
	}

	public String getDebitUnitOfMeasurement() {
		return debitUnitOfMeasurement;
	}

	public void setDebitUnitOfMeasurement(String debitUnitOfMeasurement) {
		this.debitUnitOfMeasurement = debitUnitOfMeasurement;
	}

	public String getLicenceRegistrationNumber() {
		return licenceRegistrationNumber;
	}

	public void setLicenceRegistrationNumber(String licenceRegistrationNumber) {
		this.licenceRegistrationNumber = licenceRegistrationNumber;
	}

	public String getLicenceRegistrationDate() {
		return licenceRegistrationDate;
	}

	public void setLicenceRegistrationDate(String licenceRegistrationDate) {
		this.licenceRegistrationDate = licenceRegistrationDate;
	}

	public String getLicenceCode() {
		return licenceCode;
	}

	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

	public String getIsRaLicenceRegnPort() {
		return isRaLicenceRegnPort;
	}

	public void setIsRaLicenceRegnPort(String isRaLicenceRegnPort) {
		this.isRaLicenceRegnPort = isRaLicenceRegnPort;
	}

}
