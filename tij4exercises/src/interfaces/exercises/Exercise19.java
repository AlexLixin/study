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
 *    Created on  Dec 13, 2018
 *
 ************************************************************************/
package interfaces.exercises;

interface Game{
    void play();
}
interface GameFactory{
    Game getGame();
}
class CoinGame implements Game{

    @Override
    public void play() {
        System.out.println("play CoinGame");
    }

}
class CoinGameFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new CoinGame();
    }

}
class DiceGame implements Game{

    @Override
    public void play() {
        System.out.println("play DiceGame");
    }

}
class DiceGameFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new DiceGame();
    }

}
public class Exercise19 {
    public static void main(String[] args) {
        new CoinGameFactory().getGame().play();
        new DiceGameFactory().getGame().play();
    }

}
