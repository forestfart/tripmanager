package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;

public class Photo {
	private List<String> comments;
	
	public Photo(){
		this.comments = new ArrayList<>();
	}
	
	public void addComment(String comment){
		comments.add(comment);
	}
	
	public List<String> getComments() {
		return comments;
	}

}
