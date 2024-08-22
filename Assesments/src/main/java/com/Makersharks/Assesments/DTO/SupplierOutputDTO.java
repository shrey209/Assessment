package com.Makersharks.Assesments.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierOutputDTO {
	
	@JsonProperty("supplier_id")
	 private Long supplierId;

	 @JsonProperty("company_name")
	    private String companyName;

	 @JsonProperty("website")
	    private String website;

	@JsonProperty("location")
	private String location;
	
	@JsonProperty("manufacturing_process")
	private String manufacturingProcess;
	
	@JsonProperty("nature_of_Business")
	private String natureOfBusiness;
	
}
