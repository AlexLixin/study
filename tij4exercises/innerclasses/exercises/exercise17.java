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
 *    Created on  Dec 17, 2018
 *
 ************************************************************************/
package exercises;

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class CoinGame implements Game {
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new CoinGame();
        }
    };

    @Override
    public void play() {
        System.out.println("play CoinGame");
    }

}

class DiceGame implements Game {
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new DiceGame();
        }
    };

    @Override
    public void play() {
        System.out.println("play DiceGame");
    }

}

public class exercise17 {
    public static Game getGame(GameFactory f) {
        return f.getGame();
    }

    public static void main(String[] args) {
        getGame(CoinGame.factory).play();
        getGame(DiceGame.factory).play();
    }

}
