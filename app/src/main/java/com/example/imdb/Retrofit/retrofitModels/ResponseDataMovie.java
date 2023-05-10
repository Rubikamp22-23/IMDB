package com.example.imdb.retrofit.retrofitModels;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseDataMovie{

	@SerializedName("ResponseDataMovie")
	private List<ResponseDataMovieItem> responseDataMovie;

	public void setResponseDataMovie(List<ResponseDataMovieItem> responseDataMovie){
		this.responseDataMovie = responseDataMovie;
	}

	public List<ResponseDataMovieItem> getResponseDataMovie(){
		return responseDataMovie;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDataMovie{" + 
			"responseDataMovie = '" + responseDataMovie + '\'' + 
			"}";
		}
}