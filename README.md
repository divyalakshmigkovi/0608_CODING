# REA Coding Challenge
## Toy Robot Simulator

This project is built with Java programming language, JUnit testing framework, Maven build tool.

## Description

- All the requirements and constraints have been met.  
- The input is read from an input.txt file.  
- The output will be displayed on the command prompt.
- The board size and the location of input.txt file need to be given through command line input. 
- Please ensure that the commands are placed in the required format in input.txt file appropriately.  
- Functional & Integration testing are not covered in this project.  

## Getting Started

### Prerequisites

Before starting the installation you must have the following prerequisites. 

1. **Java** You must have Java installed and setup in your system. 
2. **Maven:** Maven is a dependency management and build automation tool that is based on POM. It simplifies the build process.
3. Unzip ToyRobotSimulator.zip file and place the Project in a desired location of your local_dev_path or download the project from GitHub using the following command.
```
git clone -bTOY-ROBOT-SIMULATOR https://github.com/divyalakshmigkovi/0608_CODING.git TOY-ROBOT-SIMULATOR
```
  
### Installing

This section details a step by step approach that tell you how to install and setup Java and Maven which are required for this application.

1. **Download & Install Java on Windows:** - https://www.oracle.com/au/java/technologies/javase/javase-jdk8-downloads.html
   - Run the downloaded .exe file
   - Set JAVA_HOME - Right click My Computer and select Properties. On the Advanced tab, select Environment Variables, and then edit JAVA_HOME to point to where the JDK       software is located, for example, C:\Program Files\Java\jdk1.8.0_66.
   - Set Java in Path - Right click My Computer and select Properties. On the Advanced tab, select Environment Variables, and then edit PATH to point to wJava bin directory, for example, %JAVA_HOME%\bin.
   - Verify Java installation
     ```
     java -version
     ```
    
2. **Download & Setup Maven on Windows:** - https://maven.apache.org/download.cgi
   - Download Apache Maven and unzip the file.
   - Set MAVEN_HOME, M2_HOME - Right click My Computer and select Properties. On the Advanced tab, select Environment Variables, create/edit MAVEN_HOME and M2_HOME to point to where the Maven software is located, for example, C:\apache-maven-3.6.3.
   -  Set Maven in Path - Right click My Computer and select Properties. On the Advanced tab, select Environment Variables, and then edit PATH to point to wJava bin directory, for example, %MAVEN_HOME%\bin.
   -  Verify Maven installation
      ```
      mvn -version
      ```
      
## Running the program

In your CLI, go to project root directory and run the below commands  

```
mvn clean
```
```
mvn install
```
Go to "target" folder under the root directory from CLI and run the below command to simuate the robot
```
java -jar toy-tobot-simulator-1.0.jar
```
You will see a prompt to continue with default board size 5 or enter a new board size. Next, you will get a prompt to enter the input file location. 
Please enter the file name along with the file location, for example, E:\NewEclipse\files\input.txt

## Executing the JUnit Tests

The "mvn install" by default runs the JUnit tests. However, in order to compile and run the test classes seperately, run the below commands.

```
mvn test-compile
```
```
mvn test
```

## Built With

* [Java] - A programming language 
* [Maven] - A Dependency Management tool
* [JUnit] - Testing Framework
* [Eclipse] - An integrated development environment



