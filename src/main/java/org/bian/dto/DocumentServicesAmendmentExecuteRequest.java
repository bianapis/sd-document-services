package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DocumentServicesAmendmentExecuteRequest
 */
public class DocumentServicesAmendmentExecuteRequest   {
  private String documentReference = null;

  private String documentAmendmentDescription = null;

  private String documentVersionValueDate = null;

  private String documentUpdateHistory = null;

  private String documentStatus = null;

  private Object documentContent = null;

  private Object documentAmendmentResult = null;


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
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction(as Action).Description general-info:  Document amendment  
   * @return documentAmendmentDescription
  **/

  public String getDocumentAmendmentDescription() {
    return documentAmendmentDescription;
  }

  public void setDocumentAmendmentDescription(String documentAmendmentDescription) {
    this.documentAmendmentDescription = documentAmendmentDescription;
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
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.HandledDocument.PreviousVersion general-info:  links to earlier versions 
   * @return documentUpdateHistory
  **/

  public String getDocumentUpdateHistory() {
    return documentUpdateHistory;
  }

  public void setDocumentUpdateHistory(String documentUpdateHistory) {
    this.documentUpdateHistory = documentUpdateHistory;
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
   * `status: Provisionally Registered` bian-reference: DocumentHandlingSession.NormalDocumentEvent.TriggeredDocumentHandlingAction(As Action).Result general-info:  \"Document amendment result\" 
   * @return documentAmendmentResult
  **/

  public Object getDocumentAmendmentResult() {
    return documentAmendmentResult;
  }

  public void setDocumentAmendmentResult(Object documentAmendmentResult) {
    this.documentAmendmentResult = documentAmendmentResult;
  }


}

