package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CommercialTax")
public class CommercialTax {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String stateCode = "";
	private String commercialTaxType = "";
	private String commercialTaxRegistrationNo = "";

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

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getCommercialTaxType() {
		return commercialTaxType;
	}

	public void setCommercialTaxType(String commercialTaxType) {
		this.commercialTaxType = commercialTaxType;
	}

	public String getCommercialTaxRegistrationNo() {
		return commercialTaxRegistrationNo;
	}

	public void setCommercialTaxRegistrationNo(String commercialTaxRegistrationNo) {
		this.commercialTaxRegistrationNo = commercialTaxRegistrationNo;
	}

}
