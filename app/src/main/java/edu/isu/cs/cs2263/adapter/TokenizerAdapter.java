/*
 * Created by Emily Elzinga
 *
 * 10/11/2021
 */

package edu.isu.cs.cs2263.adapter;

import  java.util.StringTokenizer;

/**
 * Adapter Class for String Tokenizer
 *
 * @author Emily Elzinga
 * @version 2.1.0
 */
public class TokenizerAdapter implements PushbackTokenizer {
    private StringTokenizer tokenizer;
    private String currentToken = null;
    private boolean push_back = false;


    /**
     * Constructor
     * @param tokenizer default String Tokenizer object
     */
    public TokenizerAdapter(StringTokenizer tokenizer){
        this.tokenizer = tokenizer;
    }


    /**
     * Gets the next token, unless the push_back var is true. Then it just returns the current token.
     * For the current token to not be null, nextToken must be called before the push_back method.
     * @return the currentToken
     */
    @Override
    public String nextToken() {
        if (push_back) push_back = false;
        else currentToken = tokenizer.nextToken();
        return currentToken;
    }

    /**
     * @return the boolean value of if there are more tokens in the object
     */
    @Override
    public boolean hasMoreTokens() {
        if (push_back) return true;
        else return tokenizer.hasMoreTokens();
    }

    /**
     * If called, makes the nextToken method stay on the current token
     * @return bool push_back
     */
    @Override
    public boolean pushBack() {
       push_back = true;
       return true;
    }

}
