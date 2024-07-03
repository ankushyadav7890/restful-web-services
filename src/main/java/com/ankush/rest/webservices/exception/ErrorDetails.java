package com.ankush.rest.webservices.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorDetails {
	
	private LocalDateTime timestamp;
	private String message;
	private String details;

}
