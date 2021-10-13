/*
 * Created by Emily Elzinga
 *
 * 10/12/2021
 */


package edu.isu.cs.cs2263.adapter;
import java.util.StringTokenizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the String Tokenizer Adapter, PushbackTokenizer
 *
 * @author Emily Elzinga
 * @version 2.1.0
 */

public class PushbackTest {
    PushbackTokenizer pushbackTokenizer;

    @BeforeEach
    void setup(){
        pushbackTokenizer = new TokenizerAdapter(new StringTokenizer("HEllow World", " "));
    }

    @Test
    @DisplayName("Check that if the pushBack bool is true, the 'Hellow' string will be returned" +
            "again. Next, make sure it goes to the next token.")
    void testNextToken(){
        assertEquals("HEllow",pushbackTokenizer.nextToken());
        pushbackTokenizer.pushBack();
        assertEquals("HEllow",pushbackTokenizer.nextToken());

        assertEquals("World",pushbackTokenizer.nextToken());
    }

    @Test
    @DisplayName("PushbackTokenizer should have at least one token, and" +
            "make sure there is more than one token in the tokenizer")
    void testHasMoreTokens(){
        assertNotNull(pushbackTokenizer);
        pushbackTokenizer.nextToken();
        assertTrue(pushbackTokenizer.hasMoreTokens());
    }


    @Test
    @DisplayName("push_back should be true")
    void testPushBack(){
        assertTrue(pushbackTokenizer.pushBack());
    }
}







