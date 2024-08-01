package LeetcodeContest17_02_2024;

import java.util.*;
//Apply Operations to make String Empty
public class MakeStringEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here


            String s="aabcbbcaddd";
             LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

             for(int i=s.length()-1;i>=0;i--)
             {
                 map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

             }

            System.out.println(map);
              int[] freq=new int[26];

              for(char ch:s.toCharArray())
              {
                  freq[ch-'a']++;
              }
//            System.out.println(Arrays.toString(freq));

              int max=0;
              for(int i=0;i<26;i++)
              {
                  max=Math.max(freq[i],max);

              }
            System.out.println(max);

             String ans="";
             for(Map.Entry<Character,Integer> e: map.entrySet())
             {
                 int val=e.getValue();
                 if(val==max)
                     ans=e.getKey()+ans;


             }
            System.out.println(ans);

//              for(int i=0;i<26;i++)
//              {
//                  if(freq[i]<max)
//                  {
////                      System.out.println((char)(i+97)+"");
//                        s = s.replaceAll((char)(i+97)+"","");
////                      System.out.println(s+" "+(char)(i+97));
//                  }

//                  else
//                  {
//                      for(int j=0;j<max-1;j++)
//                      {
//                         s = s.replaceFirst((char)(i+97)+"","");
//                      }
//                  }

//              }


//            System.out.println(s);



        }

    }
}










//String s="aabcbbca";
//
//              int[] freq=new int[26];
//
//              for(char ch:s.toCharArray())
//              {
//                  freq[ch-'a']++;
//              }
////            System.out.println(Arrays.toString(freq));
//
//              int max=0;
//              for(int i=0;i<26;i++)
//              {
//                  max=Math.max(freq[i],max);
//
//              }
////            System.out.println(max);
//
//
//              for(int i=0;i<26;i++)
//              {
//                  if(freq[i]<max)
//                  {
////                      System.out.println((char)(i+97)+"");
//                     s = s.replaceAll((char)(i+97)+"","");
////                      System.out.println(s+" "+(char)(i+97));
//                  }
//
//                  else
//                  {
//                      for(int j=0;j<max-1;j++)
//                      {
//                         s = s.replaceFirst((char)(i+97)+"","");
//                      }
//                  }
//
//              }
//
//
//            System.out.println(s);
//
//
//
//        }
//
//    }
//}