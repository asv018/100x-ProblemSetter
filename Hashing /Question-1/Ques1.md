# Description
Your class teacher wrote N integers on the board. One of your classmates was being mischievous, he replaced the N integers with all possible subset sums of the array when the teacher was not in the class. 
Suppose that the integers on the board were [2,1] then the subsets will be: {}, {2}, {1}, {2,1} and the subset sums will be: {0,2,1,3}. 
Your task is to rebuild the original array given by your teacher.


# Input Format
The first line of the input contains one integer T - the number of test cases. Then T test cases follow.
The first line of each test case contains one integer N - the number of elements in the initial array.
The second line of each test case contains 2N space-separated integers, the new values on the board.

# Output Format
For each test case, print N space-separated integers in non-decreasing order.
It is guaranteed that a solution always exists.

# Constraints
1 ≤ T ≤ 50
1 ≤ N ≤ 15
0 ≤ Ai ≤ 10^15

# Sample Input 1
3
2
0 1 2 3
3
0 1 3 4 5 6 8 9
3
0 1 1 1 2 2 2 3


# Sample Output
1 2 
1 3 5 
1 1 1