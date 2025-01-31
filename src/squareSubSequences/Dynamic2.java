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
		// Empty constructor
	}

	/**
	 * @param s
	 *            a string
	 * @return The amount of square subsequences in string s is returned.
	 */
	public static int amountOfSquareSubSequences(String s) {
		// Delete exception and implement here
		// RECURSIVE WAY (see Largest Common Subsequence (LCS)) 
		
		if (s.length() < 2)
			return 0;
		
		// METHOD 1: not all of them are counted.
		//ArrayList<SquareSubsequence> squareSubSequences = new ArrayList<>();
		
		/*
		int n;
		//char[][] b;
		//int[][] c;
		for (int m = 1; m < s.length()-1; m++) {
			n = s.length() - m;
			//b = new char[m][n];
			//c = new int[m+1][n+1];
			
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
					
					if (x.charAt(i-1) == y.charAt(j-1)) {
						// Last letters are part of a SquareSubSequence
						halfString += x.charAt(i-1);
						leftIndices.add(0, i - 1);
						rightIndices.add(0, m + j - 1);
						
						SquareSubsequence tmpSquareSubsequence = new SquareSubsequence(halfString, leftIndices, rightIndices);
						
						boolean valid = true;
						
						for (SquareSubsequence squareSubsequence : squareSubSequences) {
							if (!squareSubsequence.formsNewSquareSubsequence(tmpSquareSubsequence)) {
								valid = false;
							}
						}
						
						if (valid) {
							squareSubSequences.add(tmpSquareSubsequence);
						}
					}
					//if ()
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
		}*/
		
		// METHOD 1: not correct in all cases.
		String x, y;
		int res = 0, a, b, c;
		
		for (int m = 1; m < s.length(); m++) {
			x = s.substring(0, m);
			y = s.substring(m);
			
			for (a = 0; a < m; a++) {
				if (y.charAt(0) == x.charAt(a)) {
					res++;
					for (b = m+1; b < s.length(); b++) {
						for (c = a+1; c < m; c++) {
							if (x.charAt(c) == y.charAt(b-m)) {
								res++;
							}
						}
					}
				}
			}
		}
		
		// METHOD 3: counts to much.
		/*
		String x, y;
		int res = 0, a;
		
		for (int m = 1; m < s.length(); m++) {
			x = s.substring(0, m);
			y = s.substring(m);
			
			for (a = 0; a < m; a++) {
				if (y.charAt(0) == x.charAt(a)) {
					res += 1 + amountOfSquareSubSequences(s.substring(a+1,m) + s.substring(m+1));
				}
			}
		}
		*/
		
		return res;
	}
}
