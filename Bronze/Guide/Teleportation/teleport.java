/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: azheng21
LANG: JAVA
TASK: teleport
*/

import java.io.*;
import java.util.*;
import java.lang.*;


class teleport {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("teleport.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int directDistance = Math.abs(a-b);
		int telDistance = Math.abs(a-x) + Math.abs(b-y);
		int telDistance2 = Math.abs(a-y) + Math.abs(b-x);
		out.println(Math.min(telDistance2, Math.min(directDistance, telDistance)));
    	out.close();
  }
}
