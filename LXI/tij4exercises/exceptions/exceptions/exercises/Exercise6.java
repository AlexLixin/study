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
package exceptions.exercises;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Exer61 extends Exception {
    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    private static Logger logger = Logger.getLogger("Exer61"); //$NON-NLS-1$

    public Exer61() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}

class Exer62 extends Exception {
    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    private static Logger logger = Logger.getLogger("Exer62"); //$NON-NLS-1$

    public Exer62() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}

public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new Exer61();
        } catch (Exception e) {

        }
        try {
            throw new Exer62();
        } catch (Exception e) {

        }
    }
}
