import java.util.*;

public class PostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here


            String[] arr={"10","7","+"};
            String[] arr1={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
            System.out.println(evalRPN(arr1));
        }

    }



        public static int evalRPN(String[] tokens) {

            if(tokens.length==1)
                return Integer.parseInt(tokens[0]);
            ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
            int res=0;
            for(String st:tokens)
            {
                if(st=="+"||st=="-"||st=="*"||st=="/")
                {
                    int a=arr.removeLast();
                    int b=arr.removeLast();

                    if(st=="+")
                    {  res=a+b;

                    }
                    else  if(st=="-")
                    {  res=a-b;

                    }
                    else if(st=="*")
                    {  res=a*b;

                    }
                    else if(st=="/")
                    {  res=b/a;

                    }
                    System.out.println("a= "+a+" b= "+b+" "+res);
                    arr.addLast(res);
                }

                else
                {
                    arr.addLast(Integer.parseInt(st));

                }

            }



            return arr.removeLast();




    }
}
