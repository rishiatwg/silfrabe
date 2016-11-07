package com.silfra.niss.exbond.icegate.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Bond")
public class Bond {

	private String customHouseCode = "";
	private String userJobNo = "";
	private String userJobDate = "";
	private String bondNumber = "";
	private String bondCode = "";
	private String bondPort = "";

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

	public String getBondNumber() {
		return bondNumber;
	}

	public void setBondNumber(String bondNumber) {
		this.bondNumber = bondNumber;
	}

	public String getBondCode() {
		return bondCode;
	}

	public void setBondCode(String bondCode) {
		this.bondCode = bondCode;
	}

	public String getBondPort() {
		return bondPort;
	}

	public void setBondPort(String bondPort) {
		this.bondPort = bondPort;
	}

}
