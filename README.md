# Assessment

Details
Project: LockedMe.com
An application which can perform below functionalities
-	Display the content of a directory in ascending order
-	File Manipulations
-Adding a new file to the given directory
-Deleting an existing file from the directory
-Searching an existing file 
-Option to return to the main menu
-	Option to close the application
Developer Details
Name: Anjana Antony
Role: Java Developer
Company:  Company Lockers Pvt. Ltd

Algorithm used
Files.createFile() method from the Java NIO package is used for creating a file when user selects add a file option.
java.util.Collections.sort() method is used for Sorting the files in ascending order which is present in java.util.Collections class.
The delete() method of java.nio.file is used to delete the user specified file if present.
Linear search algorithm is used to search a particular file from the directory using for each loop listFiles. 
Exception handling
The listFiles() method is a part of File class. The function returns an array of Files denoting the files in a given abstract pathname if the path name is a directory else returns null.
Invalid inputs are handled by prompting user to provide the input again with an error message.
All the functionalities are implemented as methods inside the main class. The complete functionality is achieved by different method calls. 


Sprint 1:
•	Overall system design
•	Creating the GitHub repository 
•	Design and Development of the following:
o	Welcome Screen 
o	LockedMe.com and developer details
o	main menu with options
o	File sorting in ascending order
o	Application exit
o	File operations design and development
o	Sub menu development

Sprint 2:
•	Development of Adding a user specified file
•	Development of deleting a user specified file
•	Handling exceptions and invalid inputs from user
•	Search file functionality development
•	Back to main menu
•	Testing the system
•	Pushing the code to GitHub

GitHub repository 
https://github.com/anjana-antony4/Assessment1

future Enhancements
1.	File search based on file type
2.	Taking input for file content

