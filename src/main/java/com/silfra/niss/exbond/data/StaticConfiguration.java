package com.silfra.niss.exbond.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StaticConfiguration")
public class StaticConfiguration {

	private String senderId = "NISSBLR";
	private String versionNo = "";
	private String tpIndicator = "";
	private String messageId = "";
	private String beType = "X";
	private String beClass = "";
	private String kachchaBe = "";
	private String highSeaSaleFlag = "";
	private String chaCode = "";
	private String isPriorBe = "";
	private String additionalChargesIfAnyPurchaseOnHighSeas = "";
	private String miscellaneousLoad = "";
	private String paymentMethodCode = "";
	private String isPreferentialStandard = "";
	private String isRspApplicability = "";
	private String isReImport = "";

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getTpIndicator() {
		return tpIndicator;
	}

	public void setTpIndicator(String tpIndicator) {
		this.tpIndicator = tpIndicator;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getBeType() {
		return beType;
	}

	public void setBeType(String beType) {
		this.beType = beType;
	}

	public String getBeClass() {
		return beClass;
	}

	public void setBeClass(String beClass) {
		this.beClass = beClass;
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

	public String getChaCode() {
		return chaCode;
	}

	public void setChaCode(String chaCode) {
		this.chaCode = chaCode;
	}

	public String getIsPriorBe() {
		return isPriorBe;
	}

	public void setIsPriorBe(String isPriorBe) {
		this.isPriorBe = isPriorBe;
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

	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public String getIsPreferentialStandard() {
		return isPreferentialStandard;
	}

	public void setIsPreferentialStandard(String isPreferentialStandard) {
		this.isPreferentialStandard = isPreferentialStandard;
	}

	public String getIsRspApplicability() {
		return isRspApplicability;
	}

	public void setIsRspApplicability(String isRspApplicability) {
		this.isRspApplicability = isRspApplicability;
	}

	public String getIsReImport() {
		return isReImport;
	}

	public void setIsReImport(String isReImport) {
		this.isReImport = isReImport;
	}

}
