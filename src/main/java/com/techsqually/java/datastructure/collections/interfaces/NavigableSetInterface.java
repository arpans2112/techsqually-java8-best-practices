package com.techsqually.java.datastructure.collections.interfaces;

public class NavigableSetInterface {

    /**
     *  1. Extends sortedSet Interface
     *  2. It supports the retrieval of elements based on the closest match to a given value or values
     *  3. Methods
     *       E ceiling(E obj) -> search for smallest element e in the set such that e >= obj
     *       Iterator<E>  descendingIterator() -> itterate from greatest to least
     *       NavigableSet<E>  descendingSet() -> reverset of the invoking set
     *       E floor(E obj)
     *       headSet(E upperBound , boolen incl) ->Returns a NavigableSet that includes all elements from the invoking
     *                                              set that are less than upperBound.
     *                                               if incl = true -> element in upper bound is included else exculded
     *       higher(E obj) -> like ceiling doesn't consider = to sign e > obj
     *       lower(E obj) -> like floor doesn't consider = to sign e < obj
     *       pollFirst() -> remove the first element and returned . if list is empty return null
     *       pollLast() -> remove the last element and returned. null if set is empty
     *
     *       subSet(E lowerBound, boolean lowIncl, E upperBound , boolean upperIncl)
     *       tailSet(E lowerBound , boolean incld)
     *
     * */
}
