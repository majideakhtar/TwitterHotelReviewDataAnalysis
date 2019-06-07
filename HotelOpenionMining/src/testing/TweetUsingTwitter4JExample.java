/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author comp
 */
import twitter4j.*;
   import twitter4j.auth.AccessToken;
 
   import java.io.IOException;
   import java.net.URL;
   import java.util.Arrays;
 
   class TweetUsingTwitter4JExample {
 
     public static void main(String[] args) throws IOException, TwitterException {
 
        //Your Twitter App's Consumer Key
        String consumerKey = "h7rELC2CwdD4z32qHBeBfVmnr";
 
        //Your Twitter App's Consumer Secret
        String consumerSecret = "nN444NbyxBGKBKnehgeJA6VG1yfpfgvkFwFGHfHOsefGEnjlAd";
 
        //Your Twitter Access Token
        String accessToken = "879626211818782720-s4JJmnIbY9Mun8zCChmgLpg3GUlemXv";
 
        //Your Twitter Access Token Secret
        String accessTokenSecret = "scJcm8Ryi97rdgkgLX3RbMFKB00RNccuVDz9XQCXozSry";
 
        //Instantiate a re-usable and thread-safe factory
        TwitterFactory twitterFactory = new TwitterFactory();
 
        //Instantiate a new Twitter instance
        Twitter twitter = twitterFactory.getInstance();
 
        //setup OAuth Consumer Credentials
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
 
        //setup OAuth Access Token
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
 
        //Instantiate and initialize a new twitter status update
        StatusUpdate statusUpdate = new StatusUpdate(
                //your tweet or status message
                "Hello World - Java + Twitter API");
        //attach any media, if you want to
//        statusUpdate.setMedia(
//                //title of media
//                "http://simpledeveloper.com"
//                , new URL("https://si0.twimg.com/profile_images/1733613899/Published_Copy_Book.jpg").openStream());
// 
        //tweet or update status
        Status status = twitter.updateStatus(statusUpdate);
 
        //response from twitter server
        System.out.println("status.toString() = " + status.toString());
        System.out.println("status.getInReplyToScreenName() = " + status.getInReplyToScreenName());
        System.out.println("status.getSource() = " + status.getSource());
        System.out.println("status.getText() = " + status.getText());
        
        System.out.println("status.getURLEntities() = " + Arrays.toString(status.getURLEntities()));
        System.out.println("status.getUserMentionEntities() = " + Arrays.toString(status.getUserMentionEntities()));
    }
 
  }
 