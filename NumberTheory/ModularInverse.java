package NumberTheory;

import java.util.*;

public class ModularInverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {


            int a = sc.nextInt();
            int m = sc.nextInt();
            Int x = new Int();
            Int y = new Int();
            int g = moduloInverse(a,m,x,y);

            if( g == 1 )
            {
                x.val = ( x.val + m ) % m;
                //This step is done just to make sure that x is between 1 and m
                System.out.println( x.val );
            }
            else System.out.println(" Modulo Inverse Does not exist ");
        }


    }


    public static int moduloInverse(int a, int b, Int x, Int y) {
        if (b == 0) {
            x.val = 1;
            y.val = 0;
            return a;
        }

        Int x1 = new Int();
        Int y1 = new Int();

        int gcd = moduloInverse(b, a % b, x1, y1);
        x.val = y1.val;
        y.val = x1.val - ((a / b) * y1.val);

        return gcd;
    }

//  (7*x)%5=1
//        x=3,8,13,...,3+im.
//         (a*x)%m=1<.............................................................
//        (a*x)%m=1   this equation can be written as  ax+my=gcd(a,m)=1          :
//                                                                               :
//           taking %m will not make any change                                  :
//            so here we have                                                    :
//        (ax)%m + (my)%m =1%m                                                   :
//                  --->0  -->1                                                  :
//        so we are left with                                                    :
//        (ax)%m=1                                                               :
//        (a*x)%m=1  >>>.........................................................:
//        You can see we got the same thing


}



    /**
     There are 2 ways of finding MMI ( Modular Multiplicative Inverse )

     MMI  of A under M is possible only when gcd(A,M)==1  or A and M are co-prime

     Question:   What is MMI ?

     Answer:  if (A x B) % M = 1
     then B is the Modular inverse of A under M



     1).

     Condition: M is prime
     A is not the Multiple of M
     A^-1 = A^M-2 % M
     MMI or Modular Multiplicative Inverse

     Time Complexity - O( log n )
     as we use binaryExponentiation

     2).

     Extended  Euclid Algorithm

     Remember LDE( Linear Diophantine Equation)
     ax + by = gcd(a,b)

     when we find the solution of LDE
     the Extended Euclid  Algorithm function returns
     (i)  gcd(a,b)
     (ii) x and y contains the solution of the

     in case of MMI
     the gcd(a,b)==1

     so , we can rewrite our equation as

     ax + by = 1
     taking Modulo of the above equation will not make any difference

     ( ax + by ) % M = (1 % M)
     (ax % M) + (by % M) = 1 % M   ------(i)



     Now coming back to our MMI condition
     (A x B ) % M = 1
     AB % M = 1

     A=>a   , B=>x

     ax % M = 1

     My % M  = 0 , adding this will not make any difference

     ax % M + My % M = 1 % M

     let's replace M with m

     (ax % m) + (my % m) = 1 % m  ---------(ii)

     Coming back to equation No. (i)
     Equation (i) and (ii) looks similar

     So, with the help of Extended Euclid Algorithm we can find MMI
     x will contain MMI and y will be nothing .
           g = moduloInverse(a,m,x,y);








     */
   /** int ans=( op * den );
                System.out.print(ans);


                        }

          public static int _gcd(int dividend ,int divisor)
         {

            if(divisor==0)
              return dividend;


             return _gcd( divisor ,dividend % divisor );
         }



        public static int biExp(int a, int b)
        {
            int ans=1;
            while(b!=0)
           {
                if((b&1)==1)
               {
                    ans=( int )(( ans * 1L * a ) % M);
               }
               a = ( int )(( a * 1L * a ) % M);
               b>>=1;
           }
            return ans;
        }


        }

*/