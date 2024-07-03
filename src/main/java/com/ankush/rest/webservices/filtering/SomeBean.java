package com.ankush.rest.webservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

//@JsonIgnoreProperties({"field1","field2"})
@JsonFilter("SomeBeanFilter")
public final class SomeBean {

	private String field1;
	private String field2;
	//@JsonIgnore
	private String field3;

}
