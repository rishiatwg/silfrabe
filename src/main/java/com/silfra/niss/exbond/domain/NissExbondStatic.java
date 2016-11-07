package com.silfra.niss.exbond.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the niss_exbond_static database table.
 * 
 */
@Entity
@Table(name="niss_exbond_static")
@NamedQuery(name="NissExbondStatic.findAll", query="SELECT n FROM NissExbondStatic n")
public class NissExbondStatic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="additional_charges_if_any_purchase_on_high_seas")
	private String additionalChargesIfAnyPurchaseOnHighSeas;

	@Column(name="be_class")
	private String beClass;

	@Column(name="be_type")
	private String beType;

	@Column(name="cha_code")
	private String chaCode;

	@Column(name="high_sea_sale_flag")
	private String highSeaSaleFlag;

	@Column(name="is_preferential_standard")
	private String isPreferentialStandard;

	@Column(name="is_prior_be")
	private String isPriorBe;

	@Column(name="is_re_import")
	private String isReImport;

	@Column(name="is_rsp_applicability")
	private String isRspApplicability;

	@Column(name="kachcha_be")
	private String kachchaBe;

	@Column(name="message_id")
	private String messageId;

	@Column(name="miscellaneous_load")
	private String miscellaneousLoad;

	@Column(name="payment_method_code")
	private String paymentMethodCode;

	@Column(name="sender_id")
	private String senderId;

	@Column(name="tp_indicator")
	private String tpIndicator;

	@Column(name="version_no")
	private String versionNo;

	public NissExbondStatic() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdditionalChargesIfAnyPurchaseOnHighSeas() {
		return this.additionalChargesIfAnyPurchaseOnHighSeas;
	}

	public void setAdditionalChargesIfAnyPurchaseOnHighSeas(String additionalChargesIfAnyPurchaseOnHighSeas) {
		this.additionalChargesIfAnyPurchaseOnHighSeas = additionalChargesIfAnyPurchaseOnHighSeas;
	}

	public String getBeClass() {
		return this.beClass;
	}

	public void setBeClass(String beClass) {
		this.beClass = beClass;
	}

	public String getBeType() {
		return this.beType;
	}

	public void setBeType(String beType) {
		this.beType = beType;
	}

	public String getChaCode() {
		return this.chaCode;
	}

	public void setChaCode(String chaCode) {
		this.chaCode = chaCode;
	}

	public String getHighSeaSaleFlag() {
		return this.highSeaSaleFlag;
	}

	public void setHighSeaSaleFlag(String highSeaSaleFlag) {
		this.highSeaSaleFlag = highSeaSaleFlag;
	}

	public String getIsPreferentialStandard() {
		return this.isPreferentialStandard;
	}

	public void setIsPreferentialStandard(String isPreferentialStandard) {
		this.isPreferentialStandard = isPreferentialStandard;
	}

	public String getIsPriorBe() {
		return this.isPriorBe;
	}

	public void setIsPriorBe(String isPriorBe) {
		this.isPriorBe = isPriorBe;
	}

	public String getIsReImport() {
		return this.isReImport;
	}

	public void setIsReImport(String isReImport) {
		this.isReImport = isReImport;
	}

	public String getIsRspApplicability() {
		return this.isRspApplicability;
	}

	public void setIsRspApplicability(String isRspApplicability) {
		this.isRspApplicability = isRspApplicability;
	}

	public String getKachchaBe() {
		return this.kachchaBe;
	}

	public void setKachchaBe(String kachchaBe) {
		this.kachchaBe = kachchaBe;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMiscellaneousLoad() {
		return this.miscellaneousLoad;
	}

	public void setMiscellaneousLoad(String miscellaneousLoad) {
		this.miscellaneousLoad = miscellaneousLoad;
	}

	public String getPaymentMethodCode() {
		return this.paymentMethodCode;
	}

	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getTpIndicator() {
		return this.tpIndicator;
	}

	public void setTpIndicator(String tpIndicator) {
		this.tpIndicator = tpIndicator;
	}

	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}