import java.util.*;

import java.lang.*;

public class Eko_Eko
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int need= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println(cal(arr,n,need));

    }
    public static int cal(int[] arr, int n, int need)
    {int low=0, high=arr[0];
        for(int i=1;i<n;i++)
        {
            if(high<arr[i])
                high=arr[i];
        }
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(sum(arr,mid,n)>need)
                low=mid+1;
            else
                high=mid-1;

        }
        return low;

    }

    public static  int  sum(int [] arr, int mid,int n)
{
    int s=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<=mid)
            continue;
        s=s+arr[i]-mid;
    }

    return s;
}

}