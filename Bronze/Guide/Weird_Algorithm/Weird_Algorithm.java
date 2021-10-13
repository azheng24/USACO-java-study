// Link: https://cses.fi/problemset/task/1068
// Description: Creates an algorithm. n = odd, n * 3 + 1; n = even, n / 2
// Created: Oct 5 2021

import java.io.*;
import java.util.*;
import java.lang.Math;

class Kattio extends PrintWriter {
	private BufferedReader r;
	private StringTokenizer st;
	// standard input
	public Kattio() { this(System.in,System.out); }
	public Kattio(InputStream i, OutputStream o) {
		super(o);
		r = new BufferedReader(new InputStreamReader(i));
	}
	// USACO-style file input
	public Kattio(String Weird_Algorithm) throws IOException {
		super(new FileWriter(Weird_Algorithm+".out"));
	}
	// returns null if no more input
	public String next() {
		try {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(r.readLine());
			return st.nextToken();
		} catch (Exception e) {}
		return null;
	}
	public int nextInt() { return Integer.parseInt(next()); }
	public double nextDouble() { return Double.parseDouble(next()); }
	public long nextLong() { return Long.parseLong(next()); }
}

public class Weird_Algorithm {
	public static void main(String[] args) {
		Kattio io = new Kattio();
		int n = io.nextInt();
		io.print(n + " ");
		while (n > 1 && n <= Math.pow(10, 6)) {
		    if (n % 2 == 0)
		        n /= 2;
            else
                n = n * 3 + 1;
            io.print(n + " ");
		}
		io.close();
	}
}
