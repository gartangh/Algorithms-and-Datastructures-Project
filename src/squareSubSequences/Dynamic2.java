/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareSubSequences;

import java.util.ArrayList;

/**
 *
 * @author Leen De Baets
 */
public class Dynamic2 {

	public Dynamic2() {
	}

	/**
	 * @param s
	 *            a string
	 * @return The amount of square subsequences in string s is returned.
	 */
	public static int amountOfSquareSubSequences(String s) {
		// TODO: Delete exception and implement here
		// RECURSIVE WAY (see Largest Common Subsequence (LCS)) 
		
		// Debug
		System.out.println("String s = " + s);
		
		ArrayList<SquareSubsequence> squareSubSequences = new ArrayList<>();
		
		int n;
		char[][] b;
		int[][] c;
		for (int m = 1; m < s.length(); m++) {
			n = s.length() - m;
			b = new char[m][n];
			c = new int[m+1][n+1];
			
			// Initialization
			String x = s.substring(0, m);
			String y = s.substring(m);
			
			for (int i = 0; i <= m; i++) {
				c[i][0] = 0;
			}
			for (int j = 0; j <= n; j++) {
				c[0][j] = 0;
			}
			
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					String halfString = "";
					ArrayList<Integer> leftIndices = new ArrayList<>();
					ArrayList<Integer> rightIndices = new ArrayList<>();
					
					if (x.charAt(i) == y.charAt(j)) {
						// Last letters are part of a SquareSubSequence
						halfString = x.charAt(i) + halfString;
						leftIndices.add(0, i);
						rightIndices.add(0, m + j);
						
						c[i][j] = c[i-1][j-1] + 1;
						b[i][j] = '\\';
					}
					else if (c[i-1][j] >= c[i][j-1]) {
						c[i][j] = c[i-1][j];
						b[i][j] = '|';
					}
					else {
						c[i][j] = c[i][j-1];
						b[i][j] = '_';
					}
				}
			}
		}
		
		int res = 0;
		
		return res;
	}
}
