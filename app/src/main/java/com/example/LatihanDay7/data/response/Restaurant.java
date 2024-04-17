package com.example.LatihanDay7.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Restaurant{

	@SerializedName("customerReviews")
	private List<CustomerReviewsItem> customerReviews;

	@SerializedName("pictureId")
	private String pictureId;

	@SerializedName("name")
	private String name;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	public List<CustomerReviewsItem> getCustomerReviews(){
		return customerReviews;
	}

	public String getPictureId(){
		return pictureId;
	}

	public String getName(){
		return name;
	}

	public Object getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}
}