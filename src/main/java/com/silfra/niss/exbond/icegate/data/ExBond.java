package com.silfra.niss.exbond.icegate.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ExBond")
public class ExBond {

	@XmlElement(required = true)
	private MessageHeader header;

	@XmlElement(required = true)
	private BillOfEntry be;

	@XmlElement(required = true)
	private List<Invoice> invoices;
	
	@XmlElement(required = true)
	private List<Item> items;
	
	private Licence licence;
	
	private RSP rsp;
	
	private DEPB depb;
	
	private Bond bond;
	
	private Cert cert;
	
	private ReImport reimport;
	
	private Duty sbeduty;
	
	private CommercialTax ctx;

	public MessageHeader getHeader() {
		return header;
	}

	public void setHeader(MessageHeader header) {
		this.header = header;
	}

	public BillOfEntry getBe() {
		return be;
	}

	public void setBe(BillOfEntry be) {
		this.be = be;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Licence getLicence() {
		return licence;
	}

	public void setLicence(Licence licence) {
		this.licence = licence;
	}

	public RSP getRsp() {
		return rsp;
	}

	public void setRsp(RSP rsp) {
		this.rsp = rsp;
	}

	public DEPB getDepb() {
		return depb;
	}

	public void setDepb(DEPB depb) {
		this.depb = depb;
	}

	public Bond getBond() {
		return bond;
	}

	public void setBond(Bond bond) {
		this.bond = bond;
	}

	public Cert getCert() {
		return cert;
	}

	public void setCert(Cert cert) {
		this.cert = cert;
	}

	public ReImport getReimport() {
		return reimport;
	}

	public void setReimport(ReImport reimport) {
		this.reimport = reimport;
	}

	public Duty getSbeduty() {
		return sbeduty;
	}

	public void setSbeduty(Duty sbeduty) {
		this.sbeduty = sbeduty;
	}

	public CommercialTax getCtx() {
		return ctx;
	}

	public void setCtx(CommercialTax ctx) {
		this.ctx = ctx;
	}

}
