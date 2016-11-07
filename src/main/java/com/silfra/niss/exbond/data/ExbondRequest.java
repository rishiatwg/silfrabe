package com.silfra.niss.exbond.data;

import java.util.List;

import com.silfra.niss.exbond.request.data.BE;
import com.silfra.niss.exbond.request.data.Cert;
import com.silfra.niss.exbond.request.data.Common;
import com.silfra.niss.exbond.request.data.Invoice;
import com.silfra.niss.exbond.request.data.Item;

public class ExbondRequest {

	private Common common;

	private BE be;

	private List<Invoice> invoices;

	private List<Item> items;

	private Cert cert;

	public Common getCommon() {
		return common;
	}

	public void setCommon(Common common) {
		this.common = common;
	}

	public BE getBe() {
		return be;
	}

	public void setBe(BE be) {
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

	public Cert getCert() {
		return cert;
	}

	public void setCert(Cert cert) {
		this.cert = cert;
	}

}
