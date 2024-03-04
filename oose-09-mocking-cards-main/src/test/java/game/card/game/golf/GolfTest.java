package game.card.game.golf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import communication.ConsoleInOut;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import game.card.entity.Hand;
import game.card.entity.Card;
import game.card.entity.CompetitorType;
import game.Player;


public class GolfTest {

    Scanner mockScanner = mock(Scanner.class);
    ConsoleInOut consoleInOut = new ConsoleInOut();
    Golf golf = new Golf();

    @BeforeEach
    private void setUp(){
        consoleInOut.setScanner(mockScanner);
        golf.setInOut(consoleInOut, false);
    }

    @Test
    void testCheckIfKnock(){

    }

    @Test
    void testCheckIfKnockNot(){
 
    }

    @Test
    void testMakeUserCardsVisible(){
       
    }

}
