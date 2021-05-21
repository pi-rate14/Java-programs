<h1>Please Star the repository if it helps you :)</h1>
<h3> Cycle Sheet 1 </h3>
<p>1. Write a program to print the multiplication table of a number. </p>
<p>2. Write a program to check whether the given number is an Armstrong number or not. </p>
<p>3. Write a program to find the factorial of a number using command line arguments.  </p>
<p>4. Write a program to check whether the given number is a prime number or not  </p>
<p>5. Write a program to generate the following patterns. 
    <pre>
    i) 1    ii)  * 
       1 2      * * 
       1 2 3   * * * 
                * * 
                 *
    </pre>
  </p>
<p>6. Write a program to generate the Fibonacci series. </p>
<p>7. Write a program to sort n numbers in ascending order.  </p>
<p>8. Write a program to search a number among n numbers using binary search. </p>
<p>9. Write a program to read ‘n’ numbers and print their sum and average. </p>
<p>10. Write a program that accepts a number as input and convert them into binary, octal and hexadecimal equivalents. </p>
<p>11. Write a menu driven program to i) append a string ii) insert a string iii) delete a portion of the string. </p>
<p>12. Write a program to check whether a string is palindrome or not without using functions. </p>
<p>13. Write a menu driven program to i) compare two strings ii) get the character in the specified position iii) extract a substring iv) replace a character with the given character v) get the position of a specified substring/character </p>
<p>14. Write a program to change the case of the letters in a string. Eg. ABCdef abcDEF </p>
<p>15. Write a class with the following methods: 
<b>wordCount:</b> This method accepts a String object as an argument and returns the number of 
words contained in the object. 
<b>arrayToString:</b> This method accepts a char array as an argument and converts it to a String 
object. 
<b>mostFrequent:</b> This method accepts a String object as an argument and returns the character that 
occurs the most frequently in the object. </p>
<p>16. Create a class Student (Regno, Name, Branch, Year, Semester and 5 Marks). Add methods to read the student details, calculate the grade and print the mark statement. </p>
<p>17. Write a program that displays an invoice of several items. Create a class called Item with members item_name, quantity, price and total_cost and methods to get and set values for the members. Derive a new class to print the bill using Item class. </p>
<p>18. Create a class Telephone with two members to hold customer’s name and phone number. 
The class should have appropriate constructor, input and display methods. Derive a class 
TelephoneIndex with methods to change the name or phone number.Create an array of objects 
and perform the following functions.<br> 
a. Search for a name when the user enters a name or the first few characters. <br>
b. Display all of the names that match the user’s input and their corresponding phone numbers. <br>
c. Change the name of a customer. <br>
d. Change the phone number of a customer.</p>
<p>19. Create an abstract class called BankAccount with members customer name, date of birth, 
address, account number, balance and member functions to get values for the members and 
display it. Derive a class SavingsAccount with member functions to perform deposit and 
withdraw in the account. Write a menu driven program to create a new account, perform 
withdraw, deposit and delete an account. </p>
<p>20. Create an Interface with methods add(), sub(), multiply() and divide(). Write two classes 
FloatValues to perform arithmetic operations on floating point numbers and IntegerValues on 
integer numbers by implementing the interface. </p>
<h3> Cycle Sheet 2 </h3>
<p>1. Write a program to demonstrate the knowledge of students in Java Exception handling.
Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException.  If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’.</p>
<p>2. Write a program to demonstrate the knowledge of students in Java Exception handling.
Create a class by name Employee with members – Employee ID, Name and year of birth. The Employee ID is a string that contains the ID in the format year-designation-number. The year is represented with the last two digits. The designation is a single letter code - 'F' for faculty and 'S' for staff. The number is a 3 digit number.<br>		
(Example:     81-F-112	79-S-254)<br>
Write a program to read the employee details and validate the employee code. If the employee code is incorrect throw a user-defined exception "InvalidEmployeeCode" else create the Employee object and display the details of the employee.
 </p>
 <p>3. Write a program to demonstrate the knowledge of students in multithreading.
Eg., Three students A, B and C of B.Tech-IT II year contest for the PR election. With the total strength of 240 students in II year, simulate the vote casting by generating 240 random numbers (1 for student A, 2 for B and 3 for C) and store them in an array. Create four threads to equally share the task of counting the number of votes cast for all the three candidates. Use synchronized method or synchronized block to update the three count variables. The main thread should receive the final vote count for all three contestants and hence decide the PR based on the values received.
 </p>
 <p>4. Create a User Defined Exception, Implement a remainder ClockAPP to the person saying Good Morning, Good Afternoon and Good Night by showing the current time. Write a code that assigns different values to the String variable timeofDay based on the value of time in hours. Raise remainder if time is 5 and 12, including 5 but not including 12, set timeofDay to “Morning, Have Fresh Vegetable Juice and then Sugar Tablet with mild walking”. Raise Exception, if time is between 12 and 17, including 12 but not including 17, set timeofDay as “its Day Time, after lunch have tablet to avoid sleep”. If time is between 17 and 18.30. Including 17 but not including 18.30, set timeofDays as “Hello, Good Evening have a dinner” and finally, if time variable does not satisfy all the above condition, set time as “Night, Go for sleep”.  </p>
<h3> Cycle Sheet 3 </h3>
<p>1. Write a program to demonstrate the knowledge of students in working with Java collection framework.<br>
Eg., Assume only a maximum of 3 courses can be registered by a student for week end semester classes.  Create a hashmap ‘h1’ with ‘n’ key-value pairs where keys are the names of students and values are the courses registered by them. Create another hashmap ‘h2’ with ‘m’key-value pairs where keys are the names of courses offered for B.Tech-IT and values are the names of faculty handling the courses. Write appropriate code to<br>
-	Add or remove a student from h1<br>
-	Iterate over the maps and display the key-value pairs stored in them<br>
-	Given a student name, fetch the names of all those who teach him/her.<br>
For the student “B”, faculty should be displayed as 333 and 444.
 </p>
<p>2. Create a class tourist which has the data members name, state, famous_spot . Create a list of all the states in the south. Add the tourist places to the list based on state. Display the list in sorted order. Search a tourist spot from the list and display the details. Raise an exception if the details are not present. </p>
<p>3. The following list gives the amount of rainfall (in cms) recorded at a particular place for 12 months.<br>
10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5.<br>
Store these values in an queue. Find the average rainfall and display the count of the number of months in which the rainfall is more than the average.
 </p>
<p>4. The librarian would like to maintain a list which has the information about the book name, author, price, no_of_copies in the library. Max 5 books can be placed in a rack. Create a hashmap of the book object with the rack no.  Write a method search to read a book name and return its rack no. Write a method sort to display the book name in a particular rack.  </p>
<p>5. An Industry collects the product sample measurements (product id, diameter, length, weight) for quality test and sends it to the quality assurance (QA) department in a serialized manner. The QA departments deserialize the samples and checks if the length=10cm, diameter=3cm, weight=100gms. The product id of defective samples are stored in a set.  The product id of correct samples are stored in  another sort. Sort the correct samples in list.                                                                                                                                                    </p>
