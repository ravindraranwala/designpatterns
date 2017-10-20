package com.pluralsight.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

		System.out.println(service.getTimeline("pamelageller"));

		service.postToTimeline("bh5k", "Some message that shouldn't go through.");
	}
}
