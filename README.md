# CS585-Final-Project-Artifacts

*** NOTE: The artifacts in this project differ from the ones presented in my presentation. In the presentation, I used an application called JRecruiter to test the tools on. When compiling the project, JRecruiter was found to be unstable. I swapped it out for the Breadcrumb application found in this repo. Additionally, I changed the coverage metrics to include the entirety of the source code that was being tested and that affected the coverage output. These results/changes are reflected in my project report. ***

This repository contains the artifacts from Thomas Hays' CS-585 Final Project. The project is an evaluation of two different unit test case generation tools to gauge their effectiveness in attaining statement coverage in the tests they generate. This project specifically tests these tools on Java Spring Web Applications that utilize an MVC architecture. The .JAR files for the tools (Randoop and Evosuite) and the source code for the projects they are tested on (Breadcrumb, Petclinic, and Todo).

The .JAR files for the tools can be found in:
      randoop-4.2.1
      evosuite

The source code for the projects can be found in:
      BreadCrumb-Spring-MVC-master
      evosuite
      randoop-4.2.1

The tests that were generated for this evaluation can be found in the `test` directory of each of the source code projects. The tests that were generated with Randoop can be found in the packages `two_seconds`, `ten_seconds`, etc. The tests that were generated with Evosuite can be found in the packages `evo_two_seconds`, `evo_ten_seconds`, etc. Each of the names in the packages correspond to how long the tools were respectively given to generate tests.

The source code for the projects have not been edited besides changing the `pom.xml` files so that they can find the Evosuite and Randoop dependencies to compile correctly.

HOW TO RUN:

To run these tests, you will need to install Java JDK and JRE, found here:

You will also need Maven, which can be found here:

Once that is complete, you will need to install all the dependencies needed for the project, which can be done through Maven. To do so navigate to the the directory of each project where the `pom.xml` file is located. The locations of the `pom.xml` files for each project are below:
      BreadCrumb-Spring-MVC-master\pom.xml
      spring-petclinic-master\pom.xml
      todo-management-spring-boot-master\pom.xml

Run the command `mvn clean install` and Maven will then download/install all needed dependencies and build the project source code. Once that is done you can then run the tests and evaluate the resulting statement coverage however you would prefer. Each project had their statement coverage evaluated with InteliJ IDE and it's built in code-coverage tool. That would be the quickest way to evaluate the coverage the tests provide. 
