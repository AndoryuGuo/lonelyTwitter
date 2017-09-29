/*
 * Class Name: Tweetable
 * Version 1.0
 * Date: September 28
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * represents a tweet with a date that sending by user
 *
 * @author Jiahao Guo
 * @version 1.0
 * @since 1.0
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
