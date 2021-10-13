/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: azheng21
LANG: JAVA
TASK: buckets
*/

// Link: http://www.usaco.org/index.php?page=viewproblem2&cpid=939
// Description: Determines the fastest way to create a chain of cows from the Barn('B') to the Lake('L')
// Created: Oct 11 2021

import java.io.*;
import java.util.*;
import java.lang.*;


class buckets {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("buckets.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out")));

	// Initialize variables
    int barn_col = 0, barn_row = 0, lake_row = 0, lake_col = 0, rock_row = 0, rock_col = 0;

	// Iterate through input and find row and col for barn, lake, and rock
    for (int i = 0; i < 10; i++) {
    	StringTokenizer st = new StringTokenizer(f.readLine());
		String str = st.nextToken();
		for (int j = 0; j < 10; j++)
		{
			if (str.charAt(j) == 'B')
			{
				barn_row = i;
				barn_col = j;
			}
			else if (str.charAt(j) == 'L')
			{
				lake_row = i;
				lake_col = j;
			}
			else if (str.charAt(j) == 'R') {
				rock_row = i;
				rock_col = j;
			}
		}
    }

	// Calculate distance between barn and lake
    int distance = Math.abs(barn_row - lake_row) + Math.abs(barn_col - lake_col) - 1;

    // Check if rock is inbetween barn and lake
    	// Line 1: if rock is on same row as barn and lake
    	// Line 2: if rock is inbetween barn and lake
    	// Line 3: if rock is on same row as barn and lake
    	// Line 4: if rock is inbewteen barn and lake
    if ((rock_col == lake_col && rock_col == barn_col &&
    (rock_row > lake_row && rock_row < barn_row || rock_row > barn_row && rock_row < lake_row)) ||
    rock_row == lake_row && rock_row == barn_row &&
	(rock_col > lake_col && rock_col < barn_col || rock_col > barn_col && rock_col < lake_col))
    		distance += 2;
	out.println(distance);

    out.close();
  }
}
