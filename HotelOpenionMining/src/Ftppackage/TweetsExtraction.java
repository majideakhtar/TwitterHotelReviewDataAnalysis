/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ftppackage;
import java.util.*;
import twitter4j.*;
import twitter4j.conf.*;
/**
 *
 * @author comp
 */
public class TweetsExtraction {
    public static void main(String[] args) {
      ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setOAuthConsumerKey("9HlhJMVYEDvAlvyx8mT0XSzKU");
    cb.setOAuthConsumerSecret("oQfoiEYr3IQK6kLz81ia2uNWMaxBe0COSzslVj2d6FgJZLELcx");
    cb.setOAuthAccessToken("889773856927358976-AB3KlVTGEq9qfvRcEK693qonCPI9ghG");
    cb.setOAuthAccessTokenSecret("ph0umPARwH9QuJuoNAT6636XXQniEePRnKW9TqbIvNXpL");

    Twitter twitter = new TwitterFactory(cb.build()).getInstance();

    int pageno = 1;
    String user = "cnn";
    List statuses = new ArrayList();

    while (true) {

      try {

        int size = statuses.size(); 
        Paging page = new Paging(pageno++, 100);
        statuses.addAll(twitter.getUserTimeline(user, page));
        if (statuses.size() == size)
          break;
      }
      catch(TwitterException e) {

        e.printStackTrace();
      }
    }

    System.out.println("Total: "+statuses.size());
}  
    }

