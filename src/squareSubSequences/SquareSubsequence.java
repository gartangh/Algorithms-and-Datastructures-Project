/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareSubSequences;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Leen De Baets
 */
public class SquareSubsequence {

	private String halfString;

	private ArrayList<Integer> leftIndices;
	private ArrayList<Integer> rightIndices;

	public SquareSubsequence() {
		// Empty constructor
	}

	public SquareSubsequence(String halfString, ArrayList<Integer> leftIndices, ArrayList<Integer> rightIndices) {
		this.halfString = halfString;
		this.leftIndices = leftIndices;
		this.rightIndices = rightIndices;
	}

	public boolean formsNewSquareSubsequence(SquareSubsequence other) {
		// delete exception and implement here
		// ONLY FOR DYNAMIC PROGRAMMING 2!

		if (this.equals(other))
			return true;
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final SquareSubsequence other = (SquareSubsequence) obj;
		if (!Objects.equals(this.halfString, other.halfString)) {
			return false;
		}
		if (!Objects.equals(this.leftIndices, other.leftIndices)) {
			return false;
		}
		if (!Objects.equals(this.rightIndices, other.rightIndices)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.halfString);
		hash = 97 * hash + Objects.hashCode(this.leftIndices);
		hash = 97 * hash + Objects.hashCode(this.rightIndices);

		return hash;
	}

	public String getHalfString() {
		return halfString;
	}

	public ArrayList<Integer> getLeftIndices() {
		return leftIndices;
	}

	public ArrayList<Integer> getRightIndices() {
		return rightIndices;
	}

	public void setHalfString(String halfString) {
		this.halfString = halfString;
	}

	public void setLeftIndices(ArrayList<Integer> leftIndices) {
		this.leftIndices = leftIndices;
	}

	public void setRightIndices(ArrayList<Integer> rightIndices) {
		this.rightIndices = rightIndices;
	}

	@Override
	public String toString() {
		return "SquareSubsequence{" + "halfString=" + halfString + ", leftIndices=" + leftIndices + ", rightIndices="
				+ rightIndices + '}';
	}
}
