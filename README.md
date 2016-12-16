# gherkin_test project
Automated web test cases using Java and Gherkin.

## Used technologies and versions
- Intellij IDEA 15.0.4
- Maven 3.3.9
- Selenium 2.53 with Firefox 45
- Java 1.8.x
- JUnit 4.12
- Cucumber 1.2.5
- Surefire Report 2.16

## How to set up test execution on Windows
 - Install Firefox 45
 - Download Maven 3.3.9
 - Add maven/bin folder to system path
 - download the project (https://github.com/balazspap/gherkin_test)
 - run "mvn clean test -Dfirefox.folder=\path\to\firefox\exe" command from the "gherkin_test" folder (e.g. mvn clean test "-Dfirefox.folder=C:\Mozilla Firefox\firefox.exe")
 
### ToDos:
- Cover all missing requirements
- Create proxy service for response status code monitoring
- Use a better abstraction in Page Object Pattern