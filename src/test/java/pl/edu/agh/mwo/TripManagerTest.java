package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testAddPhoto() {
		Trip trip = new Trip();
		trip.addPhoto(new Photo());
		assertEquals(trip.getPhotos().size(), 1);
	}
	
	@Test
	public void testGetComments() {
		Photo photo = new Photo();
		photo.addComment("This is the comment made for testing purposes.");
		assertEquals(photo.getComments().size(), 1);
	}
}
