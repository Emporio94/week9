package game;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner; 



public class LoadCSVTest {

    LoadCSV loadCSV = new LoadCSV();

    @Test
    void testCreateCSVReader() throws Exception {
        try {
            Scanner scanner = loadCSV.createCSVreader(Game.playerNamesFile);
            assertTrue(scanner.hasNextLine());
        } catch (IOException e) {
        }
    }

    @Test 
    void testCreateCSVReaderException(){
        assertThrows(IOException.class, () -> loadCSV.createCSVreader("rubish path"));
    }

    @Test
    void testGetCSVReader() {
        try {
            Scanner scanner = loadCSV.getCSVReader(Game.playerNamesFile);
            assertTrue(scanner.hasNextLine());
        } catch (Exception e) {
        }
    }

    @Test
    void testGetCSVReaderException() {
        assertThrows(IOException.class, () -> loadCSV.getCSVReader("rubish path"));

    }

    @Test
    void testGetCSVRows() {
        assertEquals(7, loadCSV.getCSVRows(Game.playerNamesFile).size());
    }

    @Test
    void testGetCSVReaderMockFirstRow(){

    }

    @Test
    void testGetCSVReaderMockSize(){
  
    }

    @Test
    void testSetCSVReader() {
  
    }

    @Test
    void testSetCSVReaderConfig() {

    }

}
