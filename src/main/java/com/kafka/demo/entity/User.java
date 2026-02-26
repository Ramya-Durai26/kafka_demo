package com.kafka.demo.entity;


import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {


	private String userId;
	
	private String userFirstName;
	
	private String userLastName;
	
	private String userMiddleName;
	
	private String userPhoneNumber;
	
	private String userLocation;
	
	private String userTimeZone;

	private String userVisaStatus;
	
	private Timestamp creationTime;

	private Timestamp lastModTime;
	

}

