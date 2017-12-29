package com.frinserService;


public class wowData {
private String link;
private int vote;
private String query;
private int time;

    public wowData() {
    	//do nothing
    }

	public void add(String link, int vote, String query, int time){
	  this.link = link;
	  this.vote = vote;
	  this.query = query;
	  this.time = time;
	}
	
	public String getLink() {
		return link;
	}

	public int getVote() {
		return vote;
	}
	
	public String getQuery() {
		return query;
	}
	
	public int getTime() {
		return time;
	}	
	
	@Override
	public String toString() {
	    return "Link: " + this.getLink() + 
	           ", Vote: " + this.getVote() +
	           ", Query: " + this.getQuery() + 
	           ", Time: " + this.getTime();
	}
}
