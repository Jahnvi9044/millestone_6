import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class RoundDanceCodeForces2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        init();
       int  n2=n/2;
       long groups=(C(n,n2)/2)  ;
       long ans=groups*fact[n2-1];
        ans=ans*fact[n2-1];
        System.out.println(ans);


    }


    static long[] fact = new long[100001];
    static long[] invFact = new long[100001];
    static final int M = 1000000000+7;

    static long C(int n , int r){

        if(r > n) return 0;

        long res = (fact[n] * invFact[r]) % M;
        res = (res * invFact[n - r]) % M;

        return res;
    }

    static long power(long a , long n){
        long res = 1;

        while(n > 0){
            if(n % 2 == 1){
                res = (res * a) % M;
                n--;
            }

            n = n / 2;
            a = (a * a) % M;
        }

        return res;
    }

    static void init(){
        fact[0] = invFact[0] = 1;

        for(int i=1;i<=100000;i++){
            fact[i] = (fact[i-1] * i) % M;
            invFact[i] = power(fact[i] ,M - 2);
        }
    }



}
