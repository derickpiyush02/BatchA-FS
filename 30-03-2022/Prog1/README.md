Sherlock considers a string to be valid if all characters of the string appear
the same number of times.
-It is also valid if he can remove just 1 character at one index in the string, 
 and the remaining characters will occur the same number of times. 

-Given a string S, determine if it is valid. If so, return YES, otherwise 
    return NO.

Example:
-if S=abc, it is a valid string because frequencies are [a:1,b:1,c:1]. 

-if s=abcc, it is a valid string because we can remove one c and have 1 
    of each character in the remaining string. 
    
-if s=abccc the string is not valid as we can only remove 1 occurrence of c. 
    That would leave character frequencies of [a:1, b:1,c:2].

Constraints:
Each character S[i] -> [a-z] 

Input Format:
---------------------------------
A single string .



Output Format:
------------------------------------
Print YES if string S is valid, otherwise, print NO.

Sample Input1:
----------------------
aabbcd

Sample Output1:
----------------------
NO

Explanation1:
Given S="aabbcd", we would need to remove two characters, 
both c and d -> aabb or a and b -> abcd, to make it valid. 
We are limited to removing only one character, so S is invalid.

Sample Input2:
------------------------------------
abcdefghhgfedecba

Sample Output2:
------------------------------------
YES

Explanation2:
All characters occur twice except for e which occurs 3 times. 
We can delete one instance of e to have a valid string.

