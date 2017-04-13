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
		// RECURSIVE WAY

		System.out.println("String s = " + s);
		
		int res = 0;
		
		/*
		// SquareSubsequence must be even and greater or equal to 2
		if (s.length() < 2)
			return res;

		// Get all SquareSubsequences of length 2
		ArrayList<SquareSubsequence> ss2 = new ArrayList<>();

		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					res++;

					String halfString = String.valueOf(s.charAt(i));

					ArrayList<Integer> leftIndices = new ArrayList<>();
					leftIndices.add(i);

					ArrayList<Integer> rightIndices = new ArrayList<>();
					rightIndices.add(j);

					SquareSubsequence other = new SquareSubsequence(halfString, leftIndices, rightIndices);
					
					// Check if not count some square subsequences twice
					for (SquareSubsequence k : ss2) {
						if (k.formsNewSquareSubsequence(other)) {
							res++;

							ss2.add(other);

							System.out.println("New SquareSubsequence of length 2: "+ halfString + halfString);
						}
					}
				}
			}
		}

		if (s.length() < 4)
			return res;

		// Copy all SquareSubsequences of length 2 in a new ArrayList
		ArrayList<SquareSubsequence> ss = new ArrayList<>();
		for (SquareSubsequence i : ss2) {
			ss.add(i);
		}

		int a, b, c1, cn, d1;

		// Iterate over all possible length for a SquareSubsequence in s
		for (int length = 4; length < s.length(); length += 2) {
			ArrayList<SquareSubsequence> tmp = new ArrayList<>();
			for (int i = 0; i < ss2.size() - 1; i++) {
				a = ss2.get(i).getLeftIndices().get(0);
				b = ss2.get(i).getRightIndices().get(0);

				for (int j = 1; j < ss.size(); j++) {
					c1 = ss.get(j).getLeftIndices().get(0);
					cn = ss.get(j).getLeftIndices().get(ss.get(j).getLeftIndices().size() - 1);
					d1 = ss.get(j).getRightIndices().get(0);

					if (a < c1 && cn < b && b < d1) {
						res++;

						String halfString = String.valueOf(s.charAt(a)).concat(ss.get(j).getHalfString());

						ArrayList<Integer> leftIndices = new ArrayList<>();
						leftIndices.add(a);
						for (Integer k : ss.get(j).getLeftIndices()) {
							leftIndices.add(k);
						}

						ArrayList<Integer> rightIndices = new ArrayList<>();
						rightIndices.add(b);
						for (Integer k : ss.get(j).getRightIndices()) {
							rightIndices.add(k);
						}

						tmp.add(new SquareSubsequence(halfString, leftIndices, rightIndices));

						System.out.println("New SquareSubsequence of length " + length + ": " + halfString + halfString);
					}
				}
			}
			// If no SquareSubsequences of length length exist, return res
			if (tmp.size() == 0)
				return res;
			ss = tmp;
		}
		*/

		return res;
	}
}
