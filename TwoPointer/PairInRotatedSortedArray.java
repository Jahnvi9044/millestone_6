package TwoPointer;

import java.util.*;
//codingNinjas extraPRoblem

/**
 * Problem statement
 * Alice and Bob always loved to play with arrays. Alice took a sorted array and rotated it clockwise for a certain number of times.
 *
 * For example:
 * Alice took a sorted array = [4,6,8,10,11] and if she rotates it by 3, then the array becomes: [8, 10, 11, 4, 6].
 * After rotating a sorted array, Alice gave a number ‘K’ to Bob and asked him to search for a pair in an array whose sum is equal to K. Since Bob was busy preparing for his semester exams, he asked you to help him.
 *
 * You are given an array of integers ARR and a number K. Your task is to find out whether there exists a pair in the array ARR with sum K or not. If there exists a pair then you can return TRUE else return FALSE;
 *
 * Detailed explanation ( Input/output format, Notes, Images )
 * Sample Input 1:
 * 3
 * 5 4
 * 5 7 9 1 3
 * 4 2
 * 8 10 11 1
 * 6 -7
 * -3 3 6 -5 -4 1
 * Sample Output 1
 * YES
 * NO
 * YES
 * Explanation For Sample Output 1:
 * For the first array [5,7,9,1,3] there exists a pair (1,3) whose sum is equal to 4.
 *
 * For the second array, there exists no pair whose sum is equal to 2.
 *
 * For the third array, there exists a pair (-3,-4) whose sum is equal to -7.
 * Sample Input 2:
 * 3
 * 6 -10
 * 3 4 5 6 1 2
 * 2 0
 * 10 -10
 * 4 -20
 * 5 6 7 1
 * Sample Output 2:
 * NO
 * YES
 * NO
 */
public class PairInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
           int n=sc.nextInt();
           int k=sc.nextInt();
           int[] arr=new int[n];
           for(int i=0;i<n;i++)
              arr[i]=sc.nextInt();
            System.out.println(findPairSum(arr,k));
        }

    }


    public static boolean findPairSum(int[] arr, int target)
    {
        // Write your code here
        int n=arr.length;
        int i=0;
        int j=0;
        int r=0;
        System.out.println(r+" "+i+" "+j);
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            { r=i+1;
                break;}

        }

        i=r;
        j=r-1;
        if(r==0)
            j=n-1;

        System.out.println(r+" "+i+" "+j);

//        if()
        for(int k=0;k<n;k++)
        {  System.out.println(r+" "+i+" "+j);

            if(i==j)
                break;
            else if(arr[i]+arr[j]<target)
            {
                i=((i+1)%n);
            }
            else if(arr[i]+arr[j]>target)
            {

                if(j==0)
                    j=n-1;
                else j--;

            }

            else if(arr[i]+arr[j]==target)
                return true;
        }

        return false;

    }


    public static int kDiffPairs(ArrayList < Integer > arr, int n, int k) {
        // Write your code here.
        Comparator<Integer> ob=(o1,o2)->(o1<o2)?1:-1;
        Collections.sort(arr,ob);
        System.out.println(arr);
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.contains(i-k) && i>=0 )
            {
                arr.set(i,-1000000007);
                int j=arr.indexOf(i-k);
                arr.set(j,-1000000007);
                count++;
            }
        }
        return count;

    }
}

