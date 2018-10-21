package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveDocumentServicesOperatingSession
 */
public class RetrieveDocumentServicesOperatingSession   {
  private String documentServicesSessionReference = null;

  private String documentServicesConfigurationSetup = null;


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
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.DocumentHandlingSystem(as System).AvailableOption 
   * @return documentServicesConfigurationSetup
  **/

  public String getDocumentServicesConfigurationSetup() {
    return documentServicesConfigurationSetup;
  }

  public void setDocumentServicesConfigurationSetup(String documentServicesConfigurationSetup) {
    this.documentServicesConfigurationSetup = documentServicesConfigurationSetup;
  }


}

