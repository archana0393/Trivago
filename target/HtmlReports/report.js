$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/ContactFormSubmission.feature");
formatter.feature({
  "name": "Feature to test contact form functionality.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check the functionality of contact form with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  \u003cMessagecontent\u003e,\u003cFullname\u003e and \u003cemail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "Contact form submitted successfully.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Messagecontent",
        "Fullname",
        "email"
      ]
    },
    {
      "cells": [
        "Please send me the details of new locations to visit",
        "Haran",
        "hrzei@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "User is in Contact form page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to contact form page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_navigates_to_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in contact form page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the functionality of contact form with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  Please send me the details of new locations to visit,Haran and hrzei@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_enters_details(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_clicks_on_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contact form submitted successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.contact_form_submitted_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is in Contact form page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to contact form page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_navigates_to_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in contact form page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check proper error message is displayed while submitting form with blank fields",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.proper_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Check the functionality of Checkbox",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  \u003cMessagecontent\u003e,\u003cFullname\u003e and \u003cemail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit button without marking checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Proper error message is displayed in order to tick the checkbox",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Messagecontent",
        "Fullname",
        "email"
      ]
    },
    {
      "cells": [
        "Plese help me to get the details of best choice to travel",
        "Hima",
        "hima@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "User is in Contact form page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to contact form page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_navigates_to_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in contact form page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the functionality of Checkbox",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  Plese help me to get the details of best choice to travel,Hima and hima@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_enters_details(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button without marking checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.click_on_submit_button_without_marking_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper error message is displayed in order to tick the checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.proper_error_message_is_displayed_in_order_to_tick_the_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Check if email address is properly validated",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User entering \u003cMessagecontents\u003e,\u003cname\u003e and \u003cemailfield\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Proper error message for email validation is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Messagecontents",
        "name",
        "emailfield"
      ]
    },
    {
      "cells": [
        "agrvc",
        "Fida",
        "fidan@"
      ]
    }
  ]
});
formatter.background({
  "name": "User is in Contact form page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to contact form page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_navigates_to_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in contact form page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_is_in_contact_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check if email address is properly validated",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User entering agrvc,Fida and fidan@",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.user_entering_agrvc(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper error message for email validation is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ContactFormSubmissionSteps.proper_error_message_for_email_validation_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/NewsletterSubscribe.feature");
formatter.feature({
  "name": "Feature to subscribe to a Newsletter",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test to check email validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The User enters \u003cInvalidemail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Proper validation message is displayed there",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Invalidemail"
      ]
    },
    {
      "cells": [
        "nuy6a2@"
      ]
    }
  ]
});
formatter.background({
  "name": "User is in Subscribe Newsletterform",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User opens Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.user_is_in_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to subscriber Newsletter form",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.navigates_to_subscriber_Newsletter_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test to check email validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The User enters nuy6a2@",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.user_submitdata(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper validation message is displayed there",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.proper_validation_message_is_displayed_there()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test to subscribe Newsletter with valid email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Passs valid email \u003cValidemail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Inspire Me button",
  "keyword": "And "
});
formatter.step({
  "name": "User is Subscribed to the  Newsletter successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Validemail"
      ]
    },
    {
      "cells": [
        "bilg@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "User is in Subscribe Newsletterform",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User opens Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.user_is_in_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to subscriber Newsletter form",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.navigates_to_subscriber_Newsletter_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test to subscribe Newsletter with valid email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Passs valid email bilg@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.user_entering_validemail_com(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Inspire Me button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.click_on_Inspire_Me_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is Subscribed to the  Newsletter successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.NewslettersubscriptionSteps.user_is_Subscribed_to_the_Newsletter_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Search.feature");
formatter.feature({
  "name": "Feature to test Search for any location using search bar",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check search functionality os working fine with valid keyword",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters \u003clocationname\u003e in search field",
  "keyword": "When "
});
formatter.step({
  "name": "Click on enter key",
  "keyword": "And "
});
formatter.step({
  "name": "Proper search result for corresponding location is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "locationname"
      ]
    },
    {
      "cells": [
        "TEXAS"
      ]
    },
    {
      "cells": [
        "FLORIDA"
      ]
    }
  ]
});
formatter.background({
  "name": "User is serch screen",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in trivago magazine home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_in_trivago_magazine_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on search icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to search page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_taken_to_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check search functionality os working fine with valid keyword",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters TEXAS in search field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_enters_serach_location_in_search_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on enter key",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.click_on_enter_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper search result for corresponding location is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.proper_search_result_for_corresponding_location_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is serch screen",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in trivago magazine home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_in_trivago_magazine_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on search icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to search page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_taken_to_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check search functionality os working fine with valid keyword",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters FLORIDA in search field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_enters_serach_location_in_search_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on enter key",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.click_on_enter_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper search result for corresponding location is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.proper_search_result_for_corresponding_location_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Check the search functionality using non matching keywords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Non matching keyword enters \u003cInvalidlocationname\u003e   in search field",
  "keyword": "When "
});
formatter.step({
  "name": "User Clicks on enter key",
  "keyword": "And "
});
formatter.step({
  "name": "No results are displayed for the corresponding location",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Invalidlocationname"
      ]
    },
    {
      "cells": [
        "Kerala"
      ]
    },
    {
      "cells": [
        "Kannur"
      ]
    }
  ]
});
formatter.background({
  "name": "User is serch screen",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in trivago magazine home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_in_trivago_magazine_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on search icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to search page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_taken_to_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the search functionality using non matching keywords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Non matching keyword enters Kerala   in search field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.non_matching_keyword_enters_Kerala_in_search_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on enter key",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_Clicks_on_enter_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "No results are displayed for the corresponding location",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.no_results_are_displayed_for_the_corresponding_location()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is serch screen",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in trivago magazine home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_in_trivago_magazine_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on search icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to search page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_taken_to_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the search functionality using non matching keywords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Non matching keyword enters Kannur   in search field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.non_matching_keyword_enters_Kerala_in_search_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on enter key",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_Clicks_on_enter_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "No results are displayed for the corresponding location",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.no_results_are_displayed_for_the_corresponding_location()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is serch screen",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in trivago magazine home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_in_trivago_magazine_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on search icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to search page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_is_taken_to_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the functionality of all destination tab under search filed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on All destination tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.user_clicks_on_All_destination_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proper result for all destinations is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Searchsteps.proper_result_for_all_destinations_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});