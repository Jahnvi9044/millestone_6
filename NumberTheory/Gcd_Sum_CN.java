package NumberTheory;

import java.util.*;

public class Gcd_Sum_CN {



        static final int N = 1000000;
        static int[] phi = new int[N+1];

        static void preprocess(){

            for(int i=1;i<=N;i++) phi[i] = i;

            for(int i=2;i<=N;i++)
                if(phi[i] == i){
                    for(int j=i;j<=N;j+=i){
                        phi[j] = phi[j] / i;
                        phi[j] = phi[j] * (i - 1);
                    }
                }
        }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {    preprocess();


                int n=sc.nextInt();
                int res=gcd_Sum(n);
                System.out.println(res);


            }
        }

        public static int gcd_Sum( int n ){

            int res=0;
            for(int i=1;i*i<=n;i++)
            {
                if(n%i==0)
                {   int d1=i;
                    int d2=n/i;
                    System.out.println(i+" ... "+phi[d1]);
                    res = res + phi[n/d1]*d1;

                    if(d2*d2!=n)  //to eliminate the case of square as for 16 =4*4  , 4 is already calculated
                    {               // ,d1=4 ,d2=4 so why to calculate it again ,and again it will give error
                        System.out.println(i + " ... " + phi[d2]);
                        res = res + phi[n / d2] * d2;
                    }

                }
            }

            System.out.println("Gcd sum till "+n+" = "+ res);
            return res;
        }
    }
