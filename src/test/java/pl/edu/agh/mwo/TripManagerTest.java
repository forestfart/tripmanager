package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

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
	public void testAddTrip() {
		// Given
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("");

		// When
		tripManager.addTrip(trip);

		// Then
		assertEquals(1, tripManager.getTrips().size());
	}

	@Test
	public void testRemoveTrip() {
		// Given
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("");
		tripManager.addTrip(trip);

		// When
		tripManager.removeTrip(trip);

		// Then
		assertEquals(0, tripManager.getTrips().size());
	}

	@Test
	public void testFindTrip() {
		// Given
		TripManager tripManager = new TripManager();
		Trip trip1 = new Trip("Trip A");
		Trip trip2 = new Trip("Trip A");
		Trip trip3 = new Trip("Trip B");
		tripManager.addTrip(trip1);
		tripManager.addTrip(trip2);
		tripManager.addTrip(trip3);

		// When
		List<Trip> fetchedTripsList = tripManager.findTrip("Trip A");

		// Then
		assertEquals(2, fetchedTripsList.size());
	}
}
