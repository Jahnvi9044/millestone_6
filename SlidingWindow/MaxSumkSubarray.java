package SlidingWindow;

import java.util.*;
//This Program Calculates the maximum sum subarray with length k;
public class MaxSumkSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextLong();


            long curr_total=0;
            long maxi=(long)-1e18;
            for(int i=0;i<n;i++)
            {
                if(i<k)
                  curr_total+=arr[i];
                if(i==k-1) maxi=Math.max(maxi,curr_total);
                else if(i>=k)
                {
                    curr_total-=arr[i-k];
                    curr_total+=arr[i];
                    maxi=Math.max(maxi,curr_total);
                }
            }
            System.out.println(maxi);

        }

    }
}
