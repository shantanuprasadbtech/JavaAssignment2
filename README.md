# Java Assignment 2

This code uses the concepts of array and arraylists to perform three primary functions:

1. Declares two arrays named ‘even’ and ‘odd’. Accept
numbers from the user and move them to respective arrays depending on
whether they are even or odd.

2. Finds 2 neighboring numbers in an
array with the smallest distance to each. The function should return the
index of the 1st number.

3. Convert an array into ArrayList and vice
versa.

This code consists of four classes and some supporting methods:

Main class:
This is the main class that contains the main method.
It interacts with the user to get the user's choice of operation.
Based on the user's choice, it calls the appropriate methods from the other classes.

EvenOddArray class:
This class contains a method to separate even and odd numbers from an input array.
It takes an integer array as input and returns two arrays, one containing even numbers and the other containing odd numbers.
ArrList class:
This class contains two methods to convert an array to an ArrayList and an ArrayList to an array.

UserInput class:
This class contains methods to get input from the user.
It prompts the user to enter the operator and the input array or ArrayList.

Functions and Methods

This method takes an integer array as input and separates the even and odd numbers from it.
It returns two arrays, one containing even numbers and the other containing odd numbers.

ArrayToArrayListMethod method:
This method takes an array as input and converts it to an ArrayList.
It returns the ArrayList.

ArrayListToArray method:
This method takes an ArrayList as input and converts it to an array.
It returns the array.

insertChoice method:
This method prompts the user to enter the choice of operation and returns it.

insertArray method:
This method prompts the user to enter the size and elements of an integer array and returns the array.

insertAnswer method:
This method prompts the user to enter the choice of conversion and returns it.

ArrListArray method:
This method prompts the user to enter the elements of an integer array and returns the array.

ArrayListInput method:
This method prompts the user to enter the elements of an ArrayList and returns the ArrayList.
