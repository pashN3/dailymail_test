Test Automation using **Selenium**, **Cucumber**, **JUnit**, **Maven**, and **Java Language** with **Page Object Model**
---
---

## How to Create?

#### 1. Java Development Kit (JDK)
* [Download](https://www.oracle.com/technetwork/java/javase/downloads/index.html) and [install](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm#JSJIG-GUID-F575EB4A-70D3-4AB4-A20E-DBE95171AB5F) JDK
* Setting the system variables
    * Create and open your .bash_profile using Terminal
        ```sh
        $ cd ~/
        $ touch .bash_profile
        $ open -e .bash_profile
        ```
    * Set the Java paths in your .bash_profile file
        ```
        export JAVA_HOME=/Library/Java/JavaVirtualMachines/{JDK_VERSION_FOLDER}/Contents/Home
        export PATH=$PATH:$JAVA_HOME/bin
        ```
    * Save and exit your .bash_profile
* Type `java -version` in your Terminal to verify installation and find out your java version
* See the output of [java version](https://prnt.sc/p8zd7s)

#### 2. ChromeDriver
* Install [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) using brew
* Type `brew cask install chromedriver` in your Terminal
* Follow the instructions until chromedriver installing success
* Type `chromedriver -version` to find out your chromedriver version
* See the output of [chromedriver version](https://prnt.sc/pv8v1r)

#### 3. Maven
* [Download](https://maven.apache.org/download.cgi) [Maven](https://maven.apache.org/) as your build tools
* Extract downloaded maven into your current or random directory
* Adding maven to the environment path
* Add path variable to .bash_profile file
    ```
    export HOME=/{YOUR_DIRECTORY}/apache-maven-{YOURVERSION}
    export PATH=$PATH:$HOME/bin
    ```
* Verify your maven installation using `mvn -version` in your Terminal
* See the output of [Maven version](https://prnt.sc/pvps0n)

#### 4. STS or IDE of your choice
* Download and install your IDE using (https://www.javatpoint.com/spring-boot-download-and-install-sts-ide) or etc.
* Open your IDE that installed
* Click File -> import ->Maven->Existing Maven project
* Select the pom file of the project
---

## How to Execute?

#### 1. Run the Test
* You are ready to automate the test in (https://www.mailtravel.co.uk/)
* Run your test using `mvn install` or `mvn verify` from Terminal

#### 2. Test Result
* See the result inside `target/cucumber-reports/advanced-reports/cucumber-html-reports` or `target/cucumber-reports/cucumber-pretty` folders that automatically generated after finished the test execution
* Open html file in your browser
* Or you can create your result view using json file inside  `target/cucumber-reports`

