package pl.edu.agh.mwo;

import java.awt.font.ImageGraphicAttribute;
import java.util.List;
import java.util.ArrayList;

public class Trip {
	private String tripName, description;
	private List<Photo> photosList;
	
	public Trip(String tripName) {
		this.photosList = new ArrayList<>();
		this.tripName = tripName;
	}
	
	public void addPhoto(Photo photo) {
		photosList.add(photo);
	}
	
	public List<Photo> getPhotos() {
		return photosList;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getTripName() {
		return tripName;
	}
}
