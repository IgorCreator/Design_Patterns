package com.prog.pattern.example.correct.impl.v4.twitter;

public interface TwitterService {
    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String msg);
}