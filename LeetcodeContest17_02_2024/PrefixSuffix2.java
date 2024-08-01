package LeetcodeContest17_02_2024;

import java.math.BigInteger;
import java.util.*;

public class PrefixSuffix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
            int[] arr1 = {1,10,100};
            int[] arr2 = {1000};
              int len =0, max=0;
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr2.length;j++)
                {
                    len = prefixSuffixLen(Integer.toString(arr1[i]),Integer.toString(arr2[j]));

                    max=Math.max(max,len);

                }
            }
            System.out.println(len);



        }

    }

    public static int prefixSuffixLen(String a, String b)
    {
        int i=0;
       while(a.length()>i && b.length()>i && a.charAt(i)==b.charAt(i))
       {
           i++;

       }
       return i;
    }
}
