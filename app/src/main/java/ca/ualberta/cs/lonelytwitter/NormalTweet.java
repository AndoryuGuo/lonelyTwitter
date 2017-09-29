/*
 * Class Name: NormalTweet
 * Version 1.0
 * Date: September 28
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Normal tweet
 *
 * @author Jiahao Guo
 * @see Tweet
 * @version 1.0
 * @since 1.0
 *
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs normal tweet objects
     *
     * @param message
     * @param date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
