package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Invoice")
public class Invoice {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String invoiceSerialNumber = "";
	private String actualInvoiceNumber = "";
	private String thirdPartyAddress1 = "";
	private String thirdPartyAddress2 = "";
	private String thirdPartyCity = "";
	private String thirdPartyCountrySubdvsn = "";
	private String thirdPartyCountryCode = "";
	private String thirdPartyPin = "";
	private String authorizedEconomicOperatorCode = "";
	private String authorizedEconomicOperatorCountry = "";
	private String authorizedEconomicOperatorRole = "";
	private String isBuyerAndSellerAreRelated = "";

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

	public String getActualInvoiceNumber() {
		return actualInvoiceNumber;
	}

	public void setActualInvoiceNumber(String actualInvoiceNumber) {
		this.actualInvoiceNumber = actualInvoiceNumber;
	}

	public String getThirdPartyAddress1() {
		return thirdPartyAddress1;
	}

	public void setThirdPartyAddress1(String thirdPartyAddress1) {
		this.thirdPartyAddress1 = thirdPartyAddress1;
	}

	public String getThirdPartyAddress2() {
		return thirdPartyAddress2;
	}

	public void setThirdPartyAddress2(String thirdPartyAddress2) {
		this.thirdPartyAddress2 = thirdPartyAddress2;
	}

	public String getThirdPartyCity() {
		return thirdPartyCity;
	}

	public void setThirdPartyCity(String thirdPartyCity) {
		this.thirdPartyCity = thirdPartyCity;
	}

	public String getThirdPartyCountrySubdvsn() {
		return thirdPartyCountrySubdvsn;
	}

	public void setThirdPartyCountrySubdvsn(String thirdPartyCountrySubdvsn) {
		this.thirdPartyCountrySubdvsn = thirdPartyCountrySubdvsn;
	}

	public String getThirdPartyCountryCode() {
		return thirdPartyCountryCode;
	}

	public void setThirdPartyCountryCode(String thirdPartyCountryCode) {
		this.thirdPartyCountryCode = thirdPartyCountryCode;
	}

	public String getThirdPartyPin() {
		return thirdPartyPin;
	}

	public void setThirdPartyPin(String thirdPartyPin) {
		this.thirdPartyPin = thirdPartyPin;
	}

	public String getAuthorizedEconomicOperatorCode() {
		return authorizedEconomicOperatorCode;
	}

	public void setAuthorizedEconomicOperatorCode(String authorizedEconomicOperatorCode) {
		this.authorizedEconomicOperatorCode = authorizedEconomicOperatorCode;
	}

	public String getAuthorizedEconomicOperatorCountry() {
		return authorizedEconomicOperatorCountry;
	}

	public void setAuthorizedEconomicOperatorCountry(String authorizedEconomicOperatorCountry) {
		this.authorizedEconomicOperatorCountry = authorizedEconomicOperatorCountry;
	}

	public String getAuthorizedEconomicOperatorRole() {
		return authorizedEconomicOperatorRole;
	}

	public void setAuthorizedEconomicOperatorRole(String authorizedEconomicOperatorRole) {
		this.authorizedEconomicOperatorRole = authorizedEconomicOperatorRole;
	}

	public String getIsBuyerAndSellerAreRelated() {
		return isBuyerAndSellerAreRelated;
	}

	public void setIsBuyerAndSellerAreRelated(String isBuyerAndSellerAreRelated) {
		this.isBuyerAndSellerAreRelated = isBuyerAndSellerAreRelated;
	}

}