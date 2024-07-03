package com.ankush.rest.webservices.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Integer id;
	
	@Size(min = 2 ,message = "Name should have at least 2 characters")
	//@JsonProperty("user_name")
	private String name;
	
	@Past(message = "Birth date should be in the past")
	//@JsonProperty("birth_name")
	private LocalDate localDate;

}