# Selenium Practice — The Internet Herokuapp

This project contains hands-on Selenium WebDriver practice tests using Java, Maven, and TestNG.

The practice website used in this project is:

https://the-internet.herokuapp.com/

## Tech Stack

- Java 23
- Maven
- Selenium WebDriver
- TestNG
- Google Chrome
- IntelliJ IDEA
- Git and GitHub

## Project Structure

```text
selenium_practice/
├── pom.xml
├── README.md
├── src/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseSetup.java
│       │   ├── pages/
│       │   │   ├── HomePage.java
│       │   │   ├── LoginPage.java
│       │   │   ├── AlertsPage.java
│       │   │   ├── FramesPage.java
│       │   │   └── FileUploadPage.java
│       │   └── tests/
│       │       ├── HomePageScenarios.java
│       │       ├── LoginScenarios.java
│       │       ├── AlertScenarios.java
│       │       ├── FrameScenarios.java
│       │       ├── FileUploadScenarios.java
│       │       ├── DynamicLoadingScenarios.java
│       │       └── TableScenarios.java
│       └── resources/
│           ├── config.properties
│           ├── testng.xml
│           └── files/
│               └── sample.txt
└── target/
```

## Prerequisites

Install the following before running this project:

- JDK 23
- Maven 3.9+
- Google Chrome
- IntelliJ IDEA
- Git

Check installed versions:

```bash
java -version
mvn -version
```

## Setup

1. Clone the repository:

```bash
git clone [https://github.com/YOUR_USERNAME/selenium_practice.git](https://github.com/YOUR_USERNAME/selenium_practice.git)
cd selenium_practice
```

2. Open the project in IntelliJ IDEA.

3. Download Maven dependencies:

```bash
mvn clean install -DskipTests
```

4. Run the tests.

## Test Class Naming

This project uses `Scenarios` at the end of Selenium test class names:

- `HomePageScenarios`
- `LoginScenarios`
- `AlertScenarios`
- `FrameScenarios`
- `FileUploadScenarios`
- `DynamicLoadingScenarios`
- `TableScenarios`

Maven Surefire is configured in `pom.xml` to include classes matching:

```xml
<include>**/*Scenarios.java</include>
```

Do not name the base class `BaseScenarios`, because Maven would treat it as a test class.

Use:

```java
public class BaseSetup
```

or:

```java
public class BaseTest
```

## Run All Tests

Run every Selenium test in the project:

```bash
mvn clean test
```

This command:

- Deletes the `target` folder
- Compiles the project
- Runs all TestNG tests
- Generates test reports

## Run One Scenario Class

Run only the homepage scenarios:

```bash
mvn test -Dtest=HomePageScenarios
```

Run only login scenarios:

```bash
mvn test -Dtest=LoginScenarios
```

Run with a clean build:

```bash
mvn clean test -Dtest=HomePageScenarios
```

## Run One Test Method

Run one method from `HomePageScenarios`:

```bash
mvn test -Dtest=HomePageScenarios#verifyHomePageTitle
```

Run another method:

```bash
mvn test -Dtest=HomePageScenarios#verifyHomePageUrl
```

Run multiple methods from the same class:

```bash
mvn test -Dtest=HomePageScenarios#verifyHomePageTitle+verifyHomePageUrl
```

Run one method from `LoginScenarios`:

```bash
mvn test -Dtest=LoginScenarios#validLoginTest
```

## Run Multiple Scenario Classes

Run two specific classes:

```bash
mvn test -Dtest=HomePageScenarios,LoginScenarios
```

Run all classes ending with `Scenarios`:

```bash
mvn clean test
```

## Run Tests by Package

Run all tests in the `tests` package:

```bash
mvn test -Dtest="tests.*"
```

Run all tests in a specific package, for example `basics`:

```bash
mvn test -Dtest="tests.basics.*"
```

Run all tests in the `locators` package:

```bash
mvn test -Dtest="tests.locators.*"
```

Run all tests in the `waits` package:

```bash
mvn test -Dtest="tests.waits.*"
```

## Run Tests in Headed Mode

Chrome opens visibly:

```bash
mvn clean test -DbrowserMode=headed
```

Run one class in headed mode:

```bash
mvn test -Dtest=HomePageScenarios -DbrowserMode=headed
```

## Run Tests in Headless Mode

Chrome runs in the background:

```bash
mvn clean test -DbrowserMode=headless
```

Run one class in headless mode:

```bash
mvn test -Dtest=HomePageScenarios -DbrowserMode=headless
```

## Run a TestNG XML Suite

If `testng.xml` is configured in `pom.xml`, run:

```bash
mvn clean test
```

To run a specific TestNG suite file:

```bash
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml
```

## Compile Without Running Tests

Compile main source code:

```bash
mvn clean compile
```

Compile test source code without running tests:

```bash
mvn clean test-compile
```

## Package the Project

Create a JAR file:

```bash
mvn clean package
```

Package without running tests:

```bash
mvn clean package -DskipTests
```

## Install Dependencies Locally

Build and install the project into the local Maven repository:

```bash
mvn clean install
```

Install without running tests:

```bash
mvn clean install -DskipTests
```

## Clean the Project

Delete the `target` folder:

```bash
mvn clean
```

## Maven Lifecycle Commands

| Command | Purpose |
|---|---|
| `mvn clean` | Deletes the `target` folder |
| `mvn compile` | Compiles main Java source code |
| `mvn test-compile` | Compiles test Java source code |
| `mvn test` | Compiles and runs tests |
| `mvn package` | Builds a JAR file |
| `mvn install` | Builds and installs the project into the local Maven repository |
| `mvn clean test` | Cleans, compiles, and runs all tests |
| `mvn clean package` | Cleans, compiles, runs tests, and creates a package |
| `mvn clean install -DskipTests` | Cleans, compiles, and installs without running tests |

## Frequently Used Maven Commands

| Command | Purpose |
|---|---|
| `mvn -version` | Shows Maven and Java version |
| `java -version` | Shows Java version |
| `mvn clean test` | Runs all tests |
| `mvn test -Dtest=ClassName` | Runs one test class |
| `mvn test -Dtest=ClassName#methodName` | Runs one test method |
| `mvn test -Dtest=Class1,Class2` | Runs multiple test classes |
| `mvn test -Dtest="package.*"` | Runs all tests in a package |
| `mvn clean test -DbrowserMode=headed` | Runs tests with visible Chrome |
| `mvn clean test -DbrowserMode=headless` | Runs tests with hidden Chrome |
| `mvn clean compile` | Compiles main code without tests |
| `mvn clean test-compile` | Compiles test code without running tests |
| `mvn clean package -DskipTests` | Creates a package without running tests |
| `mvn clean install -DskipTests` | Installs project locally without tests |
| `mvn dependency:tree` | Shows project dependencies |
| `mvn help:effective-pom` | Shows effective Maven configuration |
| `mvn clean test -e` | Runs tests with detailed error output |
| `mvn clean test -X` | Runs tests with Maven debug logs |

## Run Tests with Java 17

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
```

## Run Tests with Java 23

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 23)
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
```

## Test Reports

After running tests, open the Surefire report:

```text
target/surefire-reports/index.html
```

## Git Commands

Check project status:

```bash
git status
```

Add all changes:

```bash
git add .
```

Commit changes:

```bash
git commit -m "Practice: Selenium locators and TestNG tests"
```

Push changes to GitHub:

```bash
git push origin main
```

## Notes

- Every test class ends with `Scenarios`.
- Every test method must use the `@Test` annotation.
- Use explicit waits instead of `Thread.sleep()`.
- Use Page Object Model for reusable page actions and locators.
- Do not commit `target/`, `.idea/`, or generated test reports.
- Use headed mode while learning; use headless mode for faster repeated runs and CI/CD.
