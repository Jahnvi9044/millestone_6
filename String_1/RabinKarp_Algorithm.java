package String_1;

import java.util.*;

public class RabinKarp_Algorithm {


     static  long  M=(long)(1e9+7);

    public static long  add(long A,long  B)
    {
         long ans=(A%M+B%M)%M;
         return ans;

    }
    public static long mul(long A,long B)
    {
//
        long ans=(A%M*B%M)%M;
        return ans;
    }
    public static long sub(long A,long B)
    {


        long ans=(A%M-B%M+M)%M;

        return ans;
    }

    public static long expo(long a,long b)
    {
        long ans=1;
        while(b>0)
        {
            if((b&1)==1)//lsb==1 the multiply
                ans=(ans*a)%M;

            a=(a*a)%M;
            b=b>>1;
        }
        return ans%M ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            String text=sc.next();
            String pattern=sc.next();
            System.out.println(stringMatch(text,pattern));

//            int a=2000000008;
//            int b=2000000008;
//            System.out.println(add(a,b));
//            System.out.println(expo(a,b));
//            System.out.println(sub(a,b));
//            System.out.println(mul(a,b));
        }

    }

    public static List< Integer > stringMatch(String text, String pattern){
        // Write your code here.
        int pn=pattern.length();
        int tn=text.length();
        List<Integer> ans= new ArrayList<>();
        long HashVal=0;
        int j=0;
        char ch;
        int d;
        for(int i=pn-1;i>=0;i--)
        {   ch=pattern.charAt(i);
            d=(int)ch-96;
             HashVal = add( HashVal%M,mul(d,expo(31,j))%M);
            j++;

        }
        long u=expo(31,pn-1)%M;
         j=1;
         long val=0;
        for(int i=pn-2;i>=0;i--)
        {   ch=text.charAt(i);
            d=(int)ch-96;
            val= add(val,mul(d,expo(31,j))%M)%M;
            j++;
        }
//        System.out.println("HashValue:"+HashVal);
//        System.out.println("Value:"+val);
        for(j=pn-1;j<tn;j++ )
        {   ch=text.charAt(j);
            d=(int)ch-96;
            val=add(val,d)%M;


//            System.out.println("HashValue:"+HashVal);
//            System.out.println("Value:"+val);

            if(HashVal==val)
              ans.add(j-pn+2);

            ch=text.charAt(j-pn+1);
            d=(int)ch-96;
            val=sub(val,mul(d,u)%M)%M;
            val=mul(val,31)%M;


        }

        return ans ;

    }



}
