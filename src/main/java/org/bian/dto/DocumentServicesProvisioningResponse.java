package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DocumentServicesProvisioningResponse
 */
public class DocumentServicesProvisioningResponse   {
  private String documentServicesSessionReference = null;

  private String documentProvisioningServiceReference = null;

  private String documentReference = null;

  private String documentProvisioningTimeLimit = null;

  private String customerReference = null;

  private String documentProductServiceActionReference = null;

  private String documentTypeDescription = null;

  private String documentMediaFormat = null;

  private String documentVersionValueDate = null;

  private String documentLocation = null;

  private String documentStatus = null;

  private Object documentContent = null;

  private String documentProvisioningServiceResult = null;


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
   * @return documentProvisioningServiceReference
  **/

  public String getDocumentProvisioningServiceReference() {
    return documentProvisioningServiceReference;
  }

  public void setDocumentProvisioningServiceReference(String documentProvisioningServiceReference) {
    this.documentProvisioningServiceReference = documentProvisioningServiceReference;
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
   * Get documentProvisioningTimeLimit
   * @return documentProvisioningTimeLimit
  **/

  public String getDocumentProvisioningTimeLimit() {
    return documentProvisioningTimeLimit;
  }

  public void setDocumentProvisioningTimeLimit(String documentProvisioningTimeLimit) {
    this.documentProvisioningTimeLimit = documentProvisioningTimeLimit;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction(as Action).RoleInAction(as ServiceRequestor) general-info:  source of requested document 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.DocumentHandlingSystem.SupportedProduct general-info:  document product or service action reference, if appropriate 
   * @return documentProductServiceActionReference
  **/

  public String getDocumentProductServiceActionReference() {
    return documentProductServiceActionReference;
  }

  public void setDocumentProductServiceActionReference(String documentProductServiceActionReference) {
    this.documentProductServiceActionReference = documentProductServiceActionReference;
  }


  /**
   * `status: Registered` iso-link-1: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdw8TGEeChad0JzLk7QA_-209473937) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.Type `status: Registered` iso-link-2: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_ftetAHO3EeO82qXU9yOWsg) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.Purpose general-info:  document type or description  
   * @return documentTypeDescription
  **/

  public String getDocumentTypeDescription() {
    return documentTypeDescription;
  }

  public void setDocumentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.Presentation.Format `status: Registered` iso-link-2: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_prF7MLbpEeGAapiw3IODVw_2145476732) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.Presentation.Medium general-info:  document media or format 
   * @return documentMediaFormat
  **/

  public String getDocumentMediaFormat() {
    return documentMediaFormat;
  }

  public void setDocumentMediaFormat(String documentMediaFormat) {
    this.documentMediaFormat = documentMediaFormat;
  }


  /**
   * `status: Registered` iso-link-1: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_IPGLYHQsEeKIFpWttHerUA_-1289671010) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.PreviousVersion `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.ValueDate general-info:  Document version or date  
   * @return documentVersionValueDate
  **/

  public String getDocumentVersionValueDate() {
    return documentVersionValueDate;
  }

  public void setDocumentVersionValueDate(String documentVersionValueDate) {
    this.documentVersionValueDate = documentVersionValueDate;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdyMTGEeChad0JzLk7QA_189871564) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.PlaceOfStorage general-info:  physical master version and copies 
   * @return documentLocation
  **/

  public String getDocumentLocation() {
    return documentLocation;
  }

  public void setDocumentLocation(String documentLocation) {
    this.documentLocation = documentLocation;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdwcTGEeChad0JzLk7QA_-1077516966) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.Status 
   * @return documentStatus
  **/

  public String getDocumentStatus() {
    return documentStatus;
  }

  public void setDocumentStatus(String documentStatus) {
    this.documentStatus = documentStatus;
  }


  /**
   * `status: Registered` iso-link-1: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_5fkf4XRYEeO82qXU9yOWsg) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.DocumentIdentification iso-link-2: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdxMTGEeChad0JzLk7QA_-339896662) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.PlaceOfIssue general-info:  \"Document content\" 
   * @return documentContent
  **/

  public Object getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(Object documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction(As Action).Result 
   * @return documentProvisioningServiceResult
  **/

  public String getDocumentProvisioningServiceResult() {
    return documentProvisioningServiceResult;
  }

  public void setDocumentProvisioningServiceResult(String documentProvisioningServiceResult) {
    this.documentProvisioningServiceResult = documentProvisioningServiceResult;
  }


}

