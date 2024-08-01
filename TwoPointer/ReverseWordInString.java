package TwoPointer;

import java.util.*;
//
//codingNinjas
//
//C. Alice, Bob and Chocolate
//        time limit per test2 seconds
//        memory limit per test64 megabytes
//        inputstandard input
//        outputstandard output


//        Alice and Bob like games. And now they are ready to start a new game. They have placed
//        n chocolate bars in a line. Alice starts to eat chocolate bars one by one from left to
//        right, and Bob — from right to left. For each chocololate bar the time, needed
//        for the player to consume it, is known
//        (Alice and Bob eat them with equal speed).
//        When the player consumes a chocolate bar, he immediately starts with another.
//        It is not allowed to eat two chocolate bars at the same time, to leave the bar unfinished
//        and to make pauses. If both players start to eat the same bar simultaneously,
//        Bob leaves it to Alice as a true gentleman.
//
//        How many bars each of the players will consume?
//
//        Input
//        The first line contains one integer n (1≤n≤10^5) — the amount of bars on the table.
//        The second line contains a
//        sequence t1,t2,...,tn (1≤ti≤1000),
//        where ti is the time (in seconds) needed to consume the i-th bar (in the order from left to right).
//
//        Output
//        Print two numbers a and b, where a is the amount of bars consumed by Alice,
//        and b is the amount of bars consumed by Bob.
//
//        Examples
//        inputCopy
//        5
//        2 9 8 2 7
//        outputCopy
//        2 3



public class ReverseWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {//Write your code here

            String st=sc.nextLine();
            System.out.println(st.trim());
            System.out.println(reverse(st.trim()));

        }

    }


    public static String reverse(String st){
        st=st.trim();
        st=st+" /";
        int n=st.length();
        String word="";
        String s1="";
        for(int i=0;i<n;i++)
        {
            char ch=st.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
                continue;
            }
            else{
               while(ch==' ')
              {
                i++;

                ch=st.charAt(i);

               }
                s1=word+" "+s1;
                word="";
                i--;

            }


        }


        return s1;
    }
}
