package sample;

public class Station {
    private String name;

    private Passenger passenger;
    private Route route = new Route();

    public void add_passenger(Passenger p) {

    }
    public void delete_passenger(Passenger p) {

    }
    public void add_route(Route r) {

    }

    public void delete_route(Route r) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
