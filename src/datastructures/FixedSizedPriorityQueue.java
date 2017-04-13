package datastructures;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 
 * FixedSizePriorityQueue<T> is a class responsible for maintaining in order the
 * 'elementsLeft' smallest items.
 * 
 * @author Leen De Baets
 *
 */
public class FixedSizedPriorityQueue extends PriorityQueue<ComparableSimpleEntry> {

	/**
	 * Determines the remaining free spots in this queue
	 */
	private int elementsLeft;

	/**
	 * Constructs a new FixedSizedPriorityQueue with a capacity of elementsLeft
	 * 
	 * @param elementsLeft
	 */
	public FixedSizedPriorityQueue(int elementsLeft) {
		super();
		this.elementsLeft = elementsLeft;
	}

	/**
	 * Overrides the add of a PriorityQueue
	 * 
	 * - If capacity has not been reached -> delegate the add to the
	 * PriorityQueue and decrease the capacity - Else -> Check with the item
	 * with the highest distance (should be at the front of the priority queue).
	 * If item to be added is smaller then remove top from queue and add new
	 * item. Else do not add item.
	 * 
	 * @param e
	 *            The ComparableSimpleEntry contains as key a double
	 *            (representing e.g., the distance) and as value an object
	 *            (e.g., a movie). The key should be used to determine if an
	 *            element is added or not when the capacity of the fixed sized
	 *            priority queue is reached.
	 */
	@Override
	public boolean add(ComparableSimpleEntry e) {
		// Delete exception and implement here
		if (elementsLeft > 0) {
			elementsLeft--;
			super.offer(e);
			
			return true;
		}
		else {
			if (super.peek().compareTo(e) < 0) {
				super.offer(e);
				super.poll();
				
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		// Delete exception and implement here
		// Do this in such way that the first element printed is the most
		// important one (e.g. the movie with the smallest distances (key))
		String res = "";
		ArrayList<ComparableSimpleEntry> arr = new ArrayList<>();
		
		for (ComparableSimpleEntry i : this) {
			arr.add(i);
		}
		
		for (int i = arr.size() - 1; i >= 0; i--) {
			res += arr.get(i).getValue().toString();
			res += "\n";
		}
		
		return res;
	}
}
