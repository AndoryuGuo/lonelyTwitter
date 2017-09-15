package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends CurrentMood{

    public SadMood(Date date){
        super(date);
    }

    public String mood(){
        return "Sad";
    }
}
