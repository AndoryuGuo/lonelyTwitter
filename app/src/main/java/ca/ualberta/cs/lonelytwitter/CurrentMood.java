/*
 * Class Name: CurrentMood
 * Version 1.0
 * Date: September 28
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {
    private Date date;

    public CurrentMood(Date date) {
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }
    
    public abstract String mood();
}
