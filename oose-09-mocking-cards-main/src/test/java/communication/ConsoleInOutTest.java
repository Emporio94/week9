package communication;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import game.Player; 
import game.card.entity.Hand;
import game.card.entity.CompetitorType;


public class ConsoleInOutTest {

    Scanner mockScanner = mock(Scanner.class);
    ConsoleInOut consoleInOut = new ConsoleInOut();

    @BeforeEach
    private void setUp(){
        consoleInOut.setScanner(mockScanner);
        consoleInOut.setOutputOn(false);
    
    }

    @Test
    void testGetInputString() {
        when(mockScanner.nextLine()).thenReturn("Derek");
        assertEquals("Derek", consoleInOut.getInputString("Message"));
    }

    @Test
    void testGetInputStringIgnoreSecond() {
        when(mockScanner.nextLine()).thenReturn("Xi").thenReturn("Derek");
        assertEquals("Xi", consoleInOut.getInputString("Message"));
    }

    @Test
    void testGetInteger(){
        when(mockScanner.nextLine()).thenReturn("2");
        assertEquals(2, consoleInOut.getInteger());
    }

    @Test
    void testGetIntegerSecondTime(){
        when(mockScanner.nextLine()).thenReturn("Del").thenReturn("3");
        assertEquals(3, consoleInOut.getInteger());
    }
    
    @Test
    void testGetInputInteger() {
        
    }

    @Test
    void testGetInputIntegerSecondTime() {
        
    }

    @Test
    void testGetListIndex() {
        
    }

    @Test
    void testGetListIndexSecondTime() {
        
    }

    @Test
    void testGetListIndexWithQuestion() {
   
    }
 
    @Test
    void testGetPlayersCard() {
        
    }

    @Test
    void testGetYesOrNoYes() {
  }

    @Test
    void testGetYesOrNoY() {
    }

    @Test
    void testGetYesOrNoNo() {
  
    }

    @Test
    void testGetYesOrNoOther() {
    
    }

}
