$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Goibibo Login",
  "description": "",
  "id": "goibibo-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Launch Application and Login",
  "description": "",
  "id": "goibibo-login;launch-application-and-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user is on the landing page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user is trying with Valid Login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user is able to login.",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Goibibo.LaunchBrowser()"
});
formatter.result({
  "duration": 23574513800,
  "status": "passed"
});
formatter.match({
  "location": "Login_Goibibo.ApplicationLogin()"
});
formatter.result({
  "duration": 39460212500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Goibibo.ValidateLogin()"
});
formatter.result({
  "duration": 3049585300,
  "status": "passed"
});
});