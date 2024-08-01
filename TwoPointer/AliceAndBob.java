package TwoPointer;

import java.util.*;
//codeforces Extra Problem
public class AliceAndBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();

         int i=0;
         int j=n-1;
         int i_left=arr[0],j_left=arr[n-1];
         while( i<=j && i<n && j>=0 )
         {
             if(i==j)
             {  if(j_left!=arr[j])
                 j--;
                 else
                 i++;
             }
             else if(i_left<j_left)
             {   j_left=j_left-i_left;
                 i++;
                 i_left=arr[i];
             }
             else if(i_left>j_left)
             {  i_left=i_left-j_left;
                 j--;
                j_left=arr[j];
             }
             else {
//
                 i++;
                 i_left=arr[i];

                 j--;
                 j_left=arr[j];
             }
         }
        System.out.println(i+" "+(n-1-j));

    }
}
