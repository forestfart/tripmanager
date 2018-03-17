package pl.edu.agh.mwo;

import java.util.List;
import java.util.ArrayList;

public class Trip {
	private List<Photo> photosList;
	
	public Trip() {
		this.photosList = new ArrayList<>();
	}
	
	public void addPhoto(Photo photo) {
		photosList.add(photo);
	}
	
	public List<Photo> getPhotos() {
		return photosList;
	}
}
