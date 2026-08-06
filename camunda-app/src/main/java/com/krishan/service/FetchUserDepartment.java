package com.krishan.service;

import org.springframework.stereotype.Component;

@Component
public class FetchUserDepartment {

	public String findUserDepartment() {
		
		System.out.println("User department fetching from FetchUserDepartment");
		
		return "Account";
	}
}
