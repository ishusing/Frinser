package com.frinser.dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TimeSpent {
	int id,time,vote;
	String link,userid,query;
	public static ArrayList<TimeSpent> constructTimeSpentArray(ResultSet rs) throws SQLException
	{
		ArrayList<TimeSpent> ts = new ArrayList<TimeSpent>();
		
		while (rs.next()) {
			TimeSpent temp = new TimeSpent();
			setId(temp, rs.getInt(1));
			setLink(temp, rs.getString(2));
			setUserId(temp, rs.getString(3));
			setQuery(temp, rs.getString(4));
			setTime(temp, rs.getInt(5));
			ts.add(temp);
		}
		
		return ts;
	}
	public int getId () {
		return this.id;
	}
	public static void setId(TimeSpent ts, int id) {
		ts.id = id;
		return;
	}
	public int getTime () {
		return this.time;
	}
	public static void setTime(TimeSpent ts, int time) {
		ts.time = time;
		return;
	}
	public int getVote () {
		return this.vote;
	}
	public static void setVote(TimeSpent ts, int vote) {
		ts.vote = vote;
		return;
	}
	public String getLink () {
		return this.link;
	}
	public static void setLink(TimeSpent ts, String link) {
		ts.link = link;
		return;
	}
	public String getQuery () {
		return this.query;
	}
	public static void setQuery(TimeSpent ts, String query) {
		ts.query = query;
		return;
	}
	public String getUserId () {
		return this.userid;
	}
	public static void setUserId(TimeSpent ts, String userid) {
		ts.userid = userid;
		return;
	}
}
