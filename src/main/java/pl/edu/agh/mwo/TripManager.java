package pl.edu.agh.mwo;

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

	public void removeTrip(Trip trip) {
		tripsList.remove(trip);
	}
}
