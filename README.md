<h1>Lely Selenium Java Automation Project</h1>
This project is prepared for the Lely recruitment process.
<h2>Tool stack</h2>

* Java
* Selenium
* Cucumber
* Junit
* IntelliJ

<h3>Requirements</h3>

* Java 8 or higher must be installed (Version 8 preferred) <a href="https://www.oracle.com/java/technologies/downloads/#java8"> Java download link
* Maven must be installed <a href="https://maven.apache.org/download.cgi">Maven download</a>, <a href="https://maven.apache.org/install.html"> Maven install link</a>


<h3>Project Tree</h3>

```
.
├── README.md
├── config
│   └── baseConfig.properties
├── pom.xml
├── src
│   └── test
│       ├── java
│       │           ├── driver
│       │           │   ├── DriverFactory.java
│       │           ├── pages
│       │           │   ├── BasePage.java
│       │           │   ├── Homepage.java
│       │           │   ├── LoginPage.java
│       │           ├── runners
│       │           │   └── MainRunner.java
│       │           ├── step_def
│       │           │   ├── HomepageSteps.java
│       │           │   ├── Hooks.java
│       │           │   ├── LoginSteps.java
│       │           └── utils
│       │               ├── ConfReader.java
│       │               ├── GlobalVars.java
│       │               
│       └── resources
│           └── features
│               └── login.feature
└── target
```

<h4>config Folder</h4>
Used for environment variables. There are usually .properties files.

<h4>Pages Folder</h4>
This will be used for Page Object Model implementation in the project. Locators should be defined at the top of the page.
The locator definition should not be made inside the methods. Actions of all steps are defined on pages.

<h4>Runner Folder</h4>
The cucumber execution configuration is done in this folder.

<h4>Step definitions folder</h4>
This folder will be the place where the step definitions of the scenarios are made. Code should not be written in steps files. Functions must be called from the corresponding Page class.
In the Hooks class, the actions to be taken before and after each scenario is run are defined. (Driver stand-up, screenshots)

<h4>Features folder</h4>
Feature files, that is, test cases in Gherkin format will be located under this folder.

<h4>Utils Folder</h4>
The utils class and methods of the project will be defined in this folder.
<h4>pom.xml</h4>
The file required for the installation of project necessary libraries and their plugins.

<h4>target/cucumber-html-reports</h4>
Generates cucumber html reports after each execution.

<h2>Naming Convention</h2>

Conditions are requested when naming. Names should be short and meaningful.

``directory names = my-directory (lower camel case)``

``variable name = myVariable (lower camel case)``

``method name = myMethod (lower camel case)``

``class name = MyClass (Upper camel case)``

``WebElement myElement (lower camel case)``

``Feature name = MyFeature (Upper camel case)``

``folder name = my-folder``

``tag name = @myTag``



<h2> Test Run </h2>

Maven CLI command to run tests.

execution tests via Tag :

``
mvn test -Dcucumber.filter.tags="@smoke"
``

execution tests via Cucumber options

``
mvn test -Dcucumber.options="--tags @smoke"
``

execution tests via Feature

``
mvn test -Dcucumber.options="src/test/resources/features/login.feature" -Dcucumber.filter.tags="@regression"
``
