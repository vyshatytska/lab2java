
import java.util.Scanner;
public class test {
	    static int array_result(int[] A, int P)
	    {
	        for (int i = 0; i < 24; i++)
	        {
	            if ((A[i] >= 0) || (i % 2 == 0))
	            {
	                P += A[i];
	            }
	        }
	        return P;
	    }
	    static int output(int[] A, int P)
	    {
	    	System.out.println("Array: ");
	        for (int i = 0; i < 24; i++)
	        {
	        	System.out.print("[" + i + "] " + A[i] + "   ");
	        	if(i == 13) {
	        		System.out.println("");
	        	}
	        }
	        return 1;
	    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        //-------Done-------
        int[] A = {-10, 5, 39, 45, 10, 69, 5, 23, 57, 79, 40, 70, 66, 92, 66, 46, 30, 67, 62, 41, 86, 29, 37, 68, 27};
        int P = 0;
        System.out.println("Result: " + array_result(A, P));
        System.out.println("Array: " + output(A, P));


	}
}
///////////


import java.util.Scanner;
public class labr2 {
	static int array_result_min(int[] A, int min, int min1)
    {
        for (int i = 0; i < 10; i++)
        {
            if (A[i] < min)
            {
                min = A[i];
                min1 = i;
            }
        }
        return min1;
    }
	static int array_result_max(int[] A, int max, int max1)
    {
        for (int i = 0; i < 10; i++)
        {
            if (A[i] > max)
            {
                max = A[i];
                max1 = i;
            }
        }
        return max1;
    }
	static int average(int k, int max1, int min1)
    {
        k = min1 + max1;
        return k;
    }

    static int output(int[] A)
    {
    	System.out.print("Array: ");
        for (int i = 0; i < 10; i++)
        {
        	System.out.print("[" + i + "] " + A[i] + "   ");
        }
        return 1;
    }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int[] A = { 2, 12, 14, 25, 9, 5, 11, 17, 8, 3 };
        int k = 0;
        int max1 = 0;
        int min1 = 0;
        System.out.println("Result(average): " + average(k, max1, min1));
        System.out.println("" + output(A));
	}

}
