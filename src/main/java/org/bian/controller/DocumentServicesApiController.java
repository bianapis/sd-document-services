/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class DocumentServicesApiController {

	@Autowired
	DocumentServicesApiService service;
	
	@BQ("amendments")
	@Operate.ExecutePost
	public BianResponse<DocumentServicesAmendmentResponse> executePostAmendments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentServicesAmendmentExecuteRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostAmendments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("amendments")
	@Operate.ExecutePut
	public BianResponse<DocumentServicesAmendmentResponse> executePutAmendments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DocumentServicesAmendmentExecuteRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutAmendments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Operate.ExecutePut
	public BianResponse<DocumentServicesCaptureResponse> executePutCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DocumentServicesCaptureExecuteRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutCaptures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Operate.ExecutePost
	public BianResponse<DocumentServicesCaptureResponse> executePostCaptures(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentServicesCaptureExecuteRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostCaptures(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("retrievals")
	@Operate.ExecutePost
	public BianResponse<DocumentServicesRetrievalResponse> executePostRetrievals(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentServicesRetrievalExecuteRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostRetrievals(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("retrievals")
	@Operate.ExecutePut
	public BianResponse<DocumentServicesRetrievalResponse> executePutRetrievals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DocumentServicesRetrievalExecuteRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutRetrievals(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<DocumentServicesRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentServicesRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("verifications")
	@Operate.RequestPost
	public BianResponse<DocumentServicesVerificationResponse> requestPostVerifications(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentServicesVerificationRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostVerifications(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("provisioning")
	@Operate.RequestPost
	public BianResponse<DocumentServicesProvisioningResponse> requestPostProvisioning(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentServicesProvisioningRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostProvisioning(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("provisionings")
	@Operate.RequestPut
	public BianResponse<DocumentServicesProvisioningResponse> requestPutProvisionings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DocumentServicesProvisioningRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutProvisionings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("verifications")
	@Operate.RequestPut
	public BianResponse<DocumentServicesVerificationResponse> requestPutVerifications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DocumentServicesVerificationRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutVerifications(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("verifications")
	@Operate.Retrieve
	public BianResponse<DocumentServicesVerificationResponse> retrieveVerifications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveVerifications(crReferenceId, bqReferenceId));
	}
	
	@Operate.Retrieve
	public BianResponse<RetrieveDocumentServicesOperatingSession> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("amendments")
	@Operate.Retrieve
	public BianResponse<DocumentServicesAmendmentResponse> retrieveAmendments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAmendments(crReferenceId, bqReferenceId));
	}
	
	@BQ("archivings")
	@Operate.Retrieve
	public BianResponse<DocumentServicesArchivingResponse> retrieveArchivings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveArchivings(crReferenceId, bqReferenceId));
	}
	
	@BQ("captures")
	@Operate.Retrieve
	public BianResponse<DocumentServicesCaptureResponse> retrieveCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCaptures(crReferenceId, bqReferenceId));
	}
	
	@BQ("provisionings")
	@Operate.Retrieve
	public BianResponse<DocumentServicesProvisioningResponse> retrieveProvisionings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProvisionings(crReferenceId, bqReferenceId));
	}
	
	@BQ("retrievals")
	@Operate.Retrieve
	public BianResponse<DocumentServicesRetrievalResponse> retrieveRetrievals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRetrievals(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
