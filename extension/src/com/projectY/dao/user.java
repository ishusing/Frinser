package com.projectY.dao;

public class user {
	String id, fb_user_name,gm_user_name,tw_user_name,fb_name,tw_name,gm_name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFb_user_name() {
		return fb_user_name;
	}

	public void setFb_user_name(String fb_user_name) {
		this.fb_user_name = fb_user_name;
	}

	public String getGm_user_name() {
		return gm_user_name;
	}

	public void setGm_user_name(String gm_user_name) {
		this.gm_user_name = gm_user_name;
	}

	public String getTw_user_name() {
		return tw_user_name;
	}

	public void setTw_user_name(String tw_user_name) {
		this.tw_user_name = tw_user_name;
	}

	public String getFb_name() {
		return fb_name;
	}

	public void setFb_name(String fb_name) {
		this.fb_name = fb_name;
	}

	public String getTw_name() {
		return tw_name;
	}

	public void setTw_name(String tw_name) {
		this.tw_name = tw_name;
	}

	public String getGm_name() {
		return gm_name;
	}

	public void setGm_name(String gm_name) {
		this.gm_name = gm_name;
	}
	public String toString() {
		return fb_user_name+" "+gm_user_name+" "+tw_user_name+" ";
	}
	public String getString(String method ) {
		if(method.equals("id"))
			return id;
		if(method.equals("fb_user_name"))
			return fb_user_name;
		if(method.equals("gm_user_name"))
			return gm_user_name;
		if(method.equals("tw_user_name"))
			return tw_user_name;
		
		return null;
	}
	
}
