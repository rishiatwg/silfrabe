HREC${delimiter}ZZ${delimiter}${exBond.header.senderId}${delimiter}ZZ${delimiter}${exBond.header.receiverId}${delimiter}${exBond.header.versionNo}${delimiter}${exBond.header.tpIndicator}${delimiter}X${delimiter}${exBond.header.messageId}${delimiter}${exBond.header.sequenceNo}${delimiter}${exBond.header.date}${delimiter}${exBond.header.time}
<TABLE>BE
F${delimiter}${exBond.be.customHouseCode}${delimiter}${exBond.be.userJobNo}${delimiter}${exBond.be.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.be.beType}${delimiter}${exBond.be.iecCode}${delimiter}${exBond.be.branchSrNo}${delimiter}${exBond.be.nameOfTheImporter}${delimiter}${exBond.be.address1}${delimiter}${exBond.be.address2}${delimiter}${exBond.be.city}${delimiter}${exBond.be.state}${delimiter}${exBond.be.pin}${delimiter}${exBond.be.beClass}${delimiter}${exBond.be.modeOfTransport}${delimiter}${exBond.be.importerType}${delimiter}${exBond.be.kachchaBe}${delimiter}${exBond.be.highSeaSaleFlag}${delimiter}${exBond.be.portOfOrigin}${delimiter}${exBond.be.chaCode}${delimiter}${exBond.be.countryOfOrigin}${delimiter}${exBond.be.countryOfConsignmnet}${delimiter}${exBond.be.portOfShipment}${delimiter}${exBond.be.greenChannelRequested}${delimiter}${exBond.be.section48Requested}${delimiter}${exBond.be.isPriorBe}${delimiter}${exBond.be.authorizedDealerCode}${delimiter}${exBond.be.firstCheckRequested}${delimiter}${exBond.be.warehouseCode}${delimiter}${exBond.be.warehouseCustomsSiteId}${delimiter}${exBond.be.warehouseBeNo}${delimiter}${exBond.be.warehouseBeDate}${delimiter}${exBond.be.noOfPackagesReleased}${delimiter}${exBond.be.packageCode}${delimiter}${exBond.be.grossWeight}${delimiter}${exBond.be.unitOfMeasurement}${delimiter}${exBond.be.additionalChargesIfAnyPurchaseOnHighSeas}${delimiter}${exBond.be.miscellaneousLoad}${delimiter}${exBond.be.fieldDescription}${delimiter}${exBond.be.uniqueConsignmnetReferenceNoUcrType}${delimiter}${exBond.be.paymentMethodCode}
<TABLE>INVOICE
<#list exBond.invoices as invoice>
F${delimiter}${invoice.customHouseCode}${delimiter}${invoice.userJobNo}${delimiter}${invoice.userJobDate}${delimiter}${delimiter}${delimiter}${invoice.invoiceSerialNumber}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${invoice.actualInvoiceNumber}${delimiter}${delimiter}${delimiter}${delimiter}${invoice.thirdPartyAddress1}${delimiter}${invoice.thirdPartyAddress2}${delimiter}${invoice.thirdPartyCity}${delimiter}${invoice.thirdPartyCountrySubdvsn}${delimiter}${invoice.thirdPartyCountryCode}${delimiter}${invoice.thirdPartyPin}${delimiter}${invoice.authorizedEconomicOperatorCode}${delimiter}${invoice.authorizedEconomicOperatorCountry}${delimiter}${invoice.authorizedEconomicOperatorRole}${delimiter}${invoice.isBuyerAndSellerAreRelated}
</#list>
<TABLE>ITEMS
<#list exBond.items as item>
F${delimiter}${item.customHouseCode}${delimiter}${item.userJobNo}${delimiter}${item.userJobDate}${delimiter}${delimiter}${delimiter}${item.invoiceSerialNumber}${delimiter}${item.itemSrNo}${delimiter}${item.quantity}${delimiter}${item.unitQuantityCode}${delimiter}${item.ritcCode}${delimiter}${delimiter}${delimiter}${item.itemCategory}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${delimiter}${item.countryOfOrigin}${delimiter}${item.cth}${delimiter}${item.isPreferentialStandard}${delimiter}${item.ceth}${delimiter}${item.bcdNotification}${delimiter}${item.bcdNotificationSrNo}${delimiter}${item.cvdNotification}${delimiter}${item.cvdNotificationSrNo}${delimiter}${delimiter}${delimiter}${item.additionalNotification2}${delimiter}${item.additionalNotification2SrNo}${delimiter}${item.otherNotification}${delimiter}${item.otherNotificationSrNo}${delimiter}${item.cusEducessNotificationNumber}${delimiter}${item.cusEducessNotificationNumberSrNo}${delimiter}${item.cexEducessNotn}${delimiter}${item.cexEducessNotnSlNo}${delimiter}${item.ncdNotn}${delimiter}${item.ncdSrNo}${delimiter}${item.antiDumpingDutyNotification}${delimiter}${item.antiDumpingDutySerialNumber}${delimiter}${item.cthSerialNumber}${delimiter}${item.supplierSerialnumber}${delimiter}${item.quantityAsPerAntiDumpingNotn}${delimiter}${item.tariffValueNotn}${delimiter}${item.tariffValueItemSerialNumber}${delimiter}${item.quantityAsPerTariffValueNotn}${delimiter}${item.saptaNotn}${delimiter}${item.saptaSerialNumber}${delimiter}${item.healthNotn}${delimiter}${item.healthSrNo}${delimiter}${item.additionalNotification1}${delimiter}${item.additionalNotification1SrNo}${delimiter}${item.aggregateDutyNotn}${delimiter}${item.aggregateDutySrNo}${delimiter}${item.safeguardDutyNotn}${delimiter}${item.safeguardDutyNothSrNo}${delimiter}${item.unitPriceInvoiced}${delimiter}${item.discountRate}${delimiter}${item.discountAmount}${delimiter}${item.qtyAsPerCth}${delimiter}${item.quantityAsPerCth}${delimiter}${item.svbReferenceNumber}${delimiter}${item.svdReferenceDate}${delimiter}${item.svbLoadassessableValue}${delimiter}${item.svbLoadOnDuty}${delimiter}${item.svbFlag}${delimiter}${item.isLoadFinalProvisionalOnAssesableValue}${delimiter}${item.isLoadFinalProvisionalOnDuty}${delimiter}${item.customHouseCodeWhichHasImposedLoad}${delimiter}${item.policyParaNo}${delimiter}${item.policyYear}${delimiter}${item.isRspApplicability}${delimiter}${item.isReImport}${delimiter}${item.previouseBeNo}${delimiter}${item.previousBeDate}${delimiter}${item.previousUnitPrice}${delimiter}${item.previousCurrencyCode}${delimiter}${item.previousCustomSite}${delimiter}${item.customsNotnExemptingCentralExciseFlag}${delimiter}${item.isItemManufacturerProducerCodeType}${delimiter}${item.isItemManufacturerProducerGrowerCode}${delimiter}${item.isItemManufacturerProducerGrowerAddress1}${delimiter}${item.isItemManufacturerProducerGrowerAddress2}${delimiter}${item.isItemManufacturerProducerGrowerCity}${delimiter}${item.isItemManufacturerProducerGrowerCountrySubdivision}${delimiter}${item.isItemManufacturerProducerGrowerPin}${delimiter}${item.itemManufacturerCntry}${delimiter}${item.sourceCountry}${delimiter}${item.transitCountry}${delimiter}${item.accessoryStatus}
</#list>
<#if exBond.licence?hasContent >
<TABLE>LICENCE
F${delimiter}${exBond.licence.customHouseCode}${delimiter}${exBond.licence.userJobNo}${delimiter}${exBond.licence.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.licence.invoiceSerialNumber}${delimiter}${exBond.licence.itemSrNoInInvoice}${delimiter}${exBond.licence.itemSrNoInLicence}${delimiter}${exBond.licence.debitValue}${delimiter}${exBond.licence.debitQuantity}${delimiter}${exBond.licence.debitUnitOfMeasurement}${delimiter}${exBond.licence.licenceRegistrationNumber}${delimiter}${exBond.licence.licenceRegistrationDate}${delimiter}${exBond.licence.licenceCode}${delimiter}${exBond.licence.isRaLicenceRegnPort}
</#if>
<#if exBond.rsp?hasContent >
<TABLE>RSP
F${delimiter}${exBond.rsp.customHouseCode}${delimiter}${exBond.rsp.userJobNo}${delimiter}${exBond.rsp.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.rsp.invoiceSerialNumber}${delimiter}${exBond.rsp.itemSrNoInInvoice}${delimiter}${exBond.rsp.itemSrNoInRsp}${delimiter}${exBond.rsp.rsp}${delimiter}${exBond.rsp.quantity}${delimiter}${exBond.rsp.descriptionItem}${delimiter}${exBond.rsp.rspNotification}${delimiter}${exBond.rsp.rspNotificationSerialNo}
</#if>
<#if exBond.depb?hasContent >
<TABLE>DEPB
F${delimiter}${exBond.depb.customHouseCode}${delimiter}${exBond.depb.userJobNo}${delimiter}${exBond.depb.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.depb.invoiceSerialNumber}${delimiter}${exBond.depb.itemSrNoInInvoice}${delimiter}${exBond.depb.isExemptionRequired}${delimiter}${exBond.depb.bcdNotification}${delimiter}${exBond.depb.bcdNotificationSrNo}
</#if>
<#if exBond.bond?hasContent >
<TABLE>BOND
F${delimiter}${exBond.bond.customHouseCode}${delimiter}${exBond.bond.userJobNo}${delimiter}${exBond.bond.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.bond.bondNumber}${delimiter}${exBond.bond.bondCode}${delimiter}${exBond.bond.bondPort}
</#if>
<#if exBond.cert?hasContent >
<TABLE>CERT
F${delimiter}${exBond.cert.customHouseCode}${delimiter}${exBond.cert.userJobNo}${delimiter}${exBond.cert.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.cert.certificateNumber}${delimiter}${exBond.cert.certificateDate}${delimiter}${exBond.cert.certificateType}
</#if>
<#if exBond.reimport?hasContent >
<TABLE>REIMPORT
F${delimiter}${exBond.reimport.customHouseCode}${delimiter}${exBond.reimport.userJobNo}${delimiter}${exBond.reimport.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.reimport.invoiceSerialNumber}${delimiter}${exBond.reimport.itemSrNoInInvoice}${delimiter}${exBond.reimport.shippingBillNo}${delimiter}${exBond.reimport.shippingBillDate}${delimiter}${exBond.reimport.portOfExport}${delimiter}${exBond.reimport.invoiceNo}${delimiter}${exBond.reimport.itemNo}${delimiter}${exBond.reimport.notificationNo}${delimiter}${exBond.reimport.notificationSrNo}${delimiter}${exBond.reimport.exportFreight}${delimiter}${exBond.reimport.exportInsurance}${delimiter}${exBond.reimport.customsDuty}${delimiter}${exBond.reimport.exciseDuty}
</#if>
<#if exBond.sbeduty?hasContent >
<TABLE>SBEDUTY
F${delimiter}${exBond.sbeduty.customHouseCode}${delimiter}${exBond.sbeduty.userJobNo}${delimiter}${exBond.sbeduty.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.sbeduty.invoiceSerialNumber}${delimiter}${exBond.sbeduty.itemSrNoInInvoice}${delimiter}${exBond.sbeduty.notificationNo}${delimiter}${exBond.sbeduty.notificationSrNo}${delimiter}${exBond.sbeduty.dutyType}${delimiter}${exBond.sbeduty.addlDutyFlag}${delimiter}${exBond.sbeduty.itemSino}${delimiter}${exBond.sbeduty.supplierSino}${delimiter}${exBond.sbeduty.nou}
</#if>
<#if exBond.ctx?hasContent >
<TABLE>CTX
F${delimiter}${exBond.ctx.customHouseCode}${delimiter}${exBond.ctx.userJobNo}${delimiter}${exBond.ctx.userJobDate}${delimiter}${delimiter}${delimiter}${exBond.ctx.stateCode}${delimiter}${exBond.ctx.commercialTaxType}${delimiter}${exBond.ctx.commercialTaxRegistrationNo}
</#if>
<#if exBond.statement?hasContent >
<TABLE>STATEMENT
F${delimiter}${exBond.statement.customHouseCode}${delimiter}${exBond.statement.userJobNo}${delimiter}${exBond.statement.userJobDate}${delimiter}${exBond.statement.declarationType}${delimiter}${exBond.statement.declarationNumber}${delimiter}${exBond.statement.declarationDate}${delimiter}${exBond.statement.invoiceSerialNumber}${delimiter}${exBond.statement.itemSrNo}${delimiter}${exBond.statement.statementType}${delimiter}${exBond.statement.statementCode}${delimiter}${exBond.statement.statementText}
</#if>
<#if exBond.supportingdocs?hasContent >
<TABLE>SUPPORTINGDOCS
F${delimiter}${exBond.supportingdocs.customHouseCode}${delimiter}${exBond.supportingdocs.userJobNo}${delimiter}${exBond.supportingdocs.userJobDate}${delimiter}${exBond.supportingdocs.declarationNumber}${delimiter}${exBond.supportingdocs.declarationDate}${delimiter}${exBond.supportingdocs.declarationType}${delimiter}${exBond.supportingdocs.invoiceSerialNumber}${delimiter}${exBond.supportingdocs.itemSrNo}${delimiter}${exBond.supportingdocs.chaLicenseNumber}${delimiter}${exBond.supportingdocs.iec}${delimiter}${exBond.supportingdocs.icegateUserID}${delimiter}${exBond.supportingdocs.uniqueDocumentNumber}${delimiter}${exBond.supportingdocs.documentTypeCode}${delimiter}${exBond.supportingdocs.documentIssuingPartyCode}${delimiter}${exBond.supportingdocs.documentIssuingPartyName}${delimiter}${exBond.supportingdocs.documentIssuingPartyNameAddress1}${delimiter}${exBond.supportingdocs.documentIssuingPartyNameAddress2}${delimiter}${exBond.supportingdocs.documentIssuingPartyNameCity}${delimiter}${exBond.supportingdocs.documentIssuingPartyNamePin}${delimiter}${exBond.supportingdocs.documentRefernceNumber}${delimiter}${exBond.supportingdocs.placeOfIssue}${delimiter}${exBond.supportingdocs.documentIssueDate}${delimiter}${exBond.supportingdocs.documentExpiryDate}${delimiter}${exBond.supportingdocs.documentBeneficiaryPartyCode}${delimiter}${exBond.supportingdocs.documentBeneficiaryPartyName}${delimiter}${exBond.supportingdocs.documentBeneficiaryPartyNameAddress1}${delimiter}${exBond.supportingdocs.documentBeneficiaryPartyNameAddress2}${delimiter}${exBond.supportingdocs.documentBeneficiaryPartyNameCity}${delimiter}${exBond.supportingdocs.documentBeneficiaryPartyPin}${delimiter}${exBond.supportingdocs.fileType}
</#if>
<END-BE>
TREC${delimiter}${exBond.header.sequenceNo}