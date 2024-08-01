package String_1;

import java.util.*;

public class MinCharPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
            String st=sc.next();
            minCharForPalindrome(st);
        }

    }

    public static void minCharForPalindrome(String st)
    {
        int n=st.length();
        int i=0,j=n-1,count=0;

        while(i<j)
        {
            if(st.charAt(i)==st.charAt(j))
            {
                i++;
                j--;


            }
            else
            {

                count++;

                i=0;
                j=n-count-1;
            }
        }

        System.out.println(count);


    }



}
