package com.silfra.niss.exbond.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unece_code database table.
 * 
 */
@Entity
@Table(name="unece_code")
@NamedQuery(name="UneceCode.findAll", query="SELECT u FROM UneceCode u")
public class UneceCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String air_Sea;

	private String city;

	private String EDI_code;

	private String icd;

	private String port;

	private String UNECE_code;

	public UneceCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAir_Sea() {
		return this.air_Sea;
	}

	public void setAir_Sea(String air_Sea) {
		this.air_Sea = air_Sea;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEDI_code() {
		return this.EDI_code;
	}

	public void setEDI_code(String EDI_code) {
		this.EDI_code = EDI_code;
	}

	public String getIcd() {
		return this.icd;
	}

	public void setIcd(String icd) {
		this.icd = icd;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUNECE_code() {
		return this.UNECE_code;
	}

	public void setUNECE_code(String UNECE_code) {
		this.UNECE_code = UNECE_code;
	}

}