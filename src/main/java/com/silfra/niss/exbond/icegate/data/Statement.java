package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Statement")
public class Statement {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String declarationType = "";
	private String declarationNumber = "";
	private String declarationDate = "";
	private String invoiceSerialNumber = "";
	private String itemSrNo = "";
	private String statementType = "";
	private String statementCode = "";
	private String statementText = "";

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

	public String getDeclarationType() {
		return declarationType;
	}

	public void setDeclarationType(String declarationType) {
		this.declarationType = declarationType;
	}

	public String getDeclarationNumber() {
		return declarationNumber;
	}

	public void setDeclarationNumber(String declarationNumber) {
		this.declarationNumber = declarationNumber;
	}

	public String getDeclarationDate() {
		return declarationDate;
	}

	public void setDeclarationDate(String declarationDate) {
		this.declarationDate = declarationDate;
	}

	public String getInvoiceSerialNumber() {
		return invoiceSerialNumber;
	}

	public void setInvoiceSerialNumber(String invoiceSerialNumber) {
		this.invoiceSerialNumber = invoiceSerialNumber;
	}

	public String getItemSrNo() {
		return itemSrNo;
	}

	public void setItemSrNo(String itemSrNo) {
		this.itemSrNo = itemSrNo;
	}

	public String getStatementType() {
		return statementType;
	}

	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}

	public String getStatementCode() {
		return statementCode;
	}

	public void setStatementCode(String statementCode) {
		this.statementCode = statementCode;
	}

	public String getStatementText() {
		return statementText;
	}

	public void setStatementText(String statementText) {
		this.statementText = statementText;
	}

}
