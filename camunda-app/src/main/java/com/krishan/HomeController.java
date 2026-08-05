package com.krishan;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Today is lucky Days";
	}

	@GetMapping("/execute")
	public String execute() {

		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder processInstanceByKey = engine.getRuntimeService()
				.createProcessInstanceByKey("first_bpmn_executors");

		String item = "Bhaskar Mudaliyar";

		processInstanceByKey.setVariable("itemName", item);

		processInstanceByKey.businessKey("bhaskar-business-key");

		processInstanceByKey.executeWithVariablesInReturn();
		return " BPMN Executed !!!";
	}

	@GetMapping("/allTasks")
	public String executeScriptTask() {

		ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder processInstanceByKey = defaultProcessEngine.getRuntimeService()
				.createProcessInstanceByKey("all_tasks");

		processInstanceByKey.executeWithVariablesInReturn();

		return "Executed Scripts task !!!";

	}
}
