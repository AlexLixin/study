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
 *    Created on  Dec 25, 2018
 *
 ************************************************************************/
package exceptions.example;

//An exception that reports through a Logger.
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    private static Logger logger = Logger.getLogger("LoggingException"); //$NON-NLS-1$

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e); //$NON-NLS-1$
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e); //$NON-NLS-1$
        }
    }
} /* Output: (85% match)
  Aug 30, 2005 4:02:31 PM LoggingException <init>
  SEVERE: LoggingException
  at LoggingExceptions.main(LoggingExceptions.java:19)
  Caught LoggingException
  Aug 30, 2005 4:02:31 PM LoggingException <init>
  SEVERE: LoggingException
  at LoggingExceptions.main(LoggingExceptions.java:24)
  Caught LoggingException
  *///:~