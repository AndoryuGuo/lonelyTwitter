/*
 * Class Name: happyMood
 * Version 1.0
 * Date: September 28
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class happyMood extends CurrentMood{

    public happyMood(Date date){
        super(date);
    }

    public String mood(){
        return "Happy";
    }
}
