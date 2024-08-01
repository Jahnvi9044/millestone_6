package NumberTheory;

import java.util.*;

public class extendedEuclidianAlgoMyself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
                int a ,b,c;
                int g;
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();

                Int x=new Int();
                Int y=new Int();

                g=EuclidSolution(x,y,a,b);
                if(c%g!=0)
                    System.out.println("Solution Does Not Exist");
                else
                {
                    x.val=(x.val*c)/g;
                    y.val=(y.val*c)/g;
                    System.out.println(x.val+" "+y.val);
                }
        }
    }

    public static int  EuclidSolution(Int x, Int y, int a, int b)
    {
        if(b==0)
        {
            x.val=1;
            y.val=0;
           return a;
        }
        Int x1= new Int();
        Int y1= new Int();

     int gcd=  EuclidSolution(x1,y1,b,a%b);
        x.val=y1.val;
        y.val=x1.val-(a/b)*y1.val;
        return gcd ;

    }
}

