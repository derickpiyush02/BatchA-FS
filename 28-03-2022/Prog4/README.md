You are given a string S, consist of both lowercase and uppercase alphabets.

Your task is to find out the length of the longest word W with the 
following properties:
	- The word should be the longest.
	- The word can be formed with letters of S, and you can shuffle the letters 
	as your need. You cannot use the letters more than their occurence count.
	- The word should be equal to the reverse of it.
	
NOTE: Alphabets are case sensitive
"Aa" is  not equal to "aA". The letters 'a' and 'A' are not same

Input Format:
-------------
A string S, consist of lower/uppercase letters

Output Format:
--------------
Print an integer, length of longest word W.


Sample Input-1:
---------------
pqrrrrss

Sample Output-1:
----------------
7

Explanation:
------------
One of the longest word can be formed is "srrqrrs", with length 7.


Sample Input-2:
---------------
AIbohPhObia

Sample Output-2:
----------------
5

Explanation:
------------
One of the longest word can be formed is "bhPhb", with length 5.
