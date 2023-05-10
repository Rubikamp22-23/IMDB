package com.example.imdb.retrofit.retrofitModels;

import com.google.gson.annotations.SerializedName;

public class ResponseDataMovieItem{

	@SerializedName("cast")
	private String cast;

	@SerializedName("Year")
	private String year;

	@SerializedName("rate")
	private String rate;

	@SerializedName("genres")
	private String genres;

	@SerializedName("name")
	private String name;

	@SerializedName("link")
	private String link;

	@SerializedName("about")
	private String about;

	public void setCast(String cast){
		this.cast = cast;
	}

	public String getCast(){
		return cast;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getRate(){
		return rate;
	}

	public void setGenres(String genres){
		this.genres = genres;
	}

	public String getGenres(){
		return genres;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setAbout(String about){
		this.about = about;
	}

	public String getAbout(){
		return about;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDataMovieItem{" + 
			"cast = '" + cast + '\'' + 
			",year = '" + year + '\'' + 
			",rate = '" + rate + '\'' + 
			",genres = '" + genres + '\'' + 
			",name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			",about = '" + about + '\'' + 
			"}";
		}
}