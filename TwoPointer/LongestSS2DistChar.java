package TwoPointer;

import java.util.*;
/**
 * Best CASE= aaaaaaaaaa
 * Worst CASE=abcabcabcabc
 *     with 3 different char at all places
 *

 */
public class LongestSS2DistChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {//Write your code here

          String st=sc.next();
            System.out.println(lengthOfLongestSubstring1(st));
        }

    }






    public static int lengthOfLongestSubstring(String s) {
        // Write your code here.
        int n=s.length();
        if(n==1||n==0)
            return n;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        while(  j<n  &&  i<n  && i<=j)
        {


            while(map.size()<=2 && j<n)
            {
                if (!map.containsKey(s.charAt(j)))
                    map.put(s.charAt(j), 1);
                else {
                    int k = map.get(s.charAt(j));
                    k++;
                    map.put(s.charAt(j), k);
                }

                j++;
            }
            if(map.size()>2)
            {

                //  System.out.println(s.substring(i,j));
//                System.out.println();

                maxLen=Math.max(maxLen,(j-1)-i);
                int k=map.get(s.charAt(i));
                k--;
                map.put(s.charAt(i),k);
                if(k<=0)
                    map.remove(s.charAt(i));
                i++;

            }


        }

        maxLen=Math.max(maxLen,j-i);

        return maxLen;
    }

    public static int lengthOfLongestSubstring1(String s)
    {
        int i=0;
        int j=0;
        int maxLen=0,total=0;
        int n=s.length();
        int[] freq=new int[26];

        for( j=0;j<n;j++)
        {
            if(freq[s.charAt(j)-'a']==0)
            {   total++;
                freq[s.charAt(j)-'a']++;
            }
           else  freq[s.charAt(j)-'a']++;
//            System.out.println(s.substring(i,j+1)+" "+i+" "+j);
            if(total<=2) maxLen=Math.max(maxLen,j-i+1);
            else{

                while( i<n && total>2)
                {
                    freq[s.charAt(i)-'a']--;
                    if(freq[s.charAt(i)-'a']==0)
                        total--;
                    i++;

                }

            }
        }



        return maxLen;


    }
}
