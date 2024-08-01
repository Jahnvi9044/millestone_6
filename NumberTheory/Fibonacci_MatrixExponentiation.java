package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fibonacci_MatrixExponentiation  {



    static int M =1_000_000_000+7;
    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()) ;
        while ( t-- > 0 )
        {
            int n = Integer.parseInt(br.readLine());

            int[][] T   = new int[2][2];
            int[][] res = new int[2][2];

            T[0][0] = T[0][1] = T[1][0] = 1;
            T[1][1] = 0;

            res[0][0] = res[1][1] = 1 ;
            res[0][1] = res[1][0] = 0 ;


            System.out.println("Initial");

//            for(int i=0;i<2;i++)
//            {
//                for(int j=0;j<2;j++){
//                    System.out.print(T[i][j]+" ");
//                }
//                System.out.println();
//            }

//            for(int i=0;i<2;i++)
//            {
//                for(int j=0;j<2;j++){
//                    System.out.print(res[i][j]+" ");
//                }
//                System.out.println();
//            }

            int p = n-2;


            while(p>0)
            {
                if(p%2==1)
                {
                    prod(res,T,2);
                    p--;
                }

                p/=2;
                prod( T , T,2);
            }


            System.out.println("result");

//            for(int i=0;i<2;i++)
//            {
//                for(int j=0;j<2;j++){
//                    System.out.print(T[i][j]+" ");
//                }
//                System.out.println();
//            }


//            for(int i=0;i<2;i++)
//            {
//                for(int j=0;j<2;j++){
//                    System.out.print(res[i][j]+" ");
//                }
//                System.out.println();
//            }

            long fibo_n = res[0][0] + res[0][1];
            System.out.println( fibo_n );



        }

    }


    public static void prod(int [][] A ,int [][] B ,int n){

          int[][] temp = new int[2][2];

          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                  for(int k=0;k<n;k++)
                  {
                      temp[i][j] = (temp[i][j] + (A[i][k]%M * B[k][j]%M ) % M ) % M ;
                  }
              }
          }

           A[0][0] = temp[0][0];
           A[0][1] = temp[0][1];
           A[1][0] = temp[1][0];
           A[1][1] = temp[1][1];




    }
}
