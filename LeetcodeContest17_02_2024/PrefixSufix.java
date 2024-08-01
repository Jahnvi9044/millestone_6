package LeetcodeContest17_02_2024;

import java.util.*;

public class PrefixSufix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here

           String [] words = {"a111111","aba","ababa","aa"};
           int n=words.length;
           int count=0;
           for(int i=0;i<n;i++)
           {
               for(int j=i+1;j<n;j++)
               {
                   if(prefixSuffix(words[i],words[j]))
                   {
                       count++;
                   }
               }
           }

            System.out.println(count);

        }

    }


    public static boolean prefixSuffix(String a, String b)
    {
        if(b.startsWith(a) && b.endsWith(a))
            return true;
        else return false;

    }
}
