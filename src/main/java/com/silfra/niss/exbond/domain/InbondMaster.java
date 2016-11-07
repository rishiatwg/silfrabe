package com.silfra.niss.exbond.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inbond_master database table.
 * 
 */
@Entity
@Table(name="inbond_master")
@NamedQuery(name="InbondMaster.findAll", query="SELECT i FROM InbondMaster i")
public class InbondMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InbondMasterPK id;

	@Column(name="accessory_status")
	private String accessoryStatus;

	@Column(name="actual_invoice_number")
	private String actualInvoiceNumber;

	@Column(name="additional_charges_if_any_purchase_on_high_seas")
	private String additionalChargesIfAnyPurchaseOnHighSeas;

	@Column(name="additional_cvd_notn")
	private String additionalCvdNotn;

	@Column(name="additional_cvd_sr_no")
	private String additionalCvdSrNo;

	private String additional_notification_1_amount_SAD;

	private String additional_notification_1_percent_SAD;

	private String additional_notification_1_SAD;

	private String additional_notification_1_sr_no_SAD;

	@Column(name="additional_notification_2")
	private String additionalNotification2;

	@Column(name="additional_notification_2_amount")
	private String additionalNotification2Amount;

	@Column(name="additional_notification_2_percent")
	private String additionalNotification2Percent;

	@Column(name="additional_notification_2_sr_no")
	private String additionalNotification2SrNo;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	@Column(name="aggregate_duty_notn")
	private String aggregateDutyNotn;

	@Column(name="aggregate_duty_sr_no")
	private String aggregateDutySrNo;

	@Column(name="anti_dumping_duty_notification")
	private String antiDumpingDutyNotification;

	@Column(name="anti_dumping_duty_serial_number")
	private String antiDumpingDutySerialNumber;

	@Column(name="assessable_val")
	private String assessableVal;

	@Column(name="authorized_dealer_code")
	private String authorizedDealerCode;

	@Column(name="authorized_economic_operator_code")
	private String authorizedEconomicOperatorCode;

	@Column(name="authorized_economic_operator_country")
	private String authorizedEconomicOperatorCountry;

	@Column(name="authorized_economic_operator_role")
	private String authorizedEconomicOperatorRole;

	@Column(name="bcd_notification")
	private String bcdNotification;

	@Column(name="bcd_notification_amount")
	private String bcdNotificationAmount;

	@Column(name="bcd_notification_percent")
	private String bcdNotificationPercent;

	@Column(name="bcd_notification_sr_no")
	private String bcdNotificationSrNo;

	@Column(name="be_class")
	private String beClass;

	@Column(name="be_type")
	private String beType;

	@Column(name="branch_sr_no")
	private String branchSrNo;

	@Column(name="certificate_date")
	private String certificateDate;

	@Column(name="certificate_number")
	private String certificateNumber;

	@Column(name="certificate_type")
	private String certificateType;

	private String ceth;

	@Column(name="cex_educess_notn")
	private String cexEducessNotn;

	@Column(name="cex_educess_notn_amount")
	private String cexEducessNotnAmount;

	@Column(name="cex_educess_notn_percent")
	private String cexEducessNotnPercent;

	@Column(name="cex_educess_notn_sl_no")
	private String cexEducessNotnSlNo;

	@Column(name="cha_code")
	private String chaCode;

	private String city;

	@Column(name="country_of_consignment")
	private String countryOfConsignment;

	@Column(name="country_of_origin")
	private String countryOfOrigin;

	private String cth;

	@Column(name="cth_serial_number")
	private String cthSerialNumber;

	@Column(name="cus_educess_notification_amount")
	private String cusEducessNotificationAmount;

	@Column(name="cus_educess_notification_number")
	private String cusEducessNotificationNumber;

	@Column(name="cus_educess_notification_number_sr_no")
	private String cusEducessNotificationNumberSrNo;

	@Column(name="cus_educess_notification_percent")
	private String cusEducessNotificationPercent;

	@Column(name="custom_house_code_which_has_imposed_load")
	private String customHouseCodeWhichHasImposedLoad;

	@Column(name="customs_notn_exempting_central_excise_flag")
	private String customsNotnExemptingCentralExciseFlag;

	@Column(name="cvd_notification")
	private String cvdNotification;

	@Column(name="cvd_notification_amount")
	private String cvdNotificationAmount;

	@Column(name="cvd_notification_percent")
	private String cvdNotificationPercent;

	@Column(name="cvd_notification_sr_no")
	private String cvdNotificationSrNo;

	@Column(name="discount_amount")
	private String discountAmount;

	@Column(name="discount_rate")
	private String discountRate;

	@Column(name="first_check_requested")
	private String firstCheckRequested;

	private String frieght;

	@Column(name="green_channel_requested")
	private String greenChannelRequested;

	@Column(name="gross_weight")
	private String grossWeight;

	@Column(name="health_notn")
	private String healthNotn;

	@Column(name="health_sr_no")
	private String healthSrNo;

	@Column(name="high_sea_sale_flag")
	private String highSeaSaleFlag;

	private String IEC_code;

	@Column(name="importer_type")
	private String importerType;

	private String insurance;

	@Column(name="invoice_cur_exchange_rate")
	private String invoiceCurExchangeRate;

	@Column(name="invoice_currency")
	private String invoiceCurrency;

	@Column(name="is_buyer_and_seller_are_related")
	private String isBuyerAndSellerAreRelated;

	@Column(name="is_item_manufacturer_producer_code_type")
	private String isItemManufacturerProducerCodeType;

	@Column(name="is_item_manufacturer_producer_grower_address_1")
	private String isItemManufacturerProducerGrowerAddress1;

	@Column(name="is_item_manufacturer_producer_grower_address_2")
	private String isItemManufacturerProducerGrowerAddress2;

	@Column(name="is_item_manufacturer_producer_grower_city")
	private String isItemManufacturerProducerGrowerCity;

	@Column(name="is_item_manufacturer_producer_grower_code")
	private String isItemManufacturerProducerGrowerCode;

	@Column(name="is_item_manufacturer_producer_grower_country_subdivision")
	private String isItemManufacturerProducerGrowerCountrySubdivision;

	@Column(name="is_item_manufacturer_producer_grower_pin")
	private String isItemManufacturerProducerGrowerPin;

	@Column(name="is_load_final_provisional_on_assesable_value")
	private String isLoadFinalProvisionalOnAssesableValue;

	@Column(name="is_load_final_provisional_on_duty")
	private String isLoadFinalProvisionalOnDuty;

	@Column(name="is_preferential_standard")
	private String isPreferentialStandard;

	@Column(name="is_prior_be")
	private String isPriorBe;

	@Column(name="is_re_import")
	private String isReImport;

	@Column(name="is_rsp_applicability")
	private String isRspApplicability;

	@Column(name="item_category")
	private String itemCategory;

	@Column(name="item_manufacturer_cntry")
	private String itemManufacturerCntry;

	@Column(name="kachcha_be")
	private String kachchaBe;

	@Column(name="load_percent")
	private String loadPercent;

	@Column(name="miscellaneous_load")
	private String miscellaneousLoad;

	@Column(name="mode_of_transport")
	private String modeOfTransport;

	@Column(name="name_of_the_importer")
	private String nameOfTheImporter;

	@Column(name="ncd_notn")
	private String ncdNotn;

	@Column(name="ncd_notn_amount")
	private String ncdNotnAmount;

	@Column(name="ncd_notn_percent")
	private String ncdNotnPercent;

	@Column(name="ncd_sr_no")
	private String ncdSrNo;

	@Column(name="no_of_packages_released")
	private String noOfPackagesReleased;

	@Column(name="other_notification")
	private String otherNotification;

	@Column(name="other_notification_sr_no")
	private String otherNotificationSrNo;

	@Column(name="other_notification_sr_no_amount")
	private String otherNotificationSrNoAmount;

	@Column(name="other_notification_sr_no_percent")
	private String otherNotificationSrNoPercent;

	@Column(name="package_code")
	private String packageCode;

	@Column(name="payment_method_code")
	private String paymentMethodCode;

	private String pin;

	@Column(name="policy_para_no")
	private String policyParaNo;

	@Column(name="policy_year")
	private String policyYear;

	@Column(name="port_of_origin")
	private String portOfOrigin;

	@Column(name="port_of_shipment")
	private String portOfShipment;

	@Column(name="previous_be_date")
	private String previousBeDate;

	@Column(name="previous_currency_code")
	private String previousCurrencyCode;

	@Column(name="previous_custom_site")
	private String previousCustomSite;

	@Column(name="previous_unit_price")
	private String previousUnitPrice;

	@Column(name="previouse_be_no")
	private String previouseBeNo;

	private String product_CIF_val;

	@Column(name="product_desc")
	private String productDesc;

	@Column(name="qty_as_per_cth")
	private String qtyAsPerCth;

	private String quantity;

	@Column(name="quantity_as_per_anti_dumping_notn")
	private String quantityAsPerAntiDumpingNotn;

	@Column(name="quantity_as_per_cth")
	private String quantityAsPerCth;

	@Column(name="quantity_as_per_tariff_value_notn")
	private String quantityAsPerTariffValueNotn;

	@Column(name="ritc_code")
	private String ritcCode;

	@Column(name="safeguard_duty_noth_sr_no")
	private String safeguardDutyNothSrNo;

	@Column(name="safeguard_duty_notn")
	private String safeguardDutyNotn;

	@Column(name="sapta_notn")
	private String saptaNotn;

	@Column(name="sapta_serial_number")
	private String saptaSerialNumber;

	@Column(name="section_48_requested")
	private String section48Requested;

	@Column(name="source_country")
	private String sourceCountry;

	private String state;

	@Column(name="supplier_serial_number")
	private String supplierSerialNumber;

	@Column(name="svb_flag")
	private String svbFlag;

	@Column(name="svb_load_assessable_value")
	private String svbLoadAssessableValue;

	@Column(name="svb_load_on_duty")
	private String svbLoadOnDuty;

	@Column(name="svb_reference_date")
	private String svbReferenceDate;

	@Column(name="svb_reference_number")
	private String svbReferenceNumber;

	@Column(name="tariff_value_item_serial_number")
	private String tariffValueItemSerialNumber;

	@Column(name="tariff_value_notn")
	private String tariffValueNotn;

	@Column(name="third_party_address_1")
	private String thirdPartyAddress1;

	@Column(name="third_party_address_2")
	private String thirdPartyAddress2;

	@Column(name="third_party_city")
	private String thirdPartyCity;

	@Column(name="third_party_country_code")
	private String thirdPartyCountryCode;

	@Column(name="third_party_country_subdvsn")
	private String thirdPartyCountrySubdvsn;

	@Column(name="third_party_pin")
	private String thirdPartyPin;

	@Column(name="total_duty")
	private String totalDuty;

	@Column(name="total_inv_value")
	private String totalInvValue;

	@Column(name="transit_country")
	private String transitCountry;

	@Column(name="unique_consignment_reference_no_ucr_type")
	private String uniqueConsignmentReferenceNoUcrType;

	@Column(name="unit_of_measurement")
	private String unitOfMeasurement;

	@Column(name="unit_price_invoiced")
	private String unitPriceInvoiced;

	@Column(name="unit_quantity_code")
	private String unitQuantityCode;

	@Column(name="warehouse_be_date")
	private String warehouseBeDate;

	@Column(name="warehouse_be_no")
	private String warehouseBeNo;

	@Column(name="warehouse_code")
	private String warehouseCode;

	@Column(name="warehouse_customs_site_id")
	private String warehouseCustomsSiteId;

	public InbondMaster() {
	}

	public InbondMasterPK getId() {
		return this.id;
	}

	public void setId(InbondMasterPK id) {
		this.id = id;
	}

	public String getAccessoryStatus() {
		return this.accessoryStatus;
	}

	public void setAccessoryStatus(String accessoryStatus) {
		this.accessoryStatus = accessoryStatus;
	}

	public String getActualInvoiceNumber() {
		return this.actualInvoiceNumber;
	}

	public void setActualInvoiceNumber(String actualInvoiceNumber) {
		this.actualInvoiceNumber = actualInvoiceNumber;
	}

	public String getAdditionalChargesIfAnyPurchaseOnHighSeas() {
		return this.additionalChargesIfAnyPurchaseOnHighSeas;
	}

	public void setAdditionalChargesIfAnyPurchaseOnHighSeas(String additionalChargesIfAnyPurchaseOnHighSeas) {
		this.additionalChargesIfAnyPurchaseOnHighSeas = additionalChargesIfAnyPurchaseOnHighSeas;
	}

	public String getAdditionalCvdNotn() {
		return this.additionalCvdNotn;
	}

	public void setAdditionalCvdNotn(String additionalCvdNotn) {
		this.additionalCvdNotn = additionalCvdNotn;
	}

	public String getAdditionalCvdSrNo() {
		return this.additionalCvdSrNo;
	}

	public void setAdditionalCvdSrNo(String additionalCvdSrNo) {
		this.additionalCvdSrNo = additionalCvdSrNo;
	}

	public String getAdditional_notification_1_amount_SAD() {
		return this.additional_notification_1_amount_SAD;
	}

	public void setAdditional_notification_1_amount_SAD(String additional_notification_1_amount_SAD) {
		this.additional_notification_1_amount_SAD = additional_notification_1_amount_SAD;
	}

	public String getAdditional_notification_1_percent_SAD() {
		return this.additional_notification_1_percent_SAD;
	}

	public void setAdditional_notification_1_percent_SAD(String additional_notification_1_percent_SAD) {
		this.additional_notification_1_percent_SAD = additional_notification_1_percent_SAD;
	}

	public String getAdditional_notification_1_SAD() {
		return this.additional_notification_1_SAD;
	}

	public void setAdditional_notification_1_SAD(String additional_notification_1_SAD) {
		this.additional_notification_1_SAD = additional_notification_1_SAD;
	}

	public String getAdditional_notification_1_sr_no_SAD() {
		return this.additional_notification_1_sr_no_SAD;
	}

	public void setAdditional_notification_1_sr_no_SAD(String additional_notification_1_sr_no_SAD) {
		this.additional_notification_1_sr_no_SAD = additional_notification_1_sr_no_SAD;
	}

	public String getAdditionalNotification2() {
		return this.additionalNotification2;
	}

	public void setAdditionalNotification2(String additionalNotification2) {
		this.additionalNotification2 = additionalNotification2;
	}

	public String getAdditionalNotification2Amount() {
		return this.additionalNotification2Amount;
	}

	public void setAdditionalNotification2Amount(String additionalNotification2Amount) {
		this.additionalNotification2Amount = additionalNotification2Amount;
	}

	public String getAdditionalNotification2Percent() {
		return this.additionalNotification2Percent;
	}

	public void setAdditionalNotification2Percent(String additionalNotification2Percent) {
		this.additionalNotification2Percent = additionalNotification2Percent;
	}

	public String getAdditionalNotification2SrNo() {
		return this.additionalNotification2SrNo;
	}

	public void setAdditionalNotification2SrNo(String additionalNotification2SrNo) {
		this.additionalNotification2SrNo = additionalNotification2SrNo;
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

	public String getAggregateDutyNotn() {
		return this.aggregateDutyNotn;
	}

	public void setAggregateDutyNotn(String aggregateDutyNotn) {
		this.aggregateDutyNotn = aggregateDutyNotn;
	}

	public String getAggregateDutySrNo() {
		return this.aggregateDutySrNo;
	}

	public void setAggregateDutySrNo(String aggregateDutySrNo) {
		this.aggregateDutySrNo = aggregateDutySrNo;
	}

	public String getAntiDumpingDutyNotification() {
		return this.antiDumpingDutyNotification;
	}

	public void setAntiDumpingDutyNotification(String antiDumpingDutyNotification) {
		this.antiDumpingDutyNotification = antiDumpingDutyNotification;
	}

	public String getAntiDumpingDutySerialNumber() {
		return this.antiDumpingDutySerialNumber;
	}

	public void setAntiDumpingDutySerialNumber(String antiDumpingDutySerialNumber) {
		this.antiDumpingDutySerialNumber = antiDumpingDutySerialNumber;
	}

	public String getAssessableVal() {
		return this.assessableVal;
	}

	public void setAssessableVal(String assessableVal) {
		this.assessableVal = assessableVal;
	}

	public String getAuthorizedDealerCode() {
		return this.authorizedDealerCode;
	}

	public void setAuthorizedDealerCode(String authorizedDealerCode) {
		this.authorizedDealerCode = authorizedDealerCode;
	}

	public String getAuthorizedEconomicOperatorCode() {
		return this.authorizedEconomicOperatorCode;
	}

	public void setAuthorizedEconomicOperatorCode(String authorizedEconomicOperatorCode) {
		this.authorizedEconomicOperatorCode = authorizedEconomicOperatorCode;
	}

	public String getAuthorizedEconomicOperatorCountry() {
		return this.authorizedEconomicOperatorCountry;
	}

	public void setAuthorizedEconomicOperatorCountry(String authorizedEconomicOperatorCountry) {
		this.authorizedEconomicOperatorCountry = authorizedEconomicOperatorCountry;
	}

	public String getAuthorizedEconomicOperatorRole() {
		return this.authorizedEconomicOperatorRole;
	}

	public void setAuthorizedEconomicOperatorRole(String authorizedEconomicOperatorRole) {
		this.authorizedEconomicOperatorRole = authorizedEconomicOperatorRole;
	}

	public String getBcdNotification() {
		return this.bcdNotification;
	}

	public void setBcdNotification(String bcdNotification) {
		this.bcdNotification = bcdNotification;
	}

	public String getBcdNotificationAmount() {
		return this.bcdNotificationAmount;
	}

	public void setBcdNotificationAmount(String bcdNotificationAmount) {
		this.bcdNotificationAmount = bcdNotificationAmount;
	}

	public String getBcdNotificationPercent() {
		return this.bcdNotificationPercent;
	}

	public void setBcdNotificationPercent(String bcdNotificationPercent) {
		this.bcdNotificationPercent = bcdNotificationPercent;
	}

	public String getBcdNotificationSrNo() {
		return this.bcdNotificationSrNo;
	}

	public void setBcdNotificationSrNo(String bcdNotificationSrNo) {
		this.bcdNotificationSrNo = bcdNotificationSrNo;
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

	public String getBranchSrNo() {
		return this.branchSrNo;
	}

	public void setBranchSrNo(String branchSrNo) {
		this.branchSrNo = branchSrNo;
	}

	public String getCertificateDate() {
		return this.certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCeth() {
		return this.ceth;
	}

	public void setCeth(String ceth) {
		this.ceth = ceth;
	}

	public String getCexEducessNotn() {
		return this.cexEducessNotn;
	}

	public void setCexEducessNotn(String cexEducessNotn) {
		this.cexEducessNotn = cexEducessNotn;
	}

	public String getCexEducessNotnAmount() {
		return this.cexEducessNotnAmount;
	}

	public void setCexEducessNotnAmount(String cexEducessNotnAmount) {
		this.cexEducessNotnAmount = cexEducessNotnAmount;
	}

	public String getCexEducessNotnPercent() {
		return this.cexEducessNotnPercent;
	}

	public void setCexEducessNotnPercent(String cexEducessNotnPercent) {
		this.cexEducessNotnPercent = cexEducessNotnPercent;
	}

	public String getCexEducessNotnSlNo() {
		return this.cexEducessNotnSlNo;
	}

	public void setCexEducessNotnSlNo(String cexEducessNotnSlNo) {
		this.cexEducessNotnSlNo = cexEducessNotnSlNo;
	}

	public String getChaCode() {
		return this.chaCode;
	}

	public void setChaCode(String chaCode) {
		this.chaCode = chaCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryOfConsignment() {
		return this.countryOfConsignment;
	}

	public void setCountryOfConsignment(String countryOfConsignment) {
		this.countryOfConsignment = countryOfConsignment;
	}

	public String getCountryOfOrigin() {
		return this.countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getCth() {
		return this.cth;
	}

	public void setCth(String cth) {
		this.cth = cth;
	}

	public String getCthSerialNumber() {
		return this.cthSerialNumber;
	}

	public void setCthSerialNumber(String cthSerialNumber) {
		this.cthSerialNumber = cthSerialNumber;
	}

	public String getCusEducessNotificationAmount() {
		return this.cusEducessNotificationAmount;
	}

	public void setCusEducessNotificationAmount(String cusEducessNotificationAmount) {
		this.cusEducessNotificationAmount = cusEducessNotificationAmount;
	}

	public String getCusEducessNotificationNumber() {
		return this.cusEducessNotificationNumber;
	}

	public void setCusEducessNotificationNumber(String cusEducessNotificationNumber) {
		this.cusEducessNotificationNumber = cusEducessNotificationNumber;
	}

	public String getCusEducessNotificationNumberSrNo() {
		return this.cusEducessNotificationNumberSrNo;
	}

	public void setCusEducessNotificationNumberSrNo(String cusEducessNotificationNumberSrNo) {
		this.cusEducessNotificationNumberSrNo = cusEducessNotificationNumberSrNo;
	}

	public String getCusEducessNotificationPercent() {
		return this.cusEducessNotificationPercent;
	}

	public void setCusEducessNotificationPercent(String cusEducessNotificationPercent) {
		this.cusEducessNotificationPercent = cusEducessNotificationPercent;
	}

	public String getCustomHouseCodeWhichHasImposedLoad() {
		return this.customHouseCodeWhichHasImposedLoad;
	}

	public void setCustomHouseCodeWhichHasImposedLoad(String customHouseCodeWhichHasImposedLoad) {
		this.customHouseCodeWhichHasImposedLoad = customHouseCodeWhichHasImposedLoad;
	}

	public String getCustomsNotnExemptingCentralExciseFlag() {
		return this.customsNotnExemptingCentralExciseFlag;
	}

	public void setCustomsNotnExemptingCentralExciseFlag(String customsNotnExemptingCentralExciseFlag) {
		this.customsNotnExemptingCentralExciseFlag = customsNotnExemptingCentralExciseFlag;
	}

	public String getCvdNotification() {
		return this.cvdNotification;
	}

	public void setCvdNotification(String cvdNotification) {
		this.cvdNotification = cvdNotification;
	}

	public String getCvdNotificationAmount() {
		return this.cvdNotificationAmount;
	}

	public void setCvdNotificationAmount(String cvdNotificationAmount) {
		this.cvdNotificationAmount = cvdNotificationAmount;
	}

	public String getCvdNotificationPercent() {
		return this.cvdNotificationPercent;
	}

	public void setCvdNotificationPercent(String cvdNotificationPercent) {
		this.cvdNotificationPercent = cvdNotificationPercent;
	}

	public String getCvdNotificationSrNo() {
		return this.cvdNotificationSrNo;
	}

	public void setCvdNotificationSrNo(String cvdNotificationSrNo) {
		this.cvdNotificationSrNo = cvdNotificationSrNo;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public String getFirstCheckRequested() {
		return this.firstCheckRequested;
	}

	public void setFirstCheckRequested(String firstCheckRequested) {
		this.firstCheckRequested = firstCheckRequested;
	}

	public String getFrieght() {
		return this.frieght;
	}

	public void setFrieght(String frieght) {
		this.frieght = frieght;
	}

	public String getGreenChannelRequested() {
		return this.greenChannelRequested;
	}

	public void setGreenChannelRequested(String greenChannelRequested) {
		this.greenChannelRequested = greenChannelRequested;
	}

	public String getGrossWeight() {
		return this.grossWeight;
	}

	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getHealthNotn() {
		return this.healthNotn;
	}

	public void setHealthNotn(String healthNotn) {
		this.healthNotn = healthNotn;
	}

	public String getHealthSrNo() {
		return this.healthSrNo;
	}

	public void setHealthSrNo(String healthSrNo) {
		this.healthSrNo = healthSrNo;
	}

	public String getHighSeaSaleFlag() {
		return this.highSeaSaleFlag;
	}

	public void setHighSeaSaleFlag(String highSeaSaleFlag) {
		this.highSeaSaleFlag = highSeaSaleFlag;
	}

	public String getIEC_code() {
		return this.IEC_code;
	}

	public void setIEC_code(String IEC_code) {
		this.IEC_code = IEC_code;
	}

	public String getImporterType() {
		return this.importerType;
	}

	public void setImporterType(String importerType) {
		this.importerType = importerType;
	}

	public String getInsurance() {
		return this.insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getInvoiceCurExchangeRate() {
		return this.invoiceCurExchangeRate;
	}

	public void setInvoiceCurExchangeRate(String invoiceCurExchangeRate) {
		this.invoiceCurExchangeRate = invoiceCurExchangeRate;
	}

	public String getInvoiceCurrency() {
		return this.invoiceCurrency;
	}

	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}

	public String getIsBuyerAndSellerAreRelated() {
		return this.isBuyerAndSellerAreRelated;
	}

	public void setIsBuyerAndSellerAreRelated(String isBuyerAndSellerAreRelated) {
		this.isBuyerAndSellerAreRelated = isBuyerAndSellerAreRelated;
	}

	public String getIsItemManufacturerProducerCodeType() {
		return this.isItemManufacturerProducerCodeType;
	}

	public void setIsItemManufacturerProducerCodeType(String isItemManufacturerProducerCodeType) {
		this.isItemManufacturerProducerCodeType = isItemManufacturerProducerCodeType;
	}

	public String getIsItemManufacturerProducerGrowerAddress1() {
		return this.isItemManufacturerProducerGrowerAddress1;
	}

	public void setIsItemManufacturerProducerGrowerAddress1(String isItemManufacturerProducerGrowerAddress1) {
		this.isItemManufacturerProducerGrowerAddress1 = isItemManufacturerProducerGrowerAddress1;
	}

	public String getIsItemManufacturerProducerGrowerAddress2() {
		return this.isItemManufacturerProducerGrowerAddress2;
	}

	public void setIsItemManufacturerProducerGrowerAddress2(String isItemManufacturerProducerGrowerAddress2) {
		this.isItemManufacturerProducerGrowerAddress2 = isItemManufacturerProducerGrowerAddress2;
	}

	public String getIsItemManufacturerProducerGrowerCity() {
		return this.isItemManufacturerProducerGrowerCity;
	}

	public void setIsItemManufacturerProducerGrowerCity(String isItemManufacturerProducerGrowerCity) {
		this.isItemManufacturerProducerGrowerCity = isItemManufacturerProducerGrowerCity;
	}

	public String getIsItemManufacturerProducerGrowerCode() {
		return this.isItemManufacturerProducerGrowerCode;
	}

	public void setIsItemManufacturerProducerGrowerCode(String isItemManufacturerProducerGrowerCode) {
		this.isItemManufacturerProducerGrowerCode = isItemManufacturerProducerGrowerCode;
	}

	public String getIsItemManufacturerProducerGrowerCountrySubdivision() {
		return this.isItemManufacturerProducerGrowerCountrySubdivision;
	}

	public void setIsItemManufacturerProducerGrowerCountrySubdivision(String isItemManufacturerProducerGrowerCountrySubdivision) {
		this.isItemManufacturerProducerGrowerCountrySubdivision = isItemManufacturerProducerGrowerCountrySubdivision;
	}

	public String getIsItemManufacturerProducerGrowerPin() {
		return this.isItemManufacturerProducerGrowerPin;
	}

	public void setIsItemManufacturerProducerGrowerPin(String isItemManufacturerProducerGrowerPin) {
		this.isItemManufacturerProducerGrowerPin = isItemManufacturerProducerGrowerPin;
	}

	public String getIsLoadFinalProvisionalOnAssesableValue() {
		return this.isLoadFinalProvisionalOnAssesableValue;
	}

	public void setIsLoadFinalProvisionalOnAssesableValue(String isLoadFinalProvisionalOnAssesableValue) {
		this.isLoadFinalProvisionalOnAssesableValue = isLoadFinalProvisionalOnAssesableValue;
	}

	public String getIsLoadFinalProvisionalOnDuty() {
		return this.isLoadFinalProvisionalOnDuty;
	}

	public void setIsLoadFinalProvisionalOnDuty(String isLoadFinalProvisionalOnDuty) {
		this.isLoadFinalProvisionalOnDuty = isLoadFinalProvisionalOnDuty;
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

	public String getItemCategory() {
		return this.itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemManufacturerCntry() {
		return this.itemManufacturerCntry;
	}

	public void setItemManufacturerCntry(String itemManufacturerCntry) {
		this.itemManufacturerCntry = itemManufacturerCntry;
	}

	public String getKachchaBe() {
		return this.kachchaBe;
	}

	public void setKachchaBe(String kachchaBe) {
		this.kachchaBe = kachchaBe;
	}

	public String getLoadPercent() {
		return this.loadPercent;
	}

	public void setLoadPercent(String loadPercent) {
		this.loadPercent = loadPercent;
	}

	public String getMiscellaneousLoad() {
		return this.miscellaneousLoad;
	}

	public void setMiscellaneousLoad(String miscellaneousLoad) {
		this.miscellaneousLoad = miscellaneousLoad;
	}

	public String getModeOfTransport() {
		return this.modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public String getNameOfTheImporter() {
		return this.nameOfTheImporter;
	}

	public void setNameOfTheImporter(String nameOfTheImporter) {
		this.nameOfTheImporter = nameOfTheImporter;
	}

	public String getNcdNotn() {
		return this.ncdNotn;
	}

	public void setNcdNotn(String ncdNotn) {
		this.ncdNotn = ncdNotn;
	}

	public String getNcdNotnAmount() {
		return this.ncdNotnAmount;
	}

	public void setNcdNotnAmount(String ncdNotnAmount) {
		this.ncdNotnAmount = ncdNotnAmount;
	}

	public String getNcdNotnPercent() {
		return this.ncdNotnPercent;
	}

	public void setNcdNotnPercent(String ncdNotnPercent) {
		this.ncdNotnPercent = ncdNotnPercent;
	}

	public String getNcdSrNo() {
		return this.ncdSrNo;
	}

	public void setNcdSrNo(String ncdSrNo) {
		this.ncdSrNo = ncdSrNo;
	}

	public String getNoOfPackagesReleased() {
		return this.noOfPackagesReleased;
	}

	public void setNoOfPackagesReleased(String noOfPackagesReleased) {
		this.noOfPackagesReleased = noOfPackagesReleased;
	}

	public String getOtherNotification() {
		return this.otherNotification;
	}

	public void setOtherNotification(String otherNotification) {
		this.otherNotification = otherNotification;
	}

	public String getOtherNotificationSrNo() {
		return this.otherNotificationSrNo;
	}

	public void setOtherNotificationSrNo(String otherNotificationSrNo) {
		this.otherNotificationSrNo = otherNotificationSrNo;
	}

	public String getOtherNotificationSrNoAmount() {
		return this.otherNotificationSrNoAmount;
	}

	public void setOtherNotificationSrNoAmount(String otherNotificationSrNoAmount) {
		this.otherNotificationSrNoAmount = otherNotificationSrNoAmount;
	}

	public String getOtherNotificationSrNoPercent() {
		return this.otherNotificationSrNoPercent;
	}

	public void setOtherNotificationSrNoPercent(String otherNotificationSrNoPercent) {
		this.otherNotificationSrNoPercent = otherNotificationSrNoPercent;
	}

	public String getPackageCode() {
		return this.packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPaymentMethodCode() {
		return this.paymentMethodCode;
	}

	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getPolicyParaNo() {
		return this.policyParaNo;
	}

	public void setPolicyParaNo(String policyParaNo) {
		this.policyParaNo = policyParaNo;
	}

	public String getPolicyYear() {
		return this.policyYear;
	}

	public void setPolicyYear(String policyYear) {
		this.policyYear = policyYear;
	}

	public String getPortOfOrigin() {
		return this.portOfOrigin;
	}

	public void setPortOfOrigin(String portOfOrigin) {
		this.portOfOrigin = portOfOrigin;
	}

	public String getPortOfShipment() {
		return this.portOfShipment;
	}

	public void setPortOfShipment(String portOfShipment) {
		this.portOfShipment = portOfShipment;
	}

	public String getPreviousBeDate() {
		return this.previousBeDate;
	}

	public void setPreviousBeDate(String previousBeDate) {
		this.previousBeDate = previousBeDate;
	}

	public String getPreviousCurrencyCode() {
		return this.previousCurrencyCode;
	}

	public void setPreviousCurrencyCode(String previousCurrencyCode) {
		this.previousCurrencyCode = previousCurrencyCode;
	}

	public String getPreviousCustomSite() {
		return this.previousCustomSite;
	}

	public void setPreviousCustomSite(String previousCustomSite) {
		this.previousCustomSite = previousCustomSite;
	}

	public String getPreviousUnitPrice() {
		return this.previousUnitPrice;
	}

	public void setPreviousUnitPrice(String previousUnitPrice) {
		this.previousUnitPrice = previousUnitPrice;
	}

	public String getPreviouseBeNo() {
		return this.previouseBeNo;
	}

	public void setPreviouseBeNo(String previouseBeNo) {
		this.previouseBeNo = previouseBeNo;
	}

	public String getProduct_CIF_val() {
		return this.product_CIF_val;
	}

	public void setProduct_CIF_val(String product_CIF_val) {
		this.product_CIF_val = product_CIF_val;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getQtyAsPerCth() {
		return this.qtyAsPerCth;
	}

	public void setQtyAsPerCth(String qtyAsPerCth) {
		this.qtyAsPerCth = qtyAsPerCth;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuantityAsPerAntiDumpingNotn() {
		return this.quantityAsPerAntiDumpingNotn;
	}

	public void setQuantityAsPerAntiDumpingNotn(String quantityAsPerAntiDumpingNotn) {
		this.quantityAsPerAntiDumpingNotn = quantityAsPerAntiDumpingNotn;
	}

	public String getQuantityAsPerCth() {
		return this.quantityAsPerCth;
	}

	public void setQuantityAsPerCth(String quantityAsPerCth) {
		this.quantityAsPerCth = quantityAsPerCth;
	}

	public String getQuantityAsPerTariffValueNotn() {
		return this.quantityAsPerTariffValueNotn;
	}

	public void setQuantityAsPerTariffValueNotn(String quantityAsPerTariffValueNotn) {
		this.quantityAsPerTariffValueNotn = quantityAsPerTariffValueNotn;
	}

	public String getRitcCode() {
		return this.ritcCode;
	}

	public void setRitcCode(String ritcCode) {
		this.ritcCode = ritcCode;
	}

	public String getSafeguardDutyNothSrNo() {
		return this.safeguardDutyNothSrNo;
	}

	public void setSafeguardDutyNothSrNo(String safeguardDutyNothSrNo) {
		this.safeguardDutyNothSrNo = safeguardDutyNothSrNo;
	}

	public String getSafeguardDutyNotn() {
		return this.safeguardDutyNotn;
	}

	public void setSafeguardDutyNotn(String safeguardDutyNotn) {
		this.safeguardDutyNotn = safeguardDutyNotn;
	}

	public String getSaptaNotn() {
		return this.saptaNotn;
	}

	public void setSaptaNotn(String saptaNotn) {
		this.saptaNotn = saptaNotn;
	}

	public String getSaptaSerialNumber() {
		return this.saptaSerialNumber;
	}

	public void setSaptaSerialNumber(String saptaSerialNumber) {
		this.saptaSerialNumber = saptaSerialNumber;
	}

	public String getSection48Requested() {
		return this.section48Requested;
	}

	public void setSection48Requested(String section48Requested) {
		this.section48Requested = section48Requested;
	}

	public String getSourceCountry() {
		return this.sourceCountry;
	}

	public void setSourceCountry(String sourceCountry) {
		this.sourceCountry = sourceCountry;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSupplierSerialNumber() {
		return this.supplierSerialNumber;
	}

	public void setSupplierSerialNumber(String supplierSerialNumber) {
		this.supplierSerialNumber = supplierSerialNumber;
	}

	public String getSvbFlag() {
		return this.svbFlag;
	}

	public void setSvbFlag(String svbFlag) {
		this.svbFlag = svbFlag;
	}

	public String getSvbLoadAssessableValue() {
		return this.svbLoadAssessableValue;
	}

	public void setSvbLoadAssessableValue(String svbLoadAssessableValue) {
		this.svbLoadAssessableValue = svbLoadAssessableValue;
	}

	public String getSvbLoadOnDuty() {
		return this.svbLoadOnDuty;
	}

	public void setSvbLoadOnDuty(String svbLoadOnDuty) {
		this.svbLoadOnDuty = svbLoadOnDuty;
	}

	public String getSvbReferenceDate() {
		return this.svbReferenceDate;
	}

	public void setSvbReferenceDate(String svbReferenceDate) {
		this.svbReferenceDate = svbReferenceDate;
	}

	public String getSvbReferenceNumber() {
		return this.svbReferenceNumber;
	}

	public void setSvbReferenceNumber(String svbReferenceNumber) {
		this.svbReferenceNumber = svbReferenceNumber;
	}

	public String getTariffValueItemSerialNumber() {
		return this.tariffValueItemSerialNumber;
	}

	public void setTariffValueItemSerialNumber(String tariffValueItemSerialNumber) {
		this.tariffValueItemSerialNumber = tariffValueItemSerialNumber;
	}

	public String getTariffValueNotn() {
		return this.tariffValueNotn;
	}

	public void setTariffValueNotn(String tariffValueNotn) {
		this.tariffValueNotn = tariffValueNotn;
	}

	public String getThirdPartyAddress1() {
		return this.thirdPartyAddress1;
	}

	public void setThirdPartyAddress1(String thirdPartyAddress1) {
		this.thirdPartyAddress1 = thirdPartyAddress1;
	}

	public String getThirdPartyAddress2() {
		return this.thirdPartyAddress2;
	}

	public void setThirdPartyAddress2(String thirdPartyAddress2) {
		this.thirdPartyAddress2 = thirdPartyAddress2;
	}

	public String getThirdPartyCity() {
		return this.thirdPartyCity;
	}

	public void setThirdPartyCity(String thirdPartyCity) {
		this.thirdPartyCity = thirdPartyCity;
	}

	public String getThirdPartyCountryCode() {
		return this.thirdPartyCountryCode;
	}

	public void setThirdPartyCountryCode(String thirdPartyCountryCode) {
		this.thirdPartyCountryCode = thirdPartyCountryCode;
	}

	public String getThirdPartyCountrySubdvsn() {
		return this.thirdPartyCountrySubdvsn;
	}

	public void setThirdPartyCountrySubdvsn(String thirdPartyCountrySubdvsn) {
		this.thirdPartyCountrySubdvsn = thirdPartyCountrySubdvsn;
	}

	public String getThirdPartyPin() {
		return this.thirdPartyPin;
	}

	public void setThirdPartyPin(String thirdPartyPin) {
		this.thirdPartyPin = thirdPartyPin;
	}

	public String getTotalDuty() {
		return this.totalDuty;
	}

	public void setTotalDuty(String totalDuty) {
		this.totalDuty = totalDuty;
	}

	public String getTotalInvValue() {
		return this.totalInvValue;
	}

	public void setTotalInvValue(String totalInvValue) {
		this.totalInvValue = totalInvValue;
	}

	public String getTransitCountry() {
		return this.transitCountry;
	}

	public void setTransitCountry(String transitCountry) {
		this.transitCountry = transitCountry;
	}

	public String getUniqueConsignmentReferenceNoUcrType() {
		return this.uniqueConsignmentReferenceNoUcrType;
	}

	public void setUniqueConsignmentReferenceNoUcrType(String uniqueConsignmentReferenceNoUcrType) {
		this.uniqueConsignmentReferenceNoUcrType = uniqueConsignmentReferenceNoUcrType;
	}

	public String getUnitOfMeasurement() {
		return this.unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public String getUnitPriceInvoiced() {
		return this.unitPriceInvoiced;
	}

	public void setUnitPriceInvoiced(String unitPriceInvoiced) {
		this.unitPriceInvoiced = unitPriceInvoiced;
	}

	public String getUnitQuantityCode() {
		return this.unitQuantityCode;
	}

	public void setUnitQuantityCode(String unitQuantityCode) {
		this.unitQuantityCode = unitQuantityCode;
	}

	public String getWarehouseBeDate() {
		return this.warehouseBeDate;
	}

	public void setWarehouseBeDate(String warehouseBeDate) {
		this.warehouseBeDate = warehouseBeDate;
	}

	public String getWarehouseBeNo() {
		return this.warehouseBeNo;
	}

	public void setWarehouseBeNo(String warehouseBeNo) {
		this.warehouseBeNo = warehouseBeNo;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCustomsSiteId() {
		return this.warehouseCustomsSiteId;
	}

	public void setWarehouseCustomsSiteId(String warehouseCustomsSiteId) {
		this.warehouseCustomsSiteId = warehouseCustomsSiteId;
	}

}