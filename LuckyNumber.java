import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            long n=sc.nextLong();
            int count11=0;

            if(n>77774444 )
            {
                System.out.println(4444477777L);
                return;
            }
             if(n>777444  &&  n<44447777)
            {

                System.out.println(44447777);
                return ;

             }
           if(n>7744 && n<444777)
           {
            System.out.println(444777);
            return ;
           }
          if(n>74 && n<4477)
           {
            System.out.println(4477);
            return ;
          }

            for(long i=n;i>0;i/=10)
             {count11++;
             }
             long chkNo=n;
             if(count11%2==1)
                 chkNo=(long)Math.pow(10,count11) * 4;
//        System.out.println(chkNo);
            for(long i=chkNo;i<=4444477777L;i++)
            {
                //if it is a super lucky number
                int count4=0,count7=0,count=0;
                for(long j=i;j>0;j/=10)
                {
                    int d=(int)(j%10);
                    if(d==4)
                        count4++;
                    else if(d==7)
                        count7++;
                    count++;
                }
                if(count==count4+count7 && count4==count7)
                {
                    System.out.println(i);
                    break;
                }

            }

        }

    }

