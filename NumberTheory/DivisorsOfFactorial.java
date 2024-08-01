package NumberTheory;

import java.util.*;

/**
 *Problem statement
 * Given a number, find the total number of divisors of the factorial of the number.
 *
 * Since the answer can be very large, print answer modulo 10^9+7.
 *
 * Detailed explanation ( Input/output format, Notes, Images )
 * Input Format:
 * The first line contains T, number of test cases.
 * T lines follow each containing the number N.
 * Output Format:
 * Print T lines of output each containing the answer.
 * Constraints
 * 1 <= T <= 500
 * 0 <= N <= 50000
 * Sample Input:
 * 3

 * 2
 * 3
 * 4
 * Sample Output:
 * 2
 * 4
 * 8
 */
public class DivisorsOfFactorial {
    static int M=1000000000+7;
    static int N=50000;
    static int[] prime=new int[N+1];

    public static void generatePrimes()
    {
        prime[0]=1;
        prime[1]=1;
        for(int i=2;i*i<=N;i++)
        {
            if(prime[i]==0)
            for(int j=i*i;j<=N;j+=i)
            {
                prime[j]=1;

            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            generatePrimes();
            ArrayList<Integer> prim=new ArrayList<>();
            for(int i=2;i<=n;i++)
            {if(prime[i]==0)
                prim.add(i);
            }
//            System.out.println(prim);
            long j,res=1,pow;
            for(int i:prim)
            {  pow=0;
                j=i;
                while(n/j >=1)
                {
                    pow+=n/j;
                    j*=i;
                }
//                System.out.println(i+"...."+pow);
                res=((res%M)*((pow+1)%M))%M;
            }

            System.out.println(res);



        }

    }
}


//testCase  that was failing again and again
//50
//36
//398
//263
//331
//172
//10
//490
//220
//211
//12
//264
//375
//303
//442
//242
//93
//205
//105
//240
//263
//266
//433
//256
//492
//181
//52
//490
//232
//42
//428
//268
//39
//215
//9
//32
//5
//131
//372
//258
//276
//463
//193
//402
//265
//172
//96
//428
//71
//490
//36