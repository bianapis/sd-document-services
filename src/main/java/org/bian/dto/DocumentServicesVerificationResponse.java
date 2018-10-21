package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DocumentServicesVerificationResponse
 */
public class DocumentServicesVerificationResponse   {
  private String documentServicesSessionReference = null;

  private String documentVerificationServiceReference = null;

  private String documentReference = null;

  private String documentVerificationType = null;

  private String documentVerificationServiceProviderReference = null;

  private String documentStatus = null;

  private String documentVerificationResult = null;


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession 
   * @return documentServicesSessionReference
  **/

  public String getDocumentServicesSessionReference() {
    return documentServicesSessionReference;
  }

  public void setDocumentServicesSessionReference(String documentServicesSessionReference) {
    this.documentServicesSessionReference = documentServicesSessionReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction 
   * @return documentVerificationServiceReference
  **/

  public String getDocumentVerificationServiceReference() {
    return documentVerificationServiceReference;
  }

  public void setDocumentVerificationServiceReference(String documentVerificationServiceReference) {
    this.documentVerificationServiceReference = documentVerificationServiceReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  document verification type 
   * @return documentVerificationType
  **/

  public String getDocumentVerificationType() {
    return documentVerificationType;
  }

  public void setDocumentVerificationType(String documentVerificationType) {
    this.documentVerificationType = documentVerificationType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction(as Action).RoleInAction(as ServiceRequestor) general-info:  if external agent used 
   * @return documentVerificationServiceProviderReference
  **/

  public String getDocumentVerificationServiceProviderReference() {
    return documentVerificationServiceProviderReference;
  }

  public void setDocumentVerificationServiceProviderReference(String documentVerificationServiceProviderReference) {
    this.documentVerificationServiceProviderReference = documentVerificationServiceProviderReference;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdwcTGEeChad0JzLk7QA_-1077516966) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.Status general-info:  update verification status 
   * @return documentStatus
  **/

  public String getDocumentStatus() {
    return documentStatus;
  }

  public void setDocumentStatus(String documentStatus) {
    this.documentStatus = documentStatus;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction(As Action).Result general-info:  Document verification result 
   * @return documentVerificationResult
  **/

  public String getDocumentVerificationResult() {
    return documentVerificationResult;
  }

  public void setDocumentVerificationResult(String documentVerificationResult) {
    this.documentVerificationResult = documentVerificationResult;
  }


}

