//: net/mindview/util/CollectionData.java
// A Collection filled with data using a generator object.
package net.mindview.util;

import java.util.*;

public class CollectionData<T> extends ArrayList<T> {
	/**
	 * COMMENT - Add concise description of the purpose of this field. Description
	 * should go beyond the field's name.
	 *
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;

	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++)
			add(gen.next());
	}

	// A generic convenience method:
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
		return new CollectionData<T>(gen, quantity);
	}
} /// :~
