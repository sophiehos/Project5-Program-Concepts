# Project5-Program-Concepts
Java Exercise 5
Magic 8 Ball
A magic 8 ball is a popular fortune telling toy in which the user places the ball face down, asks a
yes-or-no question and turns the ball face up to reveal the answer.
The standard magic 8 ball has 20 standard answers shown below, where 10 are positive (green),
5 are non-committal (yellow), and 5 are negative (red) (credit: Wikipedia)
Write a program that does the following:
1. Stores all the responses in a String array using an initializer list.
2. Generates a random number for the responses using a random object (in the range 0 to 19)
3. Prompts the user to enter a question.
4. Uses the random number to access and display the corresponding response (example: if the
random number generates 4 it should display “You may rely on it.”)
5. Asks the user if they want to ask another question (using a do – while loop). The code should
repeat as long as the user says “yes”.
A sample of the output are shown below:
What is your question? Will John get me some Panera tomorrow?
Reply hazy, try again.
Would you like to ask another question? (Answer yes or no): yes
What is your question? Will my dog become an instagram star?
Yes.
Would you like to ask another question? (Answer yes or no): yes
What is your question? Will I pass this class if I study hard?
Without a doubt.
Would you like to ask another question? (Answer yes or no): no
Notes:
• Use the equalsIgnoreCase method to accept any version of the word yes. You can use it
like str.equalsIgnoreCase(“yes”) where str is a variable of type string.
• You may have to deal with the annoying problem of capturing the [Enter] that is pressed
between responses. Remember, you can capture it with an extra nextLine method – but
be sure to put it in the right place!
Less than the limit
Write a program that does the following:
1. Ask the user to enter 10 integers (to fill an array)
2. Ask the user to enter a number, representing a limit
3. Call a method that displays all values that are less than the limit
• Your method should accept the array and the limit as formal parameters
• The method does not return a value, but outputs the values that are greater
than the limit values (Note: the output could be blank if the limit value is too
small)
Sample output:
Please enter 10 numbers: 45 78 90 34 56 23 12 82 67 28
Please enter a limit: 50
45 34 23 12 28 are less than the limit 50
Note: See the example on slide 4 in lecture 9B to review how to pass an array in a method.
Multiplication Table
Write a program that uses a 2-dimensional array to create a multiplication table. The array
should have 12 rows, but to make it interesting, the program should ask the users for the
number of columns. (Make sure they enter a value greater than 2 for the number of columns.)
The program will then create a 2-d array based on the user’s size of the column, with the
multiples of 1 to 12 filling the array.
You will need:
1. A constant to store the number of rows
2. A variable to store the number of columns (provided as input from the user)
3. A while loop to validate the input for the number of columns
4. A two dimensional array to generate the table (after receiving the rows and the number
of columns)
5. Nested for loops to fill the array.
6. Nested for loops to print the array.
Sample output:
Enter number of columns: 1
Sorry, value must be greater than 2.
Enter number of columns: 9
Here's your table:
1 2 3 4 5 6 7 8 9
2 4 6 8 10 12 14 16 18
3 6 9 12 15 18 21 24 27
4 8 12 16 20 24 28 32 36
5 10 15 20 25 30 35 40 45
6 12 18 24 30 36 42 48 54
7 14 21 28 35 42 49 56 63
8 16 24 32 40 48 56 64 72
9 18 27 36 45 54 63 72 81
10 20 30 40 50 60 70 80 90
11 22 33 44 55 66 77 88 99
12 24 36 48 60 72 84 96 108
Notes:
• Notice that the first value in the first row and column is 1, not 0.
• Listing 8.13 (pg 385) in the (9th edition) text is very helpful for understanding the
concepts for this question
