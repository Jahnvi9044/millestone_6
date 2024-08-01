package String_1;

import java.util.*;

public class KMP_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here

            String text=sc.next();
            String pattern=sc.next();
            KmpAlgo(text,pattern);
            int ch= text.indexOf('a',2);

        }

    }

    public static void KmpAlgo(String text, String pattern ) {
        int pn = pattern.length();
        int tn = text.length();
        int[] lps = createLpsArray(pn, pattern);

        System.out.println("Lps Array"+Arrays.toString(lps));

        int j=0;
        for(int i=0;i<tn;i++)
        {
            if(j==0 && pattern.charAt(j)!=text.charAt(i)) {
                continue;
            }
            while(j>0 && pattern.charAt(j)!=text.charAt(i))
                j=lps[j-1];
            if(pattern.charAt(j)==text.charAt(i))
                j++;
            if(j>=pn)
            {
                System.out.println(i-pn+1);
                j=0;
            }
//            System.out.println("j="+j+" i="+i);

        }


    }

    public static int[] createLpsArray(int pn, String pattern)
    {   int[] lps=new int[pn];
        int i=0;
        for(int j=1;j<pn;j++)
        {
            while(i>0 && pattern.charAt(i)!=pattern.charAt(j))
                i=lps[i-1];
            if(pattern.charAt(i)==pattern.charAt(j))
                i++;
            lps[j]=i;


        }
        return lps;
    }
}
