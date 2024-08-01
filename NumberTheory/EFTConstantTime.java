package NumberTheory;

import java.util.*;

public class EFTConstantTime {


        static final int N = 1_000_000;
        static int[] phi = new int[N+1];

        static void preprocess(){

            for(int i=1;i<=N;i++)
                phi[i] = i;

            for(int i=2;i<=N;i++)
                if(phi[i] == i){
                    for(int j=i;j<=N;j+=i){
                        phi[j] = phi[j] / i;
                        phi[j] = phi[j] * (i - 1);
                    }
                }
        }

        public static void main(String[] args) {
            int t , n;

            Scanner scanner = new Scanner(System.in);
            t = scanner.nextInt();

            preprocess();

            while(t-- > 0){
                n = scanner.nextInt();

                System.out.println(phi[n]);
            }
        }
    }





