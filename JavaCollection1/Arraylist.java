package JavaCollection1;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
              ArrayList<Integer> arr=new ArrayList<>();
              arr.add(-1);
              arr.add(-1);
              arr.add(6);
              arr.add(8);
            System.out.println(arr);

            arr.remove((Integer)(-1));
            System.out.println(arr);
        }

    }
}
