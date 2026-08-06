package com.krishan.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class FetchUserRoleDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("fetching user roles from FetchUserRoleDelegate");
		
		execution.setVariable("userRoleFromDelegate", "manager");

	}

}
