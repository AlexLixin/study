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
 *    Created on  Jan 4, 2019
 *
 ************************************************************************/
package typeinfo.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise6 {
    public static void setFlag(Shape s) {
        if (s instanceof Triangle)
            ((Triangle)s).flag = true;
    }

    public static void main(String[] args) {
        // upcasting to Shape:
        List<Shape> shapeList = Arrays.asList(new Circle(),new Square(),new Triangle());
        for (Shape shape : shapeList) {
            setFlag(shape);
            System.out.println(shape);
        }
    }
}
