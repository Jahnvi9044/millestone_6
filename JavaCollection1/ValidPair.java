package JavaCollection1;

import java.util.*;

public class ValidPair {


    //PROBLEM
/**    Given an array of integers and numbers k and m, write a function that returns true if given array can be divided into pairs such that the sum of every pair gives remainder m when divided by k.
//    Input format :
//    Line 1 : Integer N
//    Line 2 : N integers separated be a single space
//    Line 3 : Integer K
//    Line 4 : Integer M
//    Output Format :
//    Boolean
//    Constraints :
//            1 <= N <= 10^4
//            1 <= M < K <= 10^2
//    Sample Input :
//            4
//            2 1 5 7
//            9
//            3
//    Sample Output :
//            true
//    Explanation :
     Pairs will be (2,1) and (5,7)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            //TESTCASE 1 !
           int[] arr={2,1,5,7};
           int k=9;
           int m=3;
            System.out.println(CheckSumPairs(arr,arr.length,k,m));

            //TESTCASE 2 !
            int[] arr2= {3,4,5,11};
            k=3;
            m=2;
            System.out.println(CheckSumPairs(arr2,arr2.length,k,m));
        }

    }

    public static boolean CheckSumPairs(int[] arr, int n, int k, int m) {

        if((n&1)==1) return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {   arr[i]=arr[i]%k;
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);

        }

        Iterator<Integer> it=map.keySet().iterator();
        while(it.hasNext())
        {
            int rem=it.next();

            if(rem*2==m)
            {   //if rem+rem==m
                if(map.get(rem)%2==1)
                    return false;

            }
            else
            {//check if m-rem element is present
                if(map.containsKey(m-rem))
                    if(map.get(m-rem)!=map.get(rem))
                        return false;
            }

        }

        return true;
    }
    //this problem has to be done in less then or at O(n log n )
    /**
     * Problem is done in O(n) TIME-COMPLEXITY
     */
}
