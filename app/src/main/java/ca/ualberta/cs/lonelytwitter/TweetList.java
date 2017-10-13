package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andoryu on 2017-10-12.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet){
        //tweets.add(tweet);
        this.addTweet(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
        Set<Tweet> set = new HashSet<Tweet>(tweets);
        if (set.size() < tweets.size()) {
            tweets.remove(tweet);
            throw new IllegalArgumentException();
        }
    }
    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> temp_tweets = tweets;
        Collections.sort(temp_tweets, new Comparator<Tweet>(){
            public int compare(Tweet t1, Tweet t2){
                return t1.getDate().compareTo(t2.getDate()) ;
            }
        });
        tweets = temp_tweets;
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }


}
