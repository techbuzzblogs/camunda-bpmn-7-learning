package com.techbuzzblogs.workflow.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FinalCheck implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
	System.out.println("I am in Final Check");
	System.out.println("Global Gender is: "+execution.getVariable("global-gender"));
	}

}
