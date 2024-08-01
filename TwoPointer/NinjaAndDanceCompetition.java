package TwoPointer;

import java.util.*;

public class NinjaAndDanceCompetition {

    /**
     * Problem statement
     * Ninja has been asked to organize a dance competition. Ninja decided that he will
     * take individual entries and then will divide them into pairs. As part of the entry
     * , he asked the participants to choose any number.
     *
     * Ninja then thought of a creative method to divide them into pairs. He decided that he would
     * select a number ‘K’, and then select numbers from the list that have a difference equal to ‘K’.
     *
     * You need to help Ninja in finding the number of distinct pairs from the numbers with differences equal to ‘K’.
     *
     * Example:
     * Let us suppose the numbers are chosen by participants: [2, 6, 5, 2, 3] and K = 3, then the distinct
     * pairs having differences equal to K are: [2, 5] and [3, 6] so print 2.
     * Note:
     * The list of numbers can contain duplicate numbers, you need to print only the distinct pairs.
     *
     * For example [2, 2, 3, 4] and K = 1, so you need to print 2 as the two distinct pairs are: (2, 3) and (3, 4).
     * Detailed explanation ( Input/output format, Notes, Images )
     * Constraints:
     * 1 <= T <= 10^2
     * 0 <= N <= 10^4
     * 0 <= K <= 10^4
     * 0 <= ARR[i] <= 10^9
     *
     * Where ‘ARR[i]’ is the value of elements of the array.
     *
     * Time Limit: 1 sec
     * Sample Input 1:
     * 2
     * 5 3
     * 2 6 5 2 3
     * 4 1
     * 1 1 2 2
     * Sample Output 1:
     * 2
     * 1
     * Explanation For Sample Input 1:
     * In the first test case,
     * The distinct pairs having difference equal to 3 are (2, 5) and (3, 6)
     *
     * In the second test case,
     * The distinct pairs having a difference equal to 1 is (1, 2)
     * Sample Input 2:
     * 3
     * 3 2
     * 2 6 4
     * 3 1
     * 1 2 4
     * 6 1
     * 1 2 3 4 5 6
     * Sample Output 2:
     * 2
     * 1
     * 5
     * Explanation For Sample Input 2:
     * In the first test case,
     * The distinct pairs having difference equal to 2 are (2, 4) and (4, 6)
     *
     * In the second test case,
     * The distinct pairs having a difference equal to 1 is (1, 2)
     *
     * In the third test case,
     * The distinct pairs having difference equal to 1 are (1, 2), (2, 3), (3, 4), (4, 5) and (5, 6)
     */
    public static void main(String[] args) {
         ArrayList<Integer> arr=new ArrayList<>();
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             int a=sc.nextInt();
             arr.add(a);
         }
        System.out.println(kDiffPairs(arr,n,k));

    }
        public static int kDiffPairs(ArrayList < Integer > arr, int n, int k) {
            // Write your code here.

            Comparator<Integer> ob=(o1,o2)->(o1<o2)?-1:1;
            Collections.sort(arr,ob);
               System.out.println(arr);

            int i=0;
            int j=1;
            if(arr.contains(arr.get(i)+k))
                j=arr.indexOf(arr.get(i)+k);
            int count=0;

            while(j<n && i<=j)
            {
                //   System.out.println(i+" "+j);
                if(i==j)
                    j++;
                if(j>=n)
                    return count;

                if(arr.get(i)+k==arr.get(j))
                {
                    i++;
                    j++;
                    count++;
                    while(j<n && arr.get(i)==arr.get(i-1) && arr.get(j)==arr.get(j-1))
                    {
                        i++;
                        j++;
                    }

                }
                else if(arr.get(i)+k<arr.get(j))
                {
                    i++;


                }
                else if(arr.get(i)+k>arr.get(j))
                {
                    j++;
                }
            }
            return count;
        }
    }