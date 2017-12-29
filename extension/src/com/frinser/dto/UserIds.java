package com.frinser.dto;

public class UserIds {

	String fb,gm,tw;

	public UserIds(String fb, String gm, String tw)
	{
		this.fb=fb;
		this.gm=gm;
		this.tw=tw;
	}
	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	public String getGm() {
		return gm;
	}

	public void setGm(String gm) {
		this.gm = gm;
	}

	public String getTw() {
		return tw;
	}

	public void setTw(String tw) {
		this.tw = tw;
	}
	public String toString()
	{
		return tw+"^"+gm+"^"+fb;
	}
}
