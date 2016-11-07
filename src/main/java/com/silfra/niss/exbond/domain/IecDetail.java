package com.silfra.niss.exbond.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iec_details database table.
 * 
 */
@Entity
@Table(name="iec_details")
@NamedQuery(name="IecDetail.findAll", query="SELECT i FROM IecDetail i")
public class IecDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ad_code")
	private String adCode;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	private int br_sl_No;

	private String city;

	@Column(name="company_type")
	private String companyType;

	@Column(name="contact_person")
	private String contactPerson;

	private String email;

	private String fax;

	private String IEC_Code;

	@Column(name="importer_name")
	private String importerName;

	private String pan;

	@Column(name="postal_code")
	private int postalCode;

	private String state;

	private int telephone;

	public IecDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdCode() {
		return this.adCode;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getBr_sl_No() {
		return this.br_sl_No;
	}

	public void setBr_sl_No(int br_sl_No) {
		this.br_sl_No = br_sl_No;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIEC_Code() {
		return this.IEC_Code;
	}

	public void setIEC_Code(String IEC_Code) {
		this.IEC_Code = IEC_Code;
	}

	public String getImporterName() {
		return this.importerName;
	}

	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTelephone() {
		return this.telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

}