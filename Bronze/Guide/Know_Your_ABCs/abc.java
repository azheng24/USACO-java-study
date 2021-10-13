/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: azheng21
LANG: JAVA
TASK: teleport
*/

// Link: http://www.usaco.org/index.php?page=viewproblem2&cpid=1059
// Description: Determine three the values of three numbers(A ≤ B ≤ C)
// Created: Oct 7 2021

import java.io.*;
import java.util.*;
import java.lang.*;


class abc {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("abc.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("abc.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int temp;

    // Store input in array
    int[] arr = new int[7];
    for(int i = 0; i < arr.length; i++)
    {
    	arr[i] = Integer.parseInt(st.nextToken());
    }

    // Bubble sort array
    for (int i = 0; i < arr.length - 1; i++)
    {
    	for (int j = 0; j < arr.length - i - 1; j++)
    	{
    		if (arr[j] > arr[j+1])
    		{
    			temp = arr[j];
    			arr[j] = arr[j+1];
    			arr[j+1] = temp;
     		}
    	}
    }

    // Test array sort
    /*
    for (int i = 0; i < 7; i++) {
    	out.println(arr[i]);
    }
    */

    // Calculate A, B, C
    int A = arr[0];
    int B = arr[1];
    int C = arr[6] - A - B;

    // Print A, B, C
    out.println(A);
    out.println(B);
    out.println(C);

    out.close();
  }
}
