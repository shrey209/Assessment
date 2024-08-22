package com.Makersharks.Assesments.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class GlobalFetchDTO<T> {
	
	@JsonProperty("content")
public 	List<T> content ;
	
	@JsonProperty("totalNumberOfRecordsInteger")
public	Integer totalNumberOfRecordsInteger;

}
