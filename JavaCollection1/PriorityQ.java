package JavaCollection1;

import java.util.*;

class PriorityQ {
    public static void main(String[] args) {

/**    Declaration 1 */
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11, 21, 13, 24, 15));
        PriorityQueue<Integer> p = new PriorityQueue<>(arr);

/**    Declaration 2 */

//        using array

         PriorityQueue<Integer> p1=new PriorityQueue<>();
         Collections.addAll(p1,12,34,35,9,10);
//         the elements that are added in the parameter need to be array or individual elements
//        Collections like ArrayList , LinkedList ---- and so on .. are not allowed




//      In case you need to add Collection only , follow the Declaration 3

/**    Declaration 3 */


        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(11, 21, 13, 24, 15));
        PriorityQueue<Integer> p2=new PriorityQueue<>();
        p2.addAll(arr1);

 /**    Declaration 4 */

//        using array

        PriorityQueue<Integer> p3=new PriorityQueue<>();
        int[] arr5={1,2,3,4};
//        Collections.addAll(p1,arr5);

//          this will give incompatible error
//        to avoid that use loop , to add elements to the pq
//        and trust me Arrays.asList().. ye sab kuch kam nhi karega
        for(int i=0;i<arr5.length;i++ )
        {
            p3.add(arr5[i]);

        }
    }

    long minCost(long arr[], int n)
    {
        // your code here


          PriorityQueue<Long> pq=new PriorityQueue<>();
//        Collections.addAll(pq,arr);

        for(int i=0;i<n;i++ )
        {
            pq.add(arr[i]);

        }


        long cost=0;

        while(pq.size()!=1)
        {

            long a=pq.poll()+pq.poll();
            pq.add(a);
            cost+=a;

        }

        cost+=pq.poll();

        return cost ;

    }
}
