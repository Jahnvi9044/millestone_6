package NumberTheory;
import java.io.*;

import java.util.*;

public class SegmentedSeive {
    public static void main(String[] args)throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0)
        {
             int L=Integer.parseInt(br.readLine());
             int R=Integer.parseInt(br.readLine());



            int N=100;
            int[] seive=new int [N+1];
             genarateseive(seive,N);

            //Step1: Generate all primes till Math.sqrt(R)
            ArrayList<Integer> primes=new ArrayList<>();
            for(int i=2;i<Math.sqrt(R);i++)
            {
                if(seive[i]==0)
                    primes.add(i);
            }
//            System.out.println(Arrays.toString(seive));
//            System.out.println(primes);


            //Step2:create a dummy array of R-L+1
            int [] arr=new int[R-L+1];

            //Step3:Mark all multiples of primes
            for(int i:primes)
            {  int firstMultiple= (L/i) *i ;
                if(firstMultiple<L)
                    firstMultiple+=i;
                for(int j=Math.max(firstMultiple,i*i);j<=R;j+=i)
                {

                    arr[j-L]=1;
                }

            }
            //Step3:Print the result
            for(int i=0;i<R-L+1;i++)
            {  if(arr[i]==0)
                    System.out.print((i+L)+" ");
            System.out.print(arr[i]+" ");}
        }

    }
    public static void genarateseive(int[] arr,int n)
    {

        for(int i=2;i*i<n;i++)
        {    if(arr[i]==0)
            for(int j=i*i;j<n;j+=i)
            {   arr[j]=1;

            }
        }

    }

}
