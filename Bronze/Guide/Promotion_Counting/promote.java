/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: azheng21
LANG: JAVA
TASK: promote
*/

// Link: http://www.usaco.org/index.php?page=viewproblem2&cpid=591
// Description: Determine the number of promotions from 4 ranks(bronze, silver, gold, platinum)
// Created: Oct 6 2021

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("promote.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));
    // Read input values
    // Bronze
    StringTokenizer st1 = new StringTokenizer(f.readLine());
	long bronzeBefore = Long.parseLong(st1.nextToken());
	long bronzeAfter = Long.parseLong(st1.nextToken());
	// Silver
    StringTokenizer st2 = new StringTokenizer(f.readLine());
	long silverBefore = Long.parseLong(st2.nextToken());
	long silverAfter = Long.parseLong(st2.nextToken());
	// Gold
	StringTokenizer st3 = new StringTokenizer(f.readLine());
	long goldBefore = Long.parseLong(st3.nextToken());
	long goldAfter = Long.parseLong(st3.nextToken());
	// Platinum
	StringTokenizer st4 = new StringTokenizer(f.readLine());
	long platBefore = Long.parseLong(st4.nextToken());
	long platAfter = Long.parseLong(st4.nextToken());

	// Calculate promotions from bronze to silver
	long promoted = (bronzeAfter + silverAfter + goldAfter + platAfter) - (bronzeBefore + silverBefore + goldBefore + platBefore) + bronzeBefore - bronzeAfter;
	out.println(promoted);

	// Calculate promotions from silver to gold
	promoted = promoted + silverBefore - silverAfter;
	out.println(promoted);

	// Calculate promotions from gold to platinum
	promoted = promoted + goldBefore - goldAfter;

	out.println(promoted);
	out.close();
  }
}
