package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    ArrayList<CurrentMood> moods = new ArrayList<CurrentMood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }
    public void setDate(Date date){
        this.date = date;
    }

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

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
