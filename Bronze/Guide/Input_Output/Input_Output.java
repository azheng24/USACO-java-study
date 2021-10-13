// Link: --
// Description: Practice using input and output by printing the sum of three inputs
// Created: Oct 5 2021

import java.io.*;
import java.util.*;

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
	public Kattio(String Input_Output) throws IOException {
		super(new FileWriter(Input_Output+".out"));
		r = new BufferedReader(new FileReader(Input_Output+".in"));
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

public class Input_Output {
	public static void main(String[] args) {
		Kattio io = new Kattio();
		int a = io.nextInt();
		int b = io.nextInt();
		int c = io.nextInt();
		io.print("sum is ");
		io.println(a + b + c);
		io.close(); // make sure to include this line -- closes io and flushes the output
	}
}
