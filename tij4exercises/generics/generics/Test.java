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
 *    Created on  Jan 11, 2019
 *
 ************************************************************************/
package generics;


import javax.xml.bind.DatatypeConverter;

public class Test {
    public static void main(String[] args) {
        int e = 0;//工资
        int c = 1500;//消费
        double i = 0.15;//工资增长率
        double ie = 0.15;//投资收益率
        double p = 0.75;//投资比例

        double ly = 0;//去年年底净资产
        for (int j = 0; j < 20; j++) {
            ly = net(e,c,ly,ie,p);//今年年底净资产
            e*=1+i;
            System.out.printf("第%d年,工资: %d,净资产: %.0f", j+2,e,ly); //$NON-NLS-1$
            System.out.println();
        }

        System.out.println("fdsafdsafdsafsfd");
        System.out.println(DatatypeConverter.printHexBinary("\0".getBytes()));

    }

    /**
     *
     * 求净资产
     *
     * @param e
     * @param c
     * @param ly
     * @param p
     * @param ie
     * @return
     */
    static double net(int e,int c,double ly, double ie, double p){
        return e*12*0.8+e*2-c*12+ly*ie*p+ly+ly*0.05*(1-p)+e*0.13*12;
    }
}
