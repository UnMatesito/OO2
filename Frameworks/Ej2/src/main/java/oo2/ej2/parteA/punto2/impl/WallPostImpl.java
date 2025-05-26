package oo2.ej2.parteA.punto2.impl;

import java.util.logging.*;

public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;
	private Logger logger = Logger.getLogger(WallPostImpl.class.getName());

	public WallPostImpl() {
		this.text = "Undefined post";

	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		if (this.likes == 10){
			logger.log(Level.WARNING, "Ya hay 10 likes");
		}
	}

	@Override
	public void dislike() {
		if (likes > 0) {
			this.likes = this.likes - 1;
		} else if (likes == 0) {
			logger.log(Level.WARNING, "Ya no hay likes");
		}
	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
