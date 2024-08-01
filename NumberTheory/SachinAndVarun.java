package NumberTheory;

import java.util.*;
import java.io.*;


public class SachinAndVarun{
    public static void main(String[] args) throws IOException
    {


        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-->0)
        {
            String[] st=br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int d = Integer.parseInt(st[2]);

            Int x= new Int();
            Int y= new Int();

            int g = ExtendedEuclidAlgo(a,b,x,y);

            if( (d%g)==0 )
            {
                x.val= (x.val*d)/g ;
                y.val= (y.val*d)/g ;

                int l1 = (int)Math.ceil(-( x.val * g ) / b);
                int l2 =  (int)Math.floor( (y.val * g ) / b);


                int count = 0 ;
                if(l1==l2)
                    System.out.println(1);
                else if(l1>l2)
                    System.out.println(0);
                else
                    System.out.println(l2-l1+1);


            }
            else
                System.out.println("Solution does not exist");
        }

    }

    public static int ExtendedEuclidAlgo(int a, int b, Int x, Int y){

        if(b==0)
        {
            x.val=1;
            y.val=0;
            return a;
        }
        Int x1=new Int();
        Int y1=new Int();

            int g=ExtendedEuclidAlgo( b ,a%b , x1 , y1 );

            x.val = y1.val;
            y.val = x1.val-(a/b)*y1.val;

        return g;
    }
}
