package scenarioBasedProblems;

abstract class TransportBooking {
    String passengerName;

    public TransportBooking(String name) {
        passengerName = name;
    }

    public abstract double calculateFare(double distance);

    public void bookTicket(double distance) {
        double fare = calculateFare(distance);
        System.out.println("Ticket booked for " + passengerName + ". Fare: " + fare);
    }
}

class BusBooking extends TransportBooking {
    public BusBooking(String name) {
        super(name);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}

class TrainBooking extends TransportBooking {
    public TrainBooking(String name) {
        super(name);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 3; 
    }
}

class FlightBooking extends TransportBooking {
    public FlightBooking(String name) {
        super(name);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 15 + 500; 
    }
}

public class TransportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransportBooking bus = new BusBooking("Charlie");
        bus.bookTicket(50);

        System.out.println();

        TransportBooking train = new TrainBooking("David");
        train.bookTicket(100);

        System.out.println();

        TransportBooking flight = new FlightBooking("Eva");
        flight.bookTicket(200);
	}

}
