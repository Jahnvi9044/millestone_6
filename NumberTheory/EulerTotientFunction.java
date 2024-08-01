package NumberTheory;

import java.util.*;

/**
 * Problem statement
 * You are given an integer N and are supposed to find the value of Euler toient function for N phi(N)
 *
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^9
 * Sample Input:
 * 2
 * 20
 * 21
 * Sample Output:
 * 8
 * 12
 * import java.util.*;
 *
 * public class Solution {
 *
 *
 * 	public static void main(String[] args) {
 * 		/* Your class should be named Solution.
 *  			* Read input as specified in the question.
 *  			* Print output as specified in the question.
 *                */

public class EulerTotientFunction {
//  phy(n)=n*(1-1/p1)*(1-1/p2)...
//    where p1,p2,p3... are prime no.s

        public static void main(String[] args) {
            /* Your class should be named Solution.
             * Read input as specified in the question.
             * Print output as specified in the question.
             */

            // Write your code here

            Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();
            while(t-->0)
            {
                 int n=sc.nextInt();
                 int res=n;

                for(int i=2;i*i<=n;i++)
                {
                    if(n%i==0)
                        res=(res*(i-1))/i;

                    while(n%i==0)
                        n=n/i;

                }


//                This is for the last prime no or if the no is a prime no
//                Suppose n=28            after the loop n = 7
//                                        7 is not added in the solution
//                so it will be added in the last
//

//                This is done for one case more
//                when n is prime no
//                  n=2,3,5,7,11,13,17...

//
                if(n!=1)

                    res=(res*(n-1))/n;

                System.out.println((int)res);


            }

        }

    }
//4 t
// 1000 n
//400   res
//2  n
//1  res
//11   n
//10  res
//5  n
//4 res