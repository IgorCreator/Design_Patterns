package com.prog.pattern.example.correct.impl.v4.twitter;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());
		
		System.out.println(service.getTimeline("show_time"));
		service.postToTimeline("bh5k", "Some message that shouldn't go through.");
	}
}