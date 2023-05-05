package com.coderscampus.joshfAssignment10.spoonacular.dto;

public class Meals {
	private Integer id;
	private String imageType;
	private String title;
	private Integer readyInMinutes;
	private Integer servinges;
	private String sourceurl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServinges() {
		return servinges;
	}
	public void setServinges(Integer servinges) {
		this.servinges = servinges;
	}
	public String getSourceurl() {
		return sourceurl;
	}
	public void setSourceurl(String sourceurl) {
		this.sourceurl = sourceurl;
	}
	
	
}
