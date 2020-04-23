CDK Global Customer Portal Technical Test

The app has been developed with spring boot framework.
The app allows to add a comment to an existing case. The case data is loaded from a predefined case.json file. Upon saving the comment the app updates the data file.


Requirements
* Java 8
* Maven

How to run?
1. Open the src/main/resources/application.properties file in any text editor and change the 'casedata.file.path' parameter to the path to 'cases.json' file.
2. To run the app open the terminal and run the following command:
   mvn spring-boot:run
3. Open the browser and go to http://localhost:8080

Assumptions
1. Did not show the ID field in the Comments section as it seems unnecessary to put in there.
2. Put an option to input User Name while adding a comment as there is no Login or Signin option before adding a comment.
3. Saved the Date field as Timestamp.

