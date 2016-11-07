package com.silfra.niss.exbond.request.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

public class BE {
	private String iecCode = "";
	private String branchSrNo = "";
	private String nameOfTheImporter = "";
	private String address1 = "";
	private String address2 = "";
	private String city = "";
	private String state = "";
	private String pin = "";
	private String modeOfTransport = "";
	private String importerType = "";
	private String greenChannelRequested = "";
	private String section48Requested = "";
	private String authorizedDealerCode = "";
	private String firstCheckRequested = "";
	private String warehouseCode = "";
	private String warehouseCustomsSiteId = "";
	private String warehouseBeNo = "";
	private String warehouseBeDate = "";
	private String noOfPackagesReleased = "";
	private String grossWeight = "";

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

	public String getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}

}