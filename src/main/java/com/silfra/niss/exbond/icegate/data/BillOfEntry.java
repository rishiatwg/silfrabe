package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BillOfEntry")
public class BillOfEntry {

	@XmlElement(defaultValue = "")
	private String customHouseCode = "";
	@XmlElement(defaultValue = "")
	private String userJobNo = "";
	@XmlElement(defaultValue = "")
	private String userJobDate = "";
	@XmlElement(defaultValue = "")
	private String beType = "";
	@XmlElement(defaultValue = "")
	private String iecCode = "";
	@XmlElement(defaultValue = "")
	private String branchSrNo = "";
	@XmlElement(defaultValue = "")
	private String nameOfTheImporter = "";
	@XmlElement(defaultValue = "")
	private String address1 = "";
	@XmlElement(defaultValue = "")
	private String address2 = "";
	@XmlElement(defaultValue = "")
	private String city = "";
	@XmlElement(defaultValue = "")
	private String state = "";
	@XmlElement(defaultValue = "")
	private String pin = "";
	@XmlElement(defaultValue = "")
	private String beClass = "";
	@XmlElement(defaultValue = "")
	private String modeOfTransport = "";
	@XmlElement(defaultValue = "")
	private String importerType = "";
	@XmlElement(defaultValue = "")
	private String kachchaBe = "";
	@XmlElement(defaultValue = "")
	private String highSeaSaleFlag = "";
	@XmlElement(defaultValue = "")
	private String portOfOrigin = "";
	@XmlElement(defaultValue = "")
	private String chaCode = "";
	@XmlElement(defaultValue = "")
	private String countryOfOrigin = "";
	@XmlElement(defaultValue = "")
	private String countryOfConsignment = "";
	@XmlElement(defaultValue = "")
	private String portOfShipment = "";
	@XmlElement(defaultValue = "")
	private String greenChannelRequested = "";
	@XmlElement(defaultValue = "")
	private String section48Requested = "";
	@XmlElement(defaultValue = "")
	private String isPriorBe = "";
	@XmlElement(defaultValue = "")
	private String authorizedDealerCode = "";
	@XmlElement(defaultValue = "")
	private String firstCheckRequested = "";
	@XmlElement(defaultValue = "")
	private String warehouseCode = "";
	@XmlElement(defaultValue = "")
	private String warehouseCustomsSiteId = "";
	@XmlElement(defaultValue = "")
	private String warehouseBeNo = "";
	@XmlElement(defaultValue = "")
	private String warehouseBeDate = "";
	@XmlElement(defaultValue = "")
	private String noOfPackagesReleased = "";
	@XmlElement(defaultValue = "")
	private String packageCode = "";
	@XmlElement(defaultValue = "")
	private String grossWeight = "";
	@XmlElement(defaultValue = "")
	private String unitOfMeasurement = "";
	@XmlElement(defaultValue = "")
	private String additionalChargesIfAnyPurchaseOnHighSeas = "";
	@XmlElement(defaultValue = "")
	private String miscellaneousLoad = "";
	@XmlElement(defaultValue = "")
	private String fieldDescription = "";
	@XmlElement(defaultValue = "")
	private String uniqueConsignmnetReferenceNoUcrType = "";
	@XmlElement(defaultValue = "")
	private String paymentMethodCode = "";

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

	public String getBeType() {
		return beType;
	}

	public void setBeType(String beType) {
		this.beType = beType;
	}

	public String getIecCode() {
		return iecCode;
	}

	public void setIecCode(String iecCode) {
		this.iecCode = iecCode;
	}

	public String getBranchSrNo() {
		return branchSrNo;
	}

	public void setBranchSrNo(String branchSrNo) {
		this.branchSrNo = branchSrNo;
	}

	public String getNameOfTheImporter() {
		return nameOfTheImporter;
	}

	public void setNameOfTheImporter(String nameOfTheImporter) {
		this.nameOfTheImporter = nameOfTheImporter;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getBeClass() {
		return beClass;
	}

	public void setBeClass(String beClass) {
		this.beClass = beClass;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public String getImporterType() {
		return importerType;
	}

	public void setImporterType(String importerType) {
		this.importerType = importerType;
	}

	public String getKachchaBe() {
		return kachchaBe;
	}

	public void setKachchaBe(String kachchaBe) {
		this.kachchaBe = kachchaBe;
	}

	public String getHighSeaSaleFlag() {
		return highSeaSaleFlag;
	}

	public void setHighSeaSaleFlag(String highSeaSaleFlag) {
		this.highSeaSaleFlag = highSeaSaleFlag;
	}

	public String getPortOfOrigin() {
		return portOfOrigin;
	}

	public void setPortOfOrigin(String portOfOrigin) {
		this.portOfOrigin = portOfOrigin;
	}

	public String getChaCode() {
		return chaCode;
	}

	public void setChaCode(String chaCode) {
		this.chaCode = chaCode;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getCountryOfConsignmnet() {
		return countryOfConsignment;
	}

	public void setCountryOfConsignment(String countryOfConsignmnet) {
		this.countryOfConsignment = countryOfConsignmnet;
	}

	public String getPortOfShipment() {
		return portOfShipment;
	}

	public void setPortOfShipment(String portOfShipment) {
		this.portOfShipment = portOfShipment;
	}

	public String getGreenChannelRequested() {
		return greenChannelRequested;
	}

	public void setGreenChannelRequested(String greenChannelRequested) {
		this.greenChannelRequested = greenChannelRequested;
	}

	public String getSection48Requested() {
		return section48Requested;
	}

	public void setSection48Requested(String section48Requested) {
		this.section48Requested = section48Requested;
	}

	public String getIsPriorBe() {
		return isPriorBe;
	}

	public void setIsPriorBe(String isPriorBe) {
		this.isPriorBe = isPriorBe;
	}

	public String getAuthorizedDealerCode() {
		return authorizedDealerCode;
	}

	public void setAuthorizedDealerCode(String authorizedDealerCode) {
		this.authorizedDealerCode = authorizedDealerCode;
	}

	public String getFirstCheckRequested() {
		return firstCheckRequested;
	}

	public void setFirstCheckRequested(String firstCheckRequested) {
		this.firstCheckRequested = firstCheckRequested;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCustomsSiteId() {
		return warehouseCustomsSiteId;
	}

	public void setWarehouseCustomsSiteId(String warehouseCustomsSiteId) {
		this.warehouseCustomsSiteId = warehouseCustomsSiteId;
	}

	public String getWarehouseBeNo() {
		return warehouseBeNo;
	}

	public void setWarehouseBeNo(String warehouseBeNo) {
		this.warehouseBeNo = warehouseBeNo;
	}

	public String getWarehouseBeDate() {
		return warehouseBeDate;
	}

	public void setWarehouseBeDate(String warehouseBeDate) {
		this.warehouseBeDate = warehouseBeDate;
	}

	public String getNoOfPackagesReleased() {
		return noOfPackagesReleased;
	}

	public void setNoOfPackagesReleased(String noOfPackagesReleased) {
		this.noOfPackagesReleased = noOfPackagesReleased;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public String getAdditionalChargesIfAnyPurchaseOnHighSeas() {
		return additionalChargesIfAnyPurchaseOnHighSeas;
	}

	public void setAdditionalChargesIfAnyPurchaseOnHighSeas(String additionalChargesIfAnyPurchaseOnHighSeas) {
		this.additionalChargesIfAnyPurchaseOnHighSeas = additionalChargesIfAnyPurchaseOnHighSeas;
	}

	public String getMiscellaneousLoad() {
		return miscellaneousLoad;
	}

	public void setMiscellaneousLoad(String miscellaneousLoad) {
		this.miscellaneousLoad = miscellaneousLoad;
	}

	public String getFieldDescription() {
		return fieldDescription;
	}

	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}

	public String getUniqueConsignmnetReferenceNoUcrType() {
		return uniqueConsignmnetReferenceNoUcrType;
	}

	public void setUniqueConsignmnetReferenceNoUcrType(String uniqueConsignmnetReferenceNoUcrType) {
		this.uniqueConsignmnetReferenceNoUcrType = uniqueConsignmnetReferenceNoUcrType;
	}

	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

}
