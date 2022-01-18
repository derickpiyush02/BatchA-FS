Sundeep is working with integer sets.
He is given a set of integers nums[], consist of positive integers.
You have to find a subsequence of integet set nums[], where the sum of elements
is equal to the sum of the rest of the elements.

Check whether you are able to split the entire set nums[], into two subsequences
where the two subsequences never share the elements from same index.

If it is possible to split, print true.
otherwise print false.

The first line of input contains the size followed by array elements 

Sample Input-1:
---------------
4
4 2 8 6

Sample Output-1:
----------------
true

Explanation:
----------
[4,6] and [2,8] sum of both the sets equal to 10.


Sample Input-2:
---------------
5
2 3 4 5 8

Sample Output-2:
----------------
true

  
Actual Test Cases
-----------------
case =1
 input =4 4 2 8 6
 output =true 

case =2 
input =5 2 3 4 5 9
 output =false

 case =3
 input =10 120 107 56 50 15 44 92 66 66 46
 output =true 

case =4
 input =10 79 24 71 47 20 106 39 121 36 58
 output =false

 case =5
 input =20 19 69 72 86 84 47 92 35 40 27 104 111 36 60 78 33 99 35 82 68 output =false
