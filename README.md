# 📱 Mobile Test Automation Framework – Appium Java TestNG

A scalable Android mobile test automation framework built with **Java, Maven, TestNG, Appium, Selenium WebDriver APIs, and Allure Report**.

This framework automates the **ApiDemos Android application** using the included APK:

```text
src/test/resources/apps/ApiDemos-debug.apk
```

---

## 🧰 Tech Stack

| Tool / Library            | Purpose                                                     |
| ------------------------- | ----------------------------------------------------------- |
| Java 17                   | Programming language                                        |
| Maven                     | Build and dependency management                             |
| TestNG                    | Test execution and suite management                         |
| Appium                    | Mobile automation framework                                 |
| UiAutomator2              | Android automation driver                                   |
| Selenium WebDriver        | Core locator, element, wait, and driver APIs used by Appium |
| Allure Report             | Test reporting with steps, screenshots, and logs            |
| Android Studio / Emulator | Android SDK and virtual device execution                    |

---

## 📦 Application Under Test

This project uses the **ApiDemos Android APK** as the application under test.

The APK is included in the repository:

```text
src/test/resources/apps/ApiDemos-debug.apk
```

Appium installs and launches this APK automatically during test execution.

---

## 🏗️ Framework Features

* Page Object Model design
* Reusable `DriverFactory`
* Centralized configuration with `config.properties`
* Reusable utilities:

    * `WaitUtils`
    * `GestureUtils`
    * `ScreenshotUtils`
    * `LogUtils`
* Allure report integration
* Screenshots and logs in reports
* Scroll handling for mobile lists
* Maven-based command-line execution

---


---

## ⚙️ Prerequisites

Install the following tools before running the framework:

* Java 17
* Maven
* Node.js LTS
* Appium
* UiAutomator2 driver
* Android Studio
* Android Emulator
* Allure CLI

Verify installations:

```bash
java -version
mvn -version
node -v
npm -v
appium -v
adb devices
allure --version
```

Install Appium and UiAutomator2:

```bash
npm install -g appium
appium driver install uiautomator2
```

---

## ▶️ How to Run Tests

Start Android emulator.

Start Appium server:

```bash
appium
```


```bash
mvn clean test
```

Generate Allure report:

```bash
allure serve allure-results
```

---

## ✅ Test Cases Covered

1. Verify Dark Theme controls flow
2. Verify Light Theme controls flow
3. Verify Popup Menu behavior
4. Verify Date Widgets date selection
5. Verify Expandable Lists behavior
6. Verify Alert Dialog OK action
7. Verify Search View functionality
8. Verify Tabs navigation
9. Verify WebView screen display
10. Verify Spinner dropdown selection
11. Verify Buttons screen elements
12. Verify additional ApiDemos UI component interactions

---

## 📊 Reporting

Allure report includes:

* test execution status
* test steps
* screenshots
* logs
* failure details

---




