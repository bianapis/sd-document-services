/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DocumentServicesApiServiceImpl implements DocumentServicesApiService {

	public DocumentServicesAmendmentResponse executePostAmendments(String crReferenceId, DocumentServicesAmendmentExecuteRequest request){
		return JsonReader.read("executePost-DocumentServicesAmendmentResponse.json",new TypeReference<DocumentServicesAmendmentResponse>(){});
	}
	
	public DocumentServicesAmendmentResponse executePutAmendments(String crReferenceId, String bqReferenceId, DocumentServicesAmendmentExecuteRequest request){
		return JsonReader.read("executePut-DocumentServicesAmendmentResponse.json",new TypeReference<DocumentServicesAmendmentResponse>(){});
	}
	
	public DocumentServicesCaptureResponse executePutCaptures(String crReferenceId, String bqReferenceId, DocumentServicesCaptureExecuteRequest request){
		return JsonReader.read("executePut-DocumentServicesCaptureResponse.json",new TypeReference<DocumentServicesCaptureResponse>(){});
	}
	
	public DocumentServicesCaptureResponse executePostCaptures(String crReferenceId, DocumentServicesCaptureExecuteRequest request){
		return JsonReader.read("executePost-DocumentServicesCaptureResponse.json",new TypeReference<DocumentServicesCaptureResponse>(){});
	}
	
	public DocumentServicesRetrievalResponse executePostRetrievals(String crReferenceId, DocumentServicesRetrievalExecuteRequest request){
		return JsonReader.read("executePost-DocumentServicesRetrievalResponse.json",new TypeReference<DocumentServicesRetrievalResponse>(){});
	}
	
	public DocumentServicesRetrievalResponse executePutRetrievals(String crReferenceId, String bqReferenceId, DocumentServicesRetrievalExecuteRequest request){
		return JsonReader.read("executePut-DocumentServicesRetrievalResponse.json",new TypeReference<DocumentServicesRetrievalResponse>(){});
	}
	
	public DocumentServicesRecordResponse record(String crReferenceId, DocumentServicesRecordRequest request){
		return JsonReader.read("record-DocumentServicesRecordResponse.json",new TypeReference<DocumentServicesRecordResponse>(){});
	}
	
	public DocumentServicesVerificationResponse requestPostVerifications(String crReferenceId, DocumentServicesVerificationRequest request){
		return JsonReader.read("requestPost-DocumentServicesVerificationResponse.json",new TypeReference<DocumentServicesVerificationResponse>(){});
	}
	
	public DocumentServicesProvisioningResponse requestPostProvisioning(String crReferenceId, DocumentServicesProvisioningRequest request){
		return JsonReader.read("requestPost-DocumentServicesProvisioningResponse.json",new TypeReference<DocumentServicesProvisioningResponse>(){});
	}
	
	public DocumentServicesProvisioningResponse requestPutProvisionings(String crReferenceId, String bqReferenceId, DocumentServicesProvisioningRequest request){
		return JsonReader.read("requestPut-DocumentServicesProvisioningResponse.json",new TypeReference<DocumentServicesProvisioningResponse>(){});
	}
	
	public DocumentServicesVerificationResponse requestPutVerifications(String crReferenceId, String bqReferenceId, DocumentServicesVerificationRequest request){
		return JsonReader.read("requestPut-DocumentServicesVerificationResponse.json",new TypeReference<DocumentServicesVerificationResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DocumentServicesVerificationResponse retrieveVerifications(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentServicesVerificationResponse.json",new TypeReference<DocumentServicesVerificationResponse>(){});
	}
	
	public RetrieveDocumentServicesOperatingSession retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveDocumentServicesOperatingSession.json",new TypeReference<RetrieveDocumentServicesOperatingSession>(){});
	}
	
	public DocumentServicesAmendmentResponse retrieveAmendments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentServicesAmendmentResponse.json",new TypeReference<DocumentServicesAmendmentResponse>(){});
	}
	
	public DocumentServicesArchivingResponse retrieveArchivings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentServicesArchivingResponse.json",new TypeReference<DocumentServicesArchivingResponse>(){});
	}
	
	public DocumentServicesCaptureResponse retrieveCaptures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentServicesCaptureResponse.json",new TypeReference<DocumentServicesCaptureResponse>(){});
	}
	
	public DocumentServicesProvisioningResponse retrieveProvisionings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentServicesProvisioningResponse.json",new TypeReference<DocumentServicesProvisioningResponse>(){});
	}
	
	public DocumentServicesRetrievalResponse retrieveRetrievals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentServicesRetrievalResponse.json",new TypeReference<DocumentServicesRetrievalResponse>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
