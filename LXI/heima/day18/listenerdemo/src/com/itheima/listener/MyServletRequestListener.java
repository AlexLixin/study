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
 *    Created on  Jan 14, 2019
 *
 ************************************************************************/
package com.itheima.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyServletRequestListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request destroyed!");

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request requestInitialized!");
    }

}
