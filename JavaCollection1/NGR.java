package JavaCollection1;

import java.util.*;

public class NGR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here

            System.out.println(nextGreaterElement(new ArrayList<>(Arrays.asList(3,8 ,1,2,0))));

        }

    }


        public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> input) {
            // Write your code here
            ArrayList<Integer> ans =  new ArrayList<>();

            Stack<Integer> s=new Stack<Integer>();

            for(int i=input.size()-1;i>=0;i--)
            {

                if(s.isEmpty())
                {
                    ans.add(0,-1);

                }


                else if(s.size()>0 && s.peek()>input.get(i))
                {
                    ans.add(0,s.peek());
                }


                else if(s.size()>0 && s.peek()<=input.get(i))
                {

                    while(!s.isEmpty()  &&  s.peek()<=input.get(i) )
                        s.pop();

                    if(s.isEmpty())
                        ans.add(0,-1);

                    else
                    {
                        ans.add(0,s.peek());
                    }

                }
                s.push(input.get(i));
            }
            return ans;
        }
    }

