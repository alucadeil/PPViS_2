package sample;

public class Segment {

    private Inspector inspector = new Inspector();
    private Passenger passenger;
    private Station startStation;
    private Station endStation;

    public int check() {

        int check_result = 0;
        return check_result;
    }
    public void add_passenger(Passenger p) {

    }
    public void delete_passenger(Passenger p) {

    }
    public void add_inspector(Inspector insp) {

    }
    public void delete_inspector(Inspector insp) {

    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Station getStartStation() {
        return startStation;
    }

    public void setStartStation(Station startStation) {
        this.startStation = startStation;
    }

    public Station getEndStation() {
        return endStation;
    }

    public void setEndStation(Station endStation) {
        this.endStation = endStation;
    }
}
