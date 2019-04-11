package pl.coderslab;

public class Flight {

    Airport departure;
    Airport arrival;
    String arrivalTime;
    double price;

    public Flight(Airport departure, Airport arrival, String arrivalTime, double price) {
        this.departure = departure;
        this.arrival = arrival;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
