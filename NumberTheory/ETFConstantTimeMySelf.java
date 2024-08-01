package NumberTheory;

import java.util.*;

public class ETFConstantTimeMySelf
{
//ETF Using Seive Algorithm

    static int N=1000000;
    static int[] phi = new int[N+1];

    public static void preprocesses()
    {
        for(int i=2;i<=N;i++)
           phi[i]=i;

        for(int i=2;i<=N;i++)
        {

            if(phi[i]==i)
            for(int j=i;j<=N;j+=i)
            {
                    phi[j]=(phi[j]*(i-1))/i;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {

            int n=sc.nextInt();
            preprocesses();
            System.out.println(phi[n]);


        }

    }
}
