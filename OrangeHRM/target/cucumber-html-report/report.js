$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHrm Application Test",
  "description": "",
  "id": "orangehrm-application-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Validate OrangeHrm Login Page Test",
  "description": "",
  "id": "orangehrm-application-test;validate-orangehrm-login-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter \"Admin\" and \"admin123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_open_browser()"
});
formatter.result({
  "duration": 16386680300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 10950600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    },
    {
      "val": "admin123",
      "offset": 24
    }
  ],
  "location": "LoginStepDef.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 1149456300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_login_button()"
});
formatter.result({
  "duration": 2683652300,
  "status": "passed"
});
});