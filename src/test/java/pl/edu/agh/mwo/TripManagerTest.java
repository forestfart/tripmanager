package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testAddAndGetPhoto() {
		// Given
		Trip trip = new Trip("");

		// When
		trip.addPhoto(new Photo());

		// Then
		assertEquals(trip.getPhotos().size(), 1);
	}
	
	@Test
	public void testGetComments() {
		// Given
		Photo photo = new Photo();

		// When
		photo.addComment("This is the comment made for testing purposes.");

		// Then
		assertEquals(photo.getComments().size(), 1);
	}

	@Test
	public void testGetTripDescription() {
		// Given
		Trip trip = new Trip("Alps hike");
		String tripDescription = "This is a trip, test trip";

		// When
		trip.setDescription(tripDescription);

		// Then
		assertEquals(trip.getDescription(), tripDescription);
	}

	@Test
	public void testAddtrip() {
		// Given
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("");

		// When
		tripManager.addTrip(trip);

		// Then
		assertEquals(1, tripManager.getTrips().size());
	}
}
