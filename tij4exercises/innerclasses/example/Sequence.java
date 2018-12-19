package example;
import exercises.Exercise2;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {

    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length - 1;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }

        public Sequence getOuter() {
            return Sequence.this;
        }
    }

    public Selector reverseSelector() {
        return new Selector() {
            private int i = items.length - 1;

            @Override
            public void next() {
                if (i > 0) {
                    i--;
                }
            }

            @Override
            public boolean end() {
                return i == 0;
            }

            @Override
            public Object current() {
                return items[i];
            }
        };
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(13);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        sequence.add(new Exercise2().getExer2());
        sequence.add(new Exercise2().getExer2());
        sequence.add(new Exercise2().getExer2());
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
} /* Output:
  0 1 2 3 4 5 6 7 8 9
  *///:~
