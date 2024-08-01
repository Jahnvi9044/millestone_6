package LeetcodeContest17_02_2024;

import java.util.*;

public class NumsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here

            int n=sc.nextInt();

            int[]  nums=new int[n];
             int no=nums.length;
             n=no;
            for(int i=0;i<n;i++)
                nums[i]=sc.nextInt();

             int i=0;
             int max=0;
             if(n<2)
                 System.out.println(0);
             int a=nums[0]+nums[1];
             i+=2;
             int count=1;
             while(i<=n-2)
             {
                int b= nums[i]+nums[i+1];
                if(b==a)
                {
                    count++;
                    i+=2;
                    continue;
                }

                b=nums[n-1]+nums[n-2];
                if(b==n)
                {
                    count++;
                    n-=2;

                    continue;
                }
                b=nums[n-1]+nums[i];
                if(b==a)
                {
                    count++;
                    n--;
                    i++;
                    continue;
                }

                else break;

             }

            max=Math.max(max,count);



            i=0;
            n=no;
             a=nums[0]+nums[n-1];
            i++;
            n--;
             count=1;
            while(i<=n-2)
            {
                int b= nums[i]+nums[i+1];
                if(b==a)
                {
                    count++;
                    i+=2;
                    continue;
                }

                b=nums[n-1]+nums[n-2];
                if(b==n)
                {
                    count++;
                    n-=2;

                    continue;
                }
                b=nums[n-1]+nums[i];
                if(b==a)
                {
                    count++;
                    n--;
                    i++;
                    continue;
                }

                else break;

            }
            max=Math.max(max,count);



            i=0;
            n=no;
            a=nums[n-2]+nums[n-1];
            n-=2;
            count=1;
            while(i<=n-2)
            {
                int b= nums[i]+nums[i+1];
                if(b==a)
                {
                    count++;
                    i+=2;
                    continue;
                }

                b=nums[n-1]+nums[n-2];
                if(b==n)
                {
                    count++;
                    n-=2;

                    continue;
                }
                b=nums[n-1]+nums[i];
                if(b==a)
                {
                    count++;
                    n--;
                    i++;
                    continue;
                }

                else break;

            }
            max=Math.max(max,count);


            System.out.println(count);
        }

    }
}
