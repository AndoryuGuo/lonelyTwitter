package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Andoryu on 2017-10-12.
 */
import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        //assertTrue(Boolean.TRUE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet tweet =  new NormalTweet("test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testGetTweets(){
        Boolean isOrder = true;
        TweetList list = new TweetList();
        list.getTweets();
        if (list.getTweet(0).getDate().compareTo(list.getTweet(1).getDate()) > 0){
            isOrder = false;
        }
        assertTrue(isOrder);
    }


}
