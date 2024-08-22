package com.Makersharks.Assesments.DTO;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierFilterDTO {
	@JsonProperty("page")
	@Builder.Default
	private Integer page=0;
	
	@Builder.Default
	@JsonProperty("size")
	private Integer size=100;
	
	@JsonProperty("location")
	private String location;
	
	@JsonProperty("manufacturing_process")
	private String manufacturingProcess;
	
	@JsonProperty("nature_of_Business")
	private String natureOfBusiness;

}
