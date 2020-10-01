package com.raja.practice.security.jwt.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter			 
@Setter
public class AuthenticationRequest {
	private String username;
	private String password;
}
