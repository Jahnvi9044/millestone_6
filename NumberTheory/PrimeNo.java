package NumberTheory;
import java.io.*;
import java.util.*;

public class PrimeNo {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0)
        {    int count=0;
            int n=Integer.parseInt(br.readLine());
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0) {
                    count++;
                    break;
                }
            }
            if(count>0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");

        }

    }
}
