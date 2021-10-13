/*
 * Created by Emily Elzinga
 *
 * 10/11/2021
 */

package edu.isu.cs.cs2263.adapter;

/**
 * Interface of the methods we want in our new tokenizer
 *
 * @author Emily Elzinga
 * @version 2.1.0
 */
public interface PushbackTokenizer {
    // Returns the next token
    String nextToken();

    // Returns true if and only if there are more tokens
    boolean hasMoreTokens();

    // The token read is pushed back, so it can be read again using nextToken.
    boolean pushBack();
}
