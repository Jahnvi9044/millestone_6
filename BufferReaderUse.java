import java.lang.reflect.Array;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderUse {

    /**
     *
     *
     * BufferedReader is much faster than Scanner class for IO operations and reduces time, even solved TLE at times.
     * taking input using BufferedReader class:
     *
     * 1) import the following header files:
     * 	import java.io.BufferedReader;
     * 	import java.io.IOException;
     * 	import java.io.InputStreamReader;
     *
     * 2) main function must throw IOException
     * 	public static void main(String[] args) throws IOException
     *
     * 3) Initialise BufferedReader object
     *
     * 	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     *
     * 	this is similar to -> Scanner scanner = new Scanner(System.in);
     *
     * 4) Taking input for one value present in a line
     * 	int N = Integer.parseInt(reader.readLine());
     *
     * 	this is similar to -> int N = scanner.nextInt();
     *
     * 5) Taking input for N values present in a line
     * 	read the input using readLine() function and split them with empty blank " " as delimeter
     *
     * 	String[] numbers = reader.readLine().split(" ");
     *         	for (int i = 0; i < N; i++) {
     *             	A[i] = Integer.parseInt(numbers[i]);
     *                        }
     *
     * 	this is similar to ->
     * 	for (int i = 0; i < N; i++) {
     *      		A[i] = scanner.nextInt();
     *            }
     *
     * Note: Another trick to make your code faster is the use of "\n" instead of println.
     * "\n" doesn't actually flush the output stream, whereas println does flush and takes a bit more time.
     * Example:
     * System.out.print(x+"\n");
     * System.out.println(x);
     *
     *
     */
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {//Write your code here
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];

            String[] st =br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(st[i]);
            }
            System.out.println(Arrays.toString(arr));
            
        }

    }
}
