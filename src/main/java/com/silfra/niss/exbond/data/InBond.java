package com.silfra.niss.exbond.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InBond")
public class InBond {

	private String portOfOrigin = "";
	private String countryOfOrigin = "";
	private String countryOfConsignment = "";
	private String portOfShipment = "";
	private String packageCode = "";
	private String unitOfMeasurement = "";
	private String actualInvoiceNumber = "";
	private String unitQuantityCode = "";
	private String cth = "";
	private String ritcCode = "";
	private String ceth = "";
	private String unitPriceInvoiced = "";

	public String getPortOfOrigin() {
		return portOfOrigin;
	}

	public void setPortOfOrigin(String portOfOrigin) {
		this.portOfOrigin = portOfOrigin;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getCountryOfConsignment() {
		return countryOfConsignment;
	}

	public void setCountryOfConsignment(String countryOfConsignment) {
		this.countryOfConsignment = countryOfConsignment;
	}

	public String getPortOfShipment() {
		return portOfShipment;
	}

	public void setPortOfShipment(String portOfShipment) {
		this.portOfShipment = portOfShipment;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public String getActualInvoiceNumber() {
		return actualInvoiceNumber;
	}

	public void setActualInvoiceNumber(String actualInvoiceNumber) {
		this.actualInvoiceNumber = actualInvoiceNumber;
	}

	public String getUnitQuantityCode() {
		return unitQuantityCode;
	}

	public void setUnitQuantityCode(String unitQuantityCode) {
		this.unitQuantityCode = unitQuantityCode;
	}

	public String getCth() {
		return cth;
	}

	public void setCth(String cth) {
		this.cth = cth;
	}

	public String getRitcCode() {
		return ritcCode;
	}

	public void setRitcCode(String ritcCode) {
		this.ritcCode = ritcCode;
	}

	public String getCeth() {
		return ceth;
	}

	public void setCeth(String ceth) {
		this.ceth = ceth;
	}

	public String getUnitPriceInvoiced() {
		return unitPriceInvoiced;
	}

	public void setUnitPriceInvoiced(String unitPriceInvoiced) {
		this.unitPriceInvoiced = unitPriceInvoiced;
	}

}
