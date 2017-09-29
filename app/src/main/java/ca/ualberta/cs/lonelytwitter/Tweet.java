/*
 * Class Name: Tweet
 * Version 1.0
 * Date: September 28
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Jiahao Guo
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    ArrayList<CurrentMood> moods = new ArrayList<CurrentMood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     *
     * @args message
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Sets tweet message
     *
     * @param message Tweet messgae
     * @throws TweetTooLongException
     */


    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() <= 140){
            this.message = message;
        }else{
            throw new TweetTooLongException();
        }

    }
    public abstract Boolean isImportant();

    public Date getDate(){
        return date;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<CurrentMood> getMoods() {
        return moods;
    }

    public void setMoods(ArrayList<CurrentMood> moods) {
        this.moods = moods;
    }
}
