/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DocumentServicesApiService {

	DocumentServicesAmendmentResponse executePostAmendments(String crReferenceId, DocumentServicesAmendmentExecuteRequest request);
	
	DocumentServicesAmendmentResponse executePutAmendments(String crReferenceId, String bqReferenceId, DocumentServicesAmendmentExecuteRequest request);
	
	DocumentServicesCaptureResponse executePutCaptures(String crReferenceId, String bqReferenceId, DocumentServicesCaptureExecuteRequest request);
	
	DocumentServicesCaptureResponse executePostCaptures(String crReferenceId, DocumentServicesCaptureExecuteRequest request);
	
	DocumentServicesRetrievalResponse executePostRetrievals(String crReferenceId, DocumentServicesRetrievalExecuteRequest request);
	
	DocumentServicesRetrievalResponse executePutRetrievals(String crReferenceId, String bqReferenceId, DocumentServicesRetrievalExecuteRequest request);
	
	DocumentServicesRecordResponse record(String crReferenceId, DocumentServicesRecordRequest request);
	
	DocumentServicesVerificationResponse requestPostVerifications(String crReferenceId, DocumentServicesVerificationRequest request);
	
	DocumentServicesProvisioningResponse requestPostProvisioning(String crReferenceId, DocumentServicesProvisioningRequest request);
	
	DocumentServicesProvisioningResponse requestPutProvisionings(String crReferenceId, String bqReferenceId, DocumentServicesProvisioningRequest request);
	
	DocumentServicesVerificationResponse requestPutVerifications(String crReferenceId, String bqReferenceId, DocumentServicesVerificationRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	DocumentServicesVerificationResponse retrieveVerifications(String crReferenceId, String bqReferenceId);
	
	RetrieveDocumentServicesOperatingSession retrieve(String crReferenceId);
	
	DocumentServicesAmendmentResponse retrieveAmendments(String crReferenceId, String bqReferenceId);
	
	DocumentServicesArchivingResponse retrieveArchivings(String crReferenceId, String bqReferenceId);
	
	DocumentServicesCaptureResponse retrieveCaptures(String crReferenceId, String bqReferenceId);
	
	DocumentServicesProvisioningResponse retrieveProvisionings(String crReferenceId, String bqReferenceId);
	
	DocumentServicesRetrievalResponse retrieveRetrievals(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
}
