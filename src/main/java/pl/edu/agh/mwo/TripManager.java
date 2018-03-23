package pl.edu.agh.mwo;

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.List;

public class TripManager {
	private List<Trip> tripsList;

	public TripManager(){
		this.tripsList = new ArrayList<>();
	}

	public void addTrip(Trip trip) {
		tripsList.add(trip);
	}

	public List<Trip> getTrips() {
		return tripsList;
	}
}
