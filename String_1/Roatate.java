package String_1;

import java.util.*;


/*
Longest Common Prefix After Rotation
Send Feedback
You are given two strings 'A' and 'B' where string 'A' is fixed. But you can perform left shift operations on string B any number of times.
Your task is to find out the minimum number of left-shift operations required in order to obtain the longest common prefix of string 'A' and 'B'.
Note:
Left shift is defined as a single circular rotation on the string after which the first character becomes the last character and all other characters are shifted one index to the left.
For Example:
If A = “an”, B = “can”.
After performing one left shift operation, string B becomes “anc”.
After performing two left shift operations, string B becomes “nca”.
Follow Up:
Can you solve this in linear time and space complexity?
Input format:
The first line contains an integer 'T' which denotes the number of test cases or queries to be run.
Then, the T test cases follow.

The first line of each test case contains the string A.

The second line of each test case contains the string B.
Output format:
For each test case, print the minimum number of left shift operations required in order to obtain the longest common prefix of string A and B.
Note:
You do not need to print anything. It has already been taken care of. Just implement the given function.
Constraints:
1 <= T <= 100
1 <= |A|, |B| <= 5 * 10^4
Where |A| and |B| denote the length of string, A and B respectively.

All the characters of the string A and B contain lowercase English letters only.

Time limit: 1 second

Sample Input 1:
2
on
soon
an
an

Sample Output 1:
2
0
Explanation for sample 1:
For the first test case, the common prefix of A and B is .””
After one left shift, the string B becomes “oons”, now the common prefix is “o”.
After two left shifts, the string B becomes “onso”, now the common prefix is “on”.
After three left shifts, the string B becomes “nsoo”, now the common prefix is “”.
(We do not need to perform one more left shift, because if the number of left-shift operations is equal to the length of the string, then we get the original string. For example, here if we perform one more shift, then we get the string “soon” which was the original string.)
So after two left shifts, we get the longest common prefix i.e. “on”. Hence, the answer is 2.

For the second test case, the common prefix of A and B is “an”.
After one left shift, the string B becomes “na”, now the common prefix is “”.
So we get the longest common prefix without performing any shifts. Hence, the answer is 0.
Sample Input 2:
2
abc
def
sorry
personal
Sample output 2:
0
3
Explanation for sample 2:
For the first test case, the common prefix of A and B is “”.
After one left shift, the string B becomes “efd”, now the common prefix is again “”.
After two left shifts, the string B becomes “fde”, now the common prefix is again “”.
Here the length of the longest common prefix is 0, as there is no common prefix in all the cases. So we get the longest common prefix without performing any shifts. Hence, the answer is 0.
For the second test case, the common prefix of A and B is “”.
After one left shift, the string B becomes “ersonalp”, now the common prefix is “”.
After two left shifts, the string B becomes “rsonalpe”, now the common prefix is “”.
After three left shifts, the string B becomes “sonalper”, now the common prefix is “so”.
After four left shifts, the string B becomes “onalpers”, now the common prefix is “”.
After five left shifts, the string B becomes “nalperso”, now the common prefix is “”.
After six left shifts, the string B becomes “alperson”, now the common prefix is “”.
After seven left shifts, the string B becomes “lpersona”, now the common prefix is “”.

So after three left shifts, we get the longest common prefix i.e. “so”. Hence, the answer is 3.
 */
public class Roatate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {

            String Pattern=sc.next();
            String text  =sc.next();

            System.out.println(minimumRequiredShifts(Pattern,text));


        }

    }

    public static int minimumRequiredShifts(String pattern, String text) {

        int pn=pattern.length();
        int tn=text.length();

        int[]lps=createLpsArray(pn,pattern);
//        System.out.println(
//                Arrays.toString(lps));

        int j=0;
        int rot=0;
        int f_rot=0;
        int val=0;
        int fval=0;
        for(int i=0;i<tn;i++)
        {
            if(j==0 && pattern.charAt(j)!=text.charAt(i))
                continue;
            while(j>0 && pattern.charAt(j)!=text.charAt(i))
            {

                j=lps[j-1];
            }
            if(pattern.charAt(j)==text.charAt(i))
            {   val=j+1;
                rot=i-j;
//                System.out.println("val="+val+" fval = "+fval);
                if(val>fval) {
                    f_rot = rot;
                    fval=val;
                }
//                System.out.println("fval="+fval+" val= "+val);
                j++;
            }
            if(j>=pn)
                break;
        }

        return f_rot;
    }


    public static int[] createLpsArray(int pn, String pattern)
    {   int[] lps=new int[pn];
        int i=0;
        for(int j=1;j<pn;j++)
        {
            while(i>0 && pattern.charAt(i)!=pattern.charAt(j))
                i=lps[i-1];
            if(pattern.charAt(i)==pattern.charAt(j))
                i++;
            lps[j]=i;


        }
        return lps;
    }
}
