package containers.exercises;

class SList<E> {
	private Link<E> headLink = new Link<E>(null);
	SListIterator<E> iterator() { return new SListIterator<E>(headLink); }
	@Override
    public String toString() {
		if(headLink.next == null) return "SList: []"; //$NON-NLS-1$
		System.out.print("SList: ["); //$NON-NLS-1$
		SListIterator<E> it = this.iterator();
		StringBuilder s = new StringBuilder();
		while(it.hasNext()) {
			s.append(it.next() + (it.hasNext() ? ", " : "")); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return s + "]"; //$NON-NLS-1$
	}
}

class SListIterator<E> {
	Link<E> current;
	SListIterator(Link<E> link) {
		current = link;
	}
	public boolean hasNext() {
		return current.next != null;
	}
	public Link<E> next() {
		current = current.next;
		return current;
	}
	public void insert(E e) {
		current.next = new Link<E>(e, current.next);
		current = current.next;
	}
	public void remove() {
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
}

class Link<E> {
	E e;
	Link<E> next;
	Link(E e, Link<E> next) {
		this.e = e;
		this.next = next;
	}
	Link(E e) {
		this(e, null);
	}
	@Override
    public String toString() {
		if(e == null) return "null"; //$NON-NLS-1$
		return e.toString();
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		SList<String> sl = new SList<String>();
		System.out.println(sl);
		SListIterator<String> slIter = sl.iterator();
		System.out.println("inserting \"hi\""); //$NON-NLS-1$
		slIter.insert("hi"); //$NON-NLS-1$
		System.out.println(sl);
		System.out.println("inserting \"there\""); //$NON-NLS-1$
		slIter.insert("there"); //$NON-NLS-1$
		System.out.println(sl);
		System.out.println("inserting \"sweetie\""); //$NON-NLS-1$
		slIter.insert("sweetie"); //$NON-NLS-1$
		System.out.println(sl);
		System.out.println("inserting \"pie\""); //$NON-NLS-1$
		slIter.insert("pie"); //$NON-NLS-1$
		System.out.println(sl);
		SListIterator<String> slIter2 = sl.iterator();
		System.out.println("removing \"hi\""); //$NON-NLS-1$
		slIter2.remove();
		System.out.println(sl);
		System.out.println("inserting \"hello\""); //$NON-NLS-1$
		slIter2.insert("hello"); //$NON-NLS-1$
		System.out.println(sl);
		System.out.println("removing \"there\""); //$NON-NLS-1$
		slIter2.remove();
		System.out.println(sl);
		System.out.println("removing \"sweetie\""); //$NON-NLS-1$
		slIter2.remove();
		System.out.println(sl);
		System.out.println("removing \"pie\""); //$NON-NLS-1$
		slIter2.remove();
		System.out.println(sl);
		System.out.println("removing \"hello\""); //$NON-NLS-1$
		SListIterator slIter3 = sl.iterator();
		slIter3.remove();
		System.out.println(sl);
	}
}