// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157
private class SimpleIterator<E> implements Iterator<E> {
	private int curPos, expectedModCount;
	private SimpleIterator<E>(){ // private constructor
		curPos = 0; // - an iterator can
		expectedModCount = modCount; // only be created
	} // by a collection
	public void remove() {
		throw new UnsupportedOperationException
			("remove not supported by SimpleC");
	}
	// exercise – write a meaningful remove() method
	// Other methods
	
	
	
	public E next() {
		if (modCount != expectedModCount)
			throw new ConcurrentModificationException
				("Cannot mutate in context of iterator");
		if (! hasNext()) 
			throw new NoSuchElementException 
				("here are no more elements");
		E obj = items[curPos];
		curPos++;
		return obj;
	}
	
	public boolean hasNext() {
		return curPos <= last;
	}
}