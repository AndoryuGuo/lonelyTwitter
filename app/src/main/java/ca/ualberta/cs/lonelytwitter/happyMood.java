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
