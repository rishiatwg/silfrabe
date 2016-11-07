package com.silfra.niss.exbond.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the inbond_master database table.
 * 
 */
@Embeddable
public class InbondMasterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="be_no")
	private String beNo;

	@Column(name="be_date")
	private String beDate;

	@Column(name="invoice_no")
	private String invoiceNo;

	@Column(name="invoice_serial_number")
	private String invoiceSerialNumber;

	@Column(name="invoice_date")
	private String invoiceDate;

	@Column(name="item_sr_no")
	private String itemSrNo;

	public InbondMasterPK() {
	}
	public String getBeNo() {
		return this.beNo;
	}
	public void setBeNo(String beNo) {
		this.beNo = beNo;
	}
	public String getBeDate() {
		return this.beDate;
	}
	public void setBeDate(String beDate) {
		this.beDate = beDate;
	}
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceSerialNumber() {
		return this.invoiceSerialNumber;
	}
	public void setInvoiceSerialNumber(String invoiceSerialNumber) {
		this.invoiceSerialNumber = invoiceSerialNumber;
	}
	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getItemSrNo() {
		return this.itemSrNo;
	}
	public void setItemSrNo(String itemSrNo) {
		this.itemSrNo = itemSrNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InbondMasterPK)) {
			return false;
		}
		InbondMasterPK castOther = (InbondMasterPK)other;
		return 
			this.beNo.equals(castOther.beNo)
			&& this.beDate.equals(castOther.beDate)
			&& this.invoiceNo.equals(castOther.invoiceNo)
			&& this.invoiceSerialNumber.equals(castOther.invoiceSerialNumber)
			&& this.invoiceDate.equals(castOther.invoiceDate)
			&& this.itemSrNo.equals(castOther.itemSrNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.beNo.hashCode();
		hash = hash * prime + this.beDate.hashCode();
		hash = hash * prime + this.invoiceNo.hashCode();
		hash = hash * prime + this.invoiceSerialNumber.hashCode();
		hash = hash * prime + this.invoiceDate.hashCode();
		hash = hash * prime + this.itemSrNo.hashCode();
		
		return hash;
	}
}