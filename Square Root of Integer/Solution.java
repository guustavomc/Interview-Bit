/*Problem Description

Given an integer A.
Compute and return the square root of A.
If A is not a perfect square, return floor(sqrt(A)).

DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY.
NOTE: Do not use sort function from standard library. Users are expected to solve this in O(log(A)) time.

Problem Constraints
0 <= A <= INTMAX

Input Format
The first and only argument given is the integer A.

Output Format
Return floor(sqrt(A))

Example Input
Input 1:
 11
Input 2:
 9

Example Output
Output 1:
 3
Output 2:
 3


Example Explanation
Explanation:
 When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 When A = 9 which is a perfect square of 3, so we return 3.*/
public class Solution {
    public int sqrt(int A) {
        if(A==0 || A==1){
        return A;
    }
    
    int right=A;
    int left=1;
    int result=0;
    
    while(left<=right){
        int middle = left+(right-left)/2;
        
        long sq = (long) middle * middle;

        
        if(sq==A){
            return middle;
        }
        else if(sq<A){
            result = middle;
            left= middle+1;
        }
        else{
            right = middle-1;
        }
    }
    return result;
    }
}
