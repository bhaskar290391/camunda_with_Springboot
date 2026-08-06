package com.krishan.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FetchEmailDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("Inside the Java delegates function ::: ");

		System.out.println("Fetching the input varible from Service task :::"+ execution.getVariable("userIdInput"));
		
		execution.setVariable("userEmailFromDelegate", "bhaskar29@gmail.com");
	}

}
