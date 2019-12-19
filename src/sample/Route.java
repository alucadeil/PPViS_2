package sample;

public class Route {
    private int current_segmet = -1;
    private boolean active = false;
    private Segment segment;

    public void move() {

    }
    public void add_passengerToSegmet(Passenger p) {

    }
    public void delete_passengerToSegmet(Passenger p) {

    }
    public void add_inspectorToSegmet(Inspector p) {

    }
    public void delete_inspectorToSegmet(Inspector p) {

    }
    public int check_people() {

        int number = 0;
        return number;
    }

    public int getCurrent_segmet() {
        return current_segmet;
    }

    public void setCurrent_segmet(int current_segmet) {
        this.current_segmet = current_segmet;
    }
}
