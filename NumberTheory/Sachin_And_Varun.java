package NumberTheory;


import java.io.*;

public class Sachin_And_Varun {
    public static void main(String[] args) throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0)
        {

            String[] st=br.readLine().split(" ");
            int a=Integer.parseInt(st[0]);
            int b=Integer.parseInt(st[1]);
            int d=Integer.parseInt(st[2]);
            Int x=new Int();
            Int y=new Int();
            int  g=ExtendedEuclid(a,b,x,y);
            double gcd=g;
            if(d%g!=0)
            {
                System.out.println("Solution Not Possible");

            }
            else
            {
                x.val=(x.val*d)/g;
                y.val=(y.val*d)/g;
//                System.out.println(x.val+" "+y.val);
                int l1=(int)Math.ceil((-1*x.val*gcd)/b);
                int l2=(int)Math.floor((y.val*gcd)/a);

//                System.out.println("l1="+l1+" l2= "+l2);
                int count=0;


                if(l1>l2)
                    count=0;
                else if(l1==l2)
                    count=1;
                else
                    count=(l2-l1)+1 ;

                System.out.println(count);

/**
 * The code written below is for the various solutions but as here  we justa have to print the no of ways we will not write
 * all the answers
 * So therefor just printed the count
 *
 */
//                int x0,y0;
//                while(k>=l1 && k<=l2)
//                {
//
//                    x0=x.val+k*(b/g);
//                    y0=y.val-k*(a/g);
//
////                    System.out.println(x0+" "+y0);
//                    count++;
//                    k++;
//                }


            }


        }

    }


    public static int ExtendedEuclid(int a ,int b ,Int x,Int y)
    {
        if(b==0)
        {
            x.val=1;
            y.val=0;
            return a;

        }

        Int x1=new Int();
        Int y1=new Int();
        int gcd=ExtendedEuclid(b,a%b,x1,y1);
        x.val=y1.val;
        y.val=x1.val-(a/b)*y1.val;

       return gcd;
    }

}