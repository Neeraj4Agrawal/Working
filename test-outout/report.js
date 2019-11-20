$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Bridesides/FreeCRMCucumberFramework/src/test/java/com/qa/features/loginadvance.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Featuress",
  "description": "",
  "id": "free-crm-login-featuress",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenarioss",
  "description": "",
  "id": "free-crm-login-featuress;free-crm-login-test-scenarioss",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Initialize resources in the beginning of each scenario for Loginss",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Do enter the valid username and password and clicks",
  "keyword": "Then "
});
formatter.match({
  "location": "StepWithResources.initialize_resources_in_the_beginning_of_each_scenario_for_Logins()"
});
formatter.result({
  "duration": 83999488990,
  "status": "passed"
});
formatter.match({
  "location": "StepWithResources.do_enter_the_valid_username_and_password_and_click()"
});
formatter.result({
  "duration": 6518902461,
  "status": "passed"
});
});