package TwoPointer;

import java.util.*;
//codeforces Extra Problem

/**
 * A. Kirill And The Game
 * time limit per test2 seconds
 * memory limit per test256 megabytes
 * inputstandard input
 * outputstandard output
 * Kirill plays a new computer game. He came to the potion store where he can buy any potion.
 * Each potion is characterized by two integers — amount of experience and cost.
 * The efficiency of a potion is the ratio of the amount of experience to the cost. Efficiency may be a non-integer number.
 *
 * For each two integer numbers a and b such that l≤a≤r and x≤b≤y there is a potion with
 * experience a and cost b in the store (that is, there are (r-l+1)·(y-x+1) potions).
 *
 * Kirill wants to buy a potion which has efficiency k. Will he be able to do this?
 *
 * Input
 * First string contains five integer numbers l, r, x, y, k (1≤l≤r≤10^7, 1≤x≤y≤10^7, 1≤k≤10^7).
 *
 * Output
 * Print "YES" without quotes if a potion with efficiency exactly k can be bought in
 * the store and "NO" without quotes otherwise.
 *
 * You can output each of the letters in any register.
 *
 * Examples
 * inputCopy
 * 1 10 1 10 1
 * outputCopy
 * YES
 * inputCopy
 * 1 5 6 10 1
 * outputCopy
 * NO
 */
public class GamePortion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double r = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double k = sc.nextDouble();
        if (l / x > k && l / y > k)
        {        System.out.println("NO");
                 return ;
        }
        for(double i=l;i<=r;i++)
        {
            for(double j=x;j<=y;j++)
            {
                double c=i/j;

//                System.out.println(c);
                if(c==k)
                {
                    System.out.println("YES");
                     return ;
                }
                else if(c<k)
                    break;

            }

        }







        System.out.println("NO");





}}
//1000000 10000000 1 100000 1