package NumberTheory;

import java.util.*;
import java.io.*;


public class MatrixExponentiation {

    static final int mod = 1000000000 + 7;

    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());

        long[][] A= new long[n][n];

        String[] st ;
        for(int i = 0 ; i<n;i++ )
        {

                st=br.readLine().split(" ");

            for(int j = 0 ; j < n ; j++)
            {
                A[i][j] = Integer.parseInt(st[j]);
            }

        }


        int pow = Integer.parseInt(br.readLine());

        power(A,pow);


    }


    public static void power(long[][] A,int  pow){
        int m=A.length;
        //res is an identity matrix
        long [][] res=new long [m][m] ;


        //lets declare it

        for( int i=0 ; i<m ; i++)
        {
            res[i][i]=1L;
        }


       while(pow>0)
       {
           if(pow%2==1)
           {
               product(res,A,m);
               pow--;

           }
           pow=pow/2;
           product(A,A,m);
       }

       System.out.println("Result: ");

       for(int i = 0; i< m ;i++)
       {
           for(int j =0 ;j<m; j++)
           {
               System.out.print( res[i][j]+" ");
           }
           System.out.println();

       }








    }

    public static void product(long[][] A , long [][] B  ,int m ){


        long [][] res=new long[m][m];


        for(int i = 0 ; i < m ; i++ )
        {
            for(int  j = 0 ;j < m ;j++)
            {
                for(int k=0;k<m;k++)
                {
                    res[i][j] = res[i][j] + A[i][k]*B[k][j] ;
                }
            }
        }


        for(int i =0 ;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                A[i][j]=res[i][j];
            }
        }




    }



}


//    static void prod(long[][] A, long[][] B, int m) {
//        long[][] temp = new long[m][m];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                temp[i][j] = 0;
//                for (int k = 0; k < m; k++) {
//                    temp[i][j] = (temp[i][j] + A[i][k] * B[k][j]) % mod;
//                }
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) A[i][j] = temp[i][j];
//        }
//    }
//
//    static void power(long[][] A, int m, int n) {
//        long[][] res = new long[m][m];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i == j) res[i][j] = 1;
//                else res[i][j] = 0;
//            }
//        }
//
//        while (n > 0) {
//            if (n % 2 == 1) {
//                prod(res, A, m);
//                n--;
//            }
//
//            n = n / 2;
//            prod(A, A, m);
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(res[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//    }
//
//    public static void main(String[] args) {
//        int t, n, m;
//
//        Scanner scanner = new Scanner(System.in);
//
//        t = scanner.nextInt();
//
//        while (t-- > 0) {
//            m = scanner.nextInt();
//            n = scanner.nextInt();
//
//            long[][] A = new long[m][m];
//
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < m; j++) {
//                    A[i][j] = scanner.nextInt();
//                }
//            }
//
//            power(A, m, n);
//        }
//    }
//
//}
