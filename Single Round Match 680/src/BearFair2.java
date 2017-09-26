import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearFair2 {
	
	public String isFair(int n, int b, int[] upTo, int[] quantity) {

		int[] sortedUpTo = new int[upTo.length];
		int[] sortedQuantity = new int[upTo.length];
		for(int up : upTo) {

		}

		return null;

	}
}

/*
roblem Statement
    
Limak is a grizzly bear. He is big and dreadful. You were chilling in the forest when you suddenly met him. It's very unfortunate for you. He will eat all your cookies unless you can demonstrate your mathematical skills. To test you, Limak is going to give you a puzzle to solve.

It's a well-known fact that Limak, as every bear, owns a set of numbers. You know some information about the set:
The elements of the set are distinct positive integers.
The number of elements in the set is n. The number n is divisible by 3.
All elements are between 1 and b, inclusive: bears don't know numbers greater than b.
For each r in {0,1,2}, the set contains exactly n/3 elements that give remainder r when divided by 3. (That is, there are n/3 elements divisible by 3, n/3 elements of the form 3k+1, and n/3 elements of the form 3k+2.)

Limak smiles mysteriously and gives you q hints about his set. The hints are numbered 0 through q-1. For each valid i, the hint number i is the following sentence: "If you only look at elements that are between 1 and upTo[i], inclusive, you will find exactly quantity[i] such elements in my set."

In a moment Limak will tell you the actual puzzle, but something doesn't seem right... That smile was very strange. You start to think about a possible reason. Maybe Limak cheated you? Or is he a fair grizzly bear?

You are given the ints n and b. You are also given the int[]s upTo and quantity. Return "fair" (quotes for clarity) if there exists at least one set that has all the required properties and matches all the given hints. Otherwise, return "unfair".
Definition
    
Class:
BearFair2
Method:
isFair
Parameters:
int, int, int[], int[]
Returns:
String
Method signature:
String isFair(int n, int b, int[] upTo, int[] quantity)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Stack limit (MB):
256
Constraints
-
n will be between 3 and 48, inclusive.
-
n will be divisible by 3.
-
b will be between n and 1000, inclusive.
-
q will be between 1 and 50, inclusive.
-
upTo will have exactly q elements.
-
quantity will have exactly q elements.
-
Each element in upTo will be between 1 and b, inclusive.
-
Each element in quantity will be between 0 and n, inclusive.
Examples
0)

    
3
5
{2,3}
{1,2}
Returns: "fair"
Limak is a fair bear. Some sets that match his hints are {1,3,5} and {2,3,4}.
1)

    
6
1000
{500,100,950}
{4,3,6}
Returns: "fair"

2)

    
6
20
{5,19,10}
{0,3,2}
Returns: "unfair"
The second hint is that exactly 3 elements are between 1 and 19 (inclusive). But there should be 6 elements in total, all between 1 and 20 (inclusive). In this situation Limak is clearly being unfair, there is no set that matches these hints.
3)

    
3
6
{1,2,3,4}
{1,1,1,2}
Returns: "unfair"
The only sets that match the hints are {1,4,5} and {1,4,6}. However, none of them satisfies the constraints about numbers of elements with each reminder.
4)

    
48
1000
{38,450,202,685,971,661,946,226,901,353,12,937,655,108,31,908,845,908,981,896,296,987,77,790,679,
152,412,492,286,54,214,651,59,189,107,445,728,327,438,523,527,663,825,67,523,400,65,892,587,995}
{1,19,8,32,48,31,48,8,43,13,0,46,30,8,1,45,42,45,48,43,13,48,6,40,32,8,17,20,13,3,8,30,3,8,8,19,
37,13,19,21,21,31,41,4,21,16,4,43,23,48}
Returns: "fair"

5)

    
3
100
{40,60}
{2,1}
Returns: "unfair"

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 */
