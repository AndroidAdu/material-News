package com.mindimps.base.model;

import java.io.Serializable;

public  class Badges implements Serializable {
	private int view_count;
	private int comment_count;
	private int praise_count;
	private int watch_count;
	private int collect_count;
	private int share_count;
	private int order_count;
	private int user_post_count;
	private int user_watch_count;
	private boolean collected;
	private boolean praised;
	private boolean signed;
	private boolean watched;
	private boolean shared;

	public int getView_count() {
		return view_count;
	}

	public void setView_count(int view_count) {
		this.view_count = view_count;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getPraise_count() {
		return praise_count;
	}

	public void setPraise_count(int praise_count) {
		this.praise_count = praise_count;
	}

	public int getWatch_count() {
		return watch_count;
	}

	public void setWatch_count(int watch_count) {
		this.watch_count = watch_count;
	}

	public int getCollect_count() {
		return collect_count;
	}

	public void setCollect_count(int collect_count) {
		this.collect_count = collect_count;
	}

	public int getShare_count() {
		return share_count;
	}

	public void setShare_count(int share_count) {
		this.share_count = share_count;
	}

	public int getOrder_count() {
		return order_count;
	}

	public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}

	public int getUser_post_count() {
		return user_post_count;
	}

	public void setUser_post_count(int user_post_count) {
		this.user_post_count = user_post_count;
	}

	public int getUser_watch_count() {
		return user_watch_count;
	}

	public void setUser_watch_count(int user_watch_count) {
		this.user_watch_count = user_watch_count;
	}

	public boolean isCollected() {
		return collected;
	}

	public void setCollected(boolean collected) {
		this.collected = collected;
	}

	public boolean isPraised() {
		return praised;
	}

	public void setPraised(boolean praised) {
		this.praised = praised;
	}

	public boolean isSigned() {
		return signed;
	}

	public void setSigned(boolean signed) {
		this.signed = signed;
	}

	public boolean isWatched() {
		return watched;
	}

	public void setWatched(boolean watched) {
		this.watched = watched;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}
}
