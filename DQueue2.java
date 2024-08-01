import java.util.*;

public class DQueue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =1;
        while (t-- > 0) {//Write your code here

            int n=sc.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }
            Arrays.sort(a);
             int sum=0,count=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]>=sum) {
                    count++;
                    sum+=a[i];
                }


            }

            System.out.println(count);




        }

    }
}
