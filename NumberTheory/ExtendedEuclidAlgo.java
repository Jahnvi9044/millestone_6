package NumberTheory;

import java.util.*;
import java.io.*;

public class ExtendedEuclidAlgo {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-->0)
        {
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=Integer.parseInt(br.readLine());
            Int x=new Int();
            Int y=new Int();
            int g=extendedEuclid(a,b,x,y);//gcd
            if(c%g==0)
            {
                x.val = (x.val * c) / g;
                y.val = (y.val * c) / g;

                System.out.println(x.val + " " + y.val + " " + g);
            }
            else
                System.out.println(" Solution does not exist ");
        }

    }

    public static int extendedEuclid(int a,int b,Int x,Int y)
    {
        if(b==0)
        {
            x.val=1;
            y.val=0;
            return a;
        }

        Int x1=new Int();
        Int y1=new Int();


        int gcd=extendedEuclid(b,a%b,x1,y1);

        x.val= y1.val;
        y.val=x1.val-(a/b)*y1.val;

        return gcd;
    }
}
class Int{
    int val;
}