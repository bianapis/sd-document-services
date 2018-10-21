package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DocumentServicesArchivingResponse
 */
public class DocumentServicesArchivingResponse   {
  private String documentServicesSessionReference = null;

  private String documentArchivingConfiguration = null;

  private String documentArchivingSchedule = null;

  private String documentReference = null;

  private String documentLocation = null;

  private String documentStatus = null;

  private String archivedDocumentStorageReference = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"Set-up or locations\" 
   * @return documentArchivingConfiguration
  **/

  public String getDocumentArchivingConfiguration() {
    return documentArchivingConfiguration;
  }

  public void setDocumentArchivingConfiguration(String documentArchivingConfiguration) {
    this.documentArchivingConfiguration = documentArchivingConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  timing based on document type 
   * @return documentArchivingSchedule
  **/

  public String getDocumentArchivingSchedule() {
    return documentArchivingSchedule;
  }

  public void setDocumentArchivingSchedule(String documentArchivingSchedule) {
    this.documentArchivingSchedule = documentArchivingSchedule;
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
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdyMTGEeChad0JzLk7QA_189871564) bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.PlaceOfStorage 
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return archivedDocumentStorageReference
  **/

  public String getArchivedDocumentStorageReference() {
    return archivedDocumentStorageReference;
  }

  public void setArchivedDocumentStorageReference(String archivedDocumentStorageReference) {
    this.archivedDocumentStorageReference = archivedDocumentStorageReference;
  }


}

