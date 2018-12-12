package interfaces.exercises;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.Processor;

class E11 {
    String f(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (s.length() % 2 == 0 ? s.length() : s.length() - 1); i += 2) {
            sb.append(s.charAt(i + 1));
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

class E11Adapter implements Processor {
    E11 e;

    public E11Adapter(E11 e) {
        this.e = e;
    }

    @Override
    public String name() {
        return E11.class.getName();
    }

    @Override
    public Object process(Object input) {
        String f = e.f((String)input);
        return f;
    }

}

public class Exercise11 {
    public static void main(String[] args) {
        Apply.process(new E11Adapter(new E11()), "doxinogdalwonxingdsamidsnalgl"); //$NON-NLS-1$
    }

}
