package TwoPointer;

import java.util.*;
//codeforces ExtraProblem

/**
 * B. Heaters
 * time limit per test1 second
 * memory limit per test256 megabytes
 * inputstandard input
 * outputstandard output
 * Vova's house is an array consisting of n
 *  elements (yeah, this is the first problem, I think, where someone lives in the array).
 *  There are heaters in some positions of the array. The i
 * -th element of the array is 1
 *  if there is a heater in the position i
 * , otherwise the i
 * -th element of the array is 0
 * .
 *
 * Each heater has a value r
 *  (r
 *  is the same for all heaters). This value means that the heater at the position pos
 *  can warm up all the elements in range [pos−r+1;pos+r−1]
 * .
 *
 * Vova likes to walk through his house while he thinks, and he hates cold positions of his house.
 * Vova wants to switch some of his heaters on in such a way that each element of his house will be
 * warmed up by at least one heater.
 *
 * Vova's target is to warm up the whole house (all the elements of the array), i.e. if n=6
 * , r=2
 *  and heaters are at positions 2
 *  and 5
 * , then Vova can warm up the whole house if he switches all the heaters in the house on (then the first 3
 *  elements will be warmed up by the first heater and the last 3
 *  elements will be warmed up by the second heater).
 *
 * Initially, all the heaters are off.
 *
 * But from the other hand, Vova didn't like to pay much for the electricity. So he wants to switch
 * the minimum number of heaters on in such a way that each element of his house is warmed up by at least one heater.
 *
 * Your task is to find this number of heaters or say that it is impossible to warm up the whole house.
 *
 * Input
 * The first line of the input contains two integers n
 *  and r
 *  (1≤n,r≤1000
 * ) — the number of elements in the array and the value of heaters.
 *
 * The second line contains n
 *  integers a1,a2,…,an
 *  (0≤ai≤1
 * ) — the Vova's house description.
 *
 * Output
 * Print one integer — the minimum number of heaters needed to warm up the whole house or -1
 * if it is impossible to do it.
 *
 * Examples
 * inputCopy
 * 6 2
 * 0 1 1 0 0 1
 * outputCopy
 * 3
 * inputCopy
 * 5 3
 * 1 0 0 0 1
 * outputCopy
 * 2
 * inputCopy
 * 5 10
 * 0 0 0 0 0
 * outputCopy
 * -1
 * inputCopy
 * 10 3
 * 0 0 1 1 0 1 0 0 0 1
 * outputCopy
 * 3
 * Note
 * In the first example the heater at the position 2
 *  warms up elements [1;3]
 * , the heater at the position 3
 *  warms up elements [2,4]
 *  and the heater at the position 6
 *  warms up elements [5;6]
 *  so the answer is 3
 * .
 *
 * In the second example the heater at the position 1
 *  warms up elements [1;3]
 *  and the heater at the position 5
 *  warms up elements [3;5]
 *  so the answer is 2
 * .
 *
 * In the third example there are no heaters so the answer is -1.
 *
 * In the fourth example the heater at the position 3
 *  warms up elements [1;5]
 * , the heater at the position 6
 *  warms up elements [4;8]
 *  and the heater at the position 10
 *  warms up elements [8;10]
 *  so the answer is 3
 * .
 */
public class Heaters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {

            arr[i]=sc.nextInt();

        }

        if(n==1) {
            if (arr[0] == 1)
                System.out.println(1);
            else
                System.out.println(-1);
          return ;
        }
        int k=-1;
        int j=0;
        int count=0;
        boolean bool=false;

        while(k<n-1  )
        {
//            System.out.println(k+" "+j+" "+count);
            int g=k+r;
            bool=false;
              while(g>=k+1 && g>=0)
            {  if(g>=n)
                 g=n-1;
//                System.out.println("g= "+g);
                if(arr[g]==1)
                {
                    j=g;
                    count++;
                    bool=true;
                    k=j+r-1;
                    break;
                }

             g--;
//                System.out.println("g="+g);
//                System.out.println("g limit "+(k+r-1));

            }
            if(!bool)
            {  int z=k;
//                System.out.println("z= "+z);
                while(z>j && z>=0)
                {
                    if(arr[z]==1)
                    {
                        bool=true;
                        j=z;
                        count++;
                        k=j+r-1;
                        break;
                    }
                        z--;

                }

            }
            if(!bool) {
                System.out.println(-1);
                return;
            }



        }
        System.out.println(count);

    }
}
