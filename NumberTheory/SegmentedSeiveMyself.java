package NumberTheory;

import java.util.*;

public class SegmentedSeiveMyself {

    static int[]  prim = new int[1000000];

    public static void Seive(int n){
        //O(nlog(logn))
        prim[0]=1;
        prim[1]=1;//1 is not a prime no
        for(int i=2;i*i<=n;i++)
        {
            if(prim[i]!=1)
            for(int j=i*i;j<=n;j+=i)
            {

                prim[j]=1;

            }
        }
    }


    public static void SegmentedSeive(int l, int r,ArrayList<Integer> isPrime) {

        int[] segment=new int[r-l+1];



            for(int p:isPrime)
            {
                int s=(l/p)*p;

                if(l%p!=0)
                    s+=p;

                for (int j = s; j <= r; j+=p) {
                  segment[j-l]=1;

                }
            }



        for(int i=l;i<=r;i++)
        {
            if(segment[i-l]==0)
                System.out.print(i+" ");
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            ArrayList<Integer> isPrime =new ArrayList<>();
             int l=sc.nextInt();
             int r=sc.nextInt();
             Seive((int)Math.sqrt(r));
            for(int i=1;i*i<=r;i++) {
                if (prim[i] == 0) {
                    System.out.print(i + " ");
                    isPrime.add(i);

                }
            }
            System.out.println();
           SegmentedSeive(l,r,isPrime);

        }

    }
}
//