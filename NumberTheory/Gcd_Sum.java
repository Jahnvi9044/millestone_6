package NumberTheory;

import java.util.Scanner;

/**
 * Problem statement
 * Consider all numbers from 1 to ‘N’, your task is to find the sum of gcd of all pairs (i, j) such that 1 <= i < j <= N.
 *
 * For example for N = 3, all pairs are { (1, 2), (1, 3), (2, 3) }.
 *
 * Note :
 *
 * Gcd of two numbers (X, Y) is defined as the largest integer that divides both ‘X’ and ‘Y’.
 * Detailed explanation ( Input/output format, Notes, Images )
 * Sample Input 1 :
 * 2
 * 3
 * 5
 * Sample Output 1 :
 * 3
 * 11
 * Explanation Of Sample Input 1 :
 * Test case 1:
 * gcd(1, 2) + gcd(1, 3) +  gcd(2, 3) = 1 + 1 + 1 = 3.
 *
 * Test case 2:
 * gcd(1, 2) + gcd(1, 3) +  gcd(1, 4) + gcd(1, 5) +
 * gcd(2, 3) + gcd(2, 4) + gcd(2, 5) +
 * gcd(3, 4) + gcd(3, 5) +
 * gcd(4, 5)  = 11.
 * Sample Input 2 :
 * 1
 * 1
 * Sample Output 2 :
 * 0
 * Explanation Of Sample Input 2 :
 * Test case 1:
 * As there is no possible Paris, so the gcd sum is 0.
 *
 */
public class Gcd_Sum {


    static final int N = 1000000;
    static int[] phi = new int[N+1];

    static void preprocess(){

        for(int i=1;i<=N;i++) phi[i] = i;

        for(int i=2;i<=N;i++)
            if(phi[i] == i){
                for(int j=i;j<=N;j+=i){
                    phi[j] = phi[j] / i;
                    phi[j] = phi[j] * (i - 1);
                }
            }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {    preprocess();


            int n=sc.nextInt();
            int res=0;
            for(int j=2;j<=n;j++)
            {
                int sum=gcd_Sum(j)-j;
                res = res + sum;

            }

            System.out.println("GCD of all the possible pairs till "+"n"+" ="+res);

        }
    }

    public static int gcd_Sum( int n ){

        int res=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               System.out.println(i+" ... "+phi[n/i]);
               res = res + phi[n/i]*i;
            }
        }

        System.out.println("Gcd sum till "+n+" = "+ res);
        return res;
    }
}
