/************************************************************************
 *                                                                      *
 *  DDDD     SSSS    AAA        Daten- und Systemtechnik Aachen GmbH    *
 *  D   D   SS      A   A       Pascalstrasse 28                        *
 *  D   D    SSS    AAAAA       52076 Aachen-Oberforstbach, Germany     *
 *  D   D      SS   A   A       Telefon: +49 (0)2408 / 9492-0           *
 *  DDDD    SSSS    A   A       Telefax: +49 (0)2408 / 9492-92          *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by DSA - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Dec 28, 2018
 *
 ************************************************************************/
package exceptions.example;

//"Turning off" Checked exceptions.
import java.io.*;
import static net.mindview.util.Print.*;

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Where am I?"); //$NON-NLS-1$
                default:
                    return;
            }
        } catch (Exception e) { // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {

    private static final long serialVersionUID = 1L;
}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        //You can call throwRuntimeException() without a try
        //block, and let RuntimeExceptions leave the method:
        wce.throwRuntimeException(3);
        //Or you can choose to catch exceptions:
        for (int i = 0; i < 4; i++)
            try {
                if (i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch (SomeOtherException e) {
                print("SomeOtherException: " + e); //$NON-NLS-1$
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    print("FileNotFoundException: " + e); //$NON-NLS-1$
                } catch (IOException e) {
                    print("IOException: " + e); //$NON-NLS-1$
                } catch (Throwable e) {
                    print("Throwable: " + e); //$NON-NLS-1$
                }
            }
    }
} /* Output:
  FileNotFoundException: java.io.FileNotFoundException
  IOException: java.io.IOException
  Throwable: java.lang.RuntimeException: Where am I?
  SomeOtherException: SomeOtherException
  *///:~