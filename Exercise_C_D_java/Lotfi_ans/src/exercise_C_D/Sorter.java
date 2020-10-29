
/*
 * Sorter.java
 * ENSF 619-Lab 6- Exercise C&D 
 * Completed by: Ziad Chemali & Lotfi Hasni
 * Submission date: October 30, 2020
 */
package exercise_C_D;

import java.util.ArrayList;

public interface Sorter <E extends Number & Comparable<E>> {

	void sort(ArrayList<Item <E>> s);
}
