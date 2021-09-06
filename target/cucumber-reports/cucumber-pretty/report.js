$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("daily-mail-naviagte.feature");
formatter.feature({
  "line": 1,
  "name": "User navigates to Mailtravel",
  "description": "",
  "id": "user-navigates-to-mailtravel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3899862410,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates to MailTravel",
  "description": "",
  "id": "user-navigates-to-mailtravel;user-navigates-to-mailtravel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ValidCase"
    },
    {
      "line": 3,
      "name": "@SomeTags"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I naviagte to mailtravel page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the mailtavel page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NaviagtionSteps.launch()"
});
formatter.result({
  "duration": 191298859,
  "status": "passed"
});
formatter.match({
  "location": "NaviagtionSteps.naviagte()"
});
formatter.result({
  "duration": 127232887,
  "status": "passed"
});
formatter.match({
  "location": "NaviagtionSteps.the_mailtavel_page_is_displayed()"
});
formatter.result({
  "duration": 5190696,
  "status": "passed"
});
formatter.after({
  "duration": 72651718,
  "status": "passed"
});
formatter.uri("more-info.feature");
formatter.feature({
  "line": 1,
  "name": "User searches for a destination",
  "description": "",
  "id": "user-searches-for-a-destination",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3462988155,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User searches for a destination",
  "description": "",
  "id": "user-searches-for-a-destination;user-searches-for-a-destination",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ValidCase"
    },
    {
      "line": 3,
      "name": "@SomeTags"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User types \u0027India\u0027 in search",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the options are displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks more info on first option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the telephone number",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "price",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "days are dsiplayed",
  "keyword": "And "
});
formatter.match({
  "location": "MoreInfoSteps.user_types_India_in_search()"
});
formatter.result({
  "duration": 4343618898,
  "status": "passed"
});
formatter.match({
  "location": "MoreInfoSteps.the_options_are_displayed()"
});
formatter.result({
  "duration": 17888896990,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d/html/body/div[3]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/a/div[3]/button\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027l7zk1m13-lon\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-81-generic\u0027, java.version: \u002711.0.11\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\n\tat PageObjects.MoreInfoPage.validateOptions(MoreInfoPage.java:36)\n\tat StepDefinitions.MoreInfoSteps.the_options_are_displayed(MoreInfoSteps.java:38)\n\tat ✽.When the options are displayed(more-info.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "MoreInfoSteps.user_clicks_more_info_on_first_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MoreInfoSteps.the_telephone_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MoreInfoSteps.price()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MoreInfoSteps.days_are_dsiplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 43586323,
  "status": "passed"
});
});