package com.techbuzzblogs.workflow.listeners;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class SampleTaskListener implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println("Welcome to Task Listener!!!"+delegateTask.getEventName());

	}

}
