
# Plivo SDET -1 Assignment

This is a small BDD automation framework created for Plivo SDET-1 test to automate the scenarios mentioned in this [Document.](https://github.com/grv19/plivo/blob/master/Drag%20n%20Drop%20UI.docx)

[![Build Status](https://travis-ci.org/grv19/plivo.svg?branch=master)](https://travis-ci.org/grv19/plivo)

## Framework

I have created a small BDD framework using cucumber, selenium for UI automation using java as the coding language.
1.  Language: Java 8
2.  Testing framework: junit
3.  BDD framework: Cucumber jvm
4.  Automation tool: Selenium webdriver
5.  Build tool: maven
6. Reporting: cucumber html reporting

	**package: libs**
		It has chromerivers for linux and mac. This is required while creating the webdriver session.
	**package: features**
	It contains the descriptive test in steps as a cucumber feature file.
	**package: pageobjects**
	This has java classes contaning different locators used in our test
	**package: runner**
	Features/tests to be executed are defined in this class. Other test configurations are also defined here.
	**package: stepdefinitions**
	This package has the corresponding stepdefinition files for the features defined in the features package. Aditionally, it also contains a class for starting the webdriver session and a common methods class.

## Running the Project
Pre-requisites : Java and maven should be configured in the system. If not, configure both before moving to the next step.
1. Clone the build using the below command.
 ```bash
	git clone git@github.com:grv19/plivo.git
```
 2. Navigate to the project directory.
 ```bash
	cd plivo
```
3. Run the following maven command.
```bash
	mvn clean install
```
To view the cucumber run report, navigate to target/cucumber-html-report/index.html in the project directory.

## Issues and Contributing
I have tried to minimize the use of Thread.sleep where ever possible but still it can be found extensively in some steps. I've tried other waiting strategies too, but couldn't find much success, as a result of which Thread.sleep could be found in some steps.

Contributions are welcome to improve the waiting strategies, and any thing else that can be. :)
