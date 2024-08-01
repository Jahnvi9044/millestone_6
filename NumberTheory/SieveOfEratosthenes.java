package NumberTheory;

import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
            int n=sc.nextInt();
            System.out.println(primeNumbersTillN(n));
        }

    }




        public static ArrayList<Integer> primeNumbersTillN(int N)
        {
            int[] arr=new int[N+1];
             arr[1]=1;//1 is a prime no
            for(int i=2;i*i<=N;i++)
            {   if(arr[i]==0)
                for(int j=i*i;j<=N;j+=i)
                {

                    arr[j]=1;
                }
            }
            ArrayList<Integer> list=new ArrayList<Integer>();


            for(int k=2;k<(N+1);k++)
            {   if(arr[k]==0)
                list.add(k);

            }
            return list;
        }



    }


