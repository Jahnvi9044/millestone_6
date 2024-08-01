package TwoPointer;

import java.util.*;

public class LongestSSKDistChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here

        }

    }

    public static int getLengthofLongestSubstring(int k, String s) {
        // Write your code here.

        int n=s.length();
        int [] freq=new int[26];

        int i=0 , j=0 ,maxLen=0 , total=0 ;

        for(j=0;j<n;j++)
        {    int ind=s.charAt(j)-'a';
            if(freq[ind]==0)
                total++;
            freq[ind]++;

            if(total<=k) maxLen=Math.max(maxLen,j-i+1);
            else
            {
                while(total>k)
                {  ind=s.charAt(i)-'a';

                    freq[ind]--;

                    if(freq[ind]==0)
                        total--;

                    i++;

                }

            }

        }

        return maxLen;
    }
}
