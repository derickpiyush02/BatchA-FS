(MAIN CONCEPT EXPLAINED IN THE END)

Larry has been given a permutation of a sequence of natural numbers 
incrementing from 1 as an array. He must determine whether the array can be sorted 
using the following operation any number of times:
-Choose any 3 consecutive indices and rotate their elements in 
such a way that ABC->BCA->CAB->ABC.

For example, if A={1,6,5,2,4,3}:

A				rotate 
[1,6,5,2,4,3]		[6,5,2]
[1,5,2,6,4,3]		[5,2,6]
[1,2,6,5,4,3]		[5,4,3]
[1,2,6,3,5,4]		[6,3,5]
[1,2,3,5,6,4]		[5,6,4]
[1,2,3,4,5,6]
YES

Input Format:
The first line contains an integer n, the length of A.
The next line contains n space-separated integers .

Constraints:
3<=n<=1000
1<=A[i]<=n
 
Output Format:
print YES if A can be fully sorted. Otherwise, print NO.

Sample Input1:
3
3 1 2
Sample Output1:
YES

Sample Input2:
5
1 2 3 5 4
Sample Output2:
NO

Explanation

Sample #1:
A=[3,1,2]->rotate->[3,1,2]->A=[1,2,3]
A is now sorted, so we print YES.

Sample #2:
No sequence of rotations will result in a sorted . Thus, we print NO.

(MAIN CONCEPT)

Simple Explanation:

Inversion: Let us assume that there is an array of length n.

For any index (i < j < n) if there is arr[ i ] > arr[ j ] i.e, if there is an element which is less than the current element on its right side, then there is an inversion.

The number of inversions on a particular element = Number of elements whose values are less than the current element and they are on the right side on the current element in the array.

Let p(i) = Number of inversions on ith element of an array.
So, the total number of inversions on complete array = p(0) + p(1) + p(2) + ..... + p(n-1).

What is parity? Parity is either even parity or odd parity.

Odd parity: A permutation(or set) of numbers is said to have an odd parity if the number of inversions on array is odd and similarly for even parity.
why?

Because, if there are k number of inversions, then you definitely have to swap at least k times in order to get the sorted array. If k is odd, then even number of swaps cannot make the array sorted and similarly if k is even, then odd number of swaps cannot make the array sorted.

No matter in which order (or in any way) you swap the elements you will always get an odd number of swaps in order to sort the array completely if it has odd parity and similarly if there is even parity then, you will always get even number of swaps when you sort the array.

So, in this question, we have to take any 3( let us make it as R) consecutive elements and rotate them any number of times and check whether array can be sorted or not.

If you take R consecutive elements and rotate one time, then the number of swaps is R-1 (Ex: 3<-2<-1 if you rotate one time it will get 2<-1<-3 i.e, you are swapping 3 with 2 and then with 1 i.e, 2 swaps). If you rotate two times, it will be 2*(R-1).

If you rotate n times, then the number of swaps = n*(R-1). hence, the number of swaps you are making will always be a multiple of R-1.

So, in order to check if the array can ever be sorted by rotating R consecutive elements until it gets sorted, then the number of inversions should be divisible by R-1. because the number of inversions is nothing but the number of swaps you have to make to get the array sorted. If you can make those many number of swaps using the multiple of R-1(i.e, by rotating n number of times), then we can say that there is a value (v) exists at which our array can be sorted.

