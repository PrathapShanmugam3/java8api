package com.oasys.helpdesk.request;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.criteria.Expression;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTicketRequestDto2 {
	    private Long id;
		
	    private String ticketNumber;
		
		private Long categoryId;

		private Long subCategoryId;
		
		private Long priorityId;
		
		private Long ticketStatusId;
		
		private Long issueDetailsId;
		
		private Long slaId;
		
		private Long knowledgeBaseId;
		
		private Long assignGroupId;
		
		private Long issueFromId;
		
		private String entityTypeId;
		
	//	private String  licenseNumber;
		
		private ArrayList<String> licenseNumber;
		
		private String licenseTypeId;
		
		private String callDisconnect;
		
		private String RequiredField;
		
		private Long assignToId;

	    private boolean isActive;

		private String createdBy;

		private Date createdDate;

		private String modifiedBy;

		private Date modifiedDate;
		
		private String remarks;
		
		private String unitName;
		
		private String licenseStatus;
		
		private Long actualProblemId;
		
		private Long actionTakenId;
		
		private Long problemReportedId;
		
		private String problemReported;
		
		private String email;
		
		private String mobile;
		
		private String notes;
		
		private Long solutionId;
		
		private boolean flag;
		
		private String alternativemobileNumber;
		
		private String fromDate;
		
		private String toDate;
		
		private String address;
	    
		private String ticketstatusName;
		
		private String createdbyName;
		
		
		
}