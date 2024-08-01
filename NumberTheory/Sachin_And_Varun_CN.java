package NumberTheory;

/**
 * Problem statement
 * Varun and you are talking about a movie that you have recently watched while Sachin is busy teaching Number Theory. Sadly, Sachin caught Varun talking to you and asked him to answer his question in order to save himself from punishment. The question says:
 *
 * Given two weights of a and b units, in how many different ways you can achieve a weight of d units using only the given weights? Any of the given weights can be used any number of times (including 0 number of times).
 *
 * Since Varun is not able to answer the question, he asked you to help him otherwise he will get punished.
 *
 * Note: Two ways are considered different if either the number of times a is used or a number of times b is used is different in the two ways.
 *
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints:
 * 1 ≤ T ≤ 10 ^ 5
 *
 * 1 ≤ a < b ≤ 10 ^ 9
 *
 * 0 ≤ d ≤ 10 ^ 9
 * Sample Input 1
 * 4
 * 2 3 7
 * 4 10 6
 * 6 14 0
 * 2 3 6
 * Sample Output 1
 * 1
 * 0
 * 1
 * 2
 * Explanation
 * Test case 1: 7 can only be achieved by using 2 two times and 3 one time.
 *
 * Test case 2: 6 can't be achieved by using 4 and 10. So, 0 ways are there.
 * }
 *
 *
 * class Int
 * {
 *     long val;
 * }
 */

import java.util.Scanner;
class Sachin_And_Varun_CN{

    static long extendedGCD(long a , long b , Int1 x , Int1 y){
        if(b == 0){
            x.val = 1;
            y.val = 0;
            return a;
        }

        Int1 x1  = new Int1();
        Int1 y1 = new Int1();
        long g = extendedGCD(b , a % b, x1, y1);

        x.val = y1.val;
        y.val = x1.val - y1.val * (a / b);

        return g;
    }

    public static void main(String[] args) {
        long t , a , b , d;
        Scanner scanner = new Scanner(System.in);

        t = scanner.nextInt();

        while(t-- > 0){
            a = scanner.nextInt();
            b = scanner.nextInt();
            d = scanner.nextInt();

            long g;
            Int1 x = new Int1();
            Int1 y = new Int1();

            g = extendedGCD(a , b , x , y);

            if(d % g == 0){
                x.val = x.val * (d / g);
                y.val = y.val * (d / g);

                long L , R;

                long d1 = b / g;
                long d2 = a / g;

                L = (long) Math.ceil(((double) -x.val) / d1);
                R = (long) Math.floor(((double) y.val) / d2);

                if(L > R){
                    System.out.println(0);
                }else{
                    System.out.println(R - L + 1);
                }
            }else{
                System.out.println(0);
            }

        }
    }
}

class Int1{
    long val;
}



//input ans output


//4
//2 3 7
//4 10 6
//6 14 0
//2 3 6l1=3 l2= 3
//1
//l1=2 l2= 1
//0
//l1=0 l2= 0
//1