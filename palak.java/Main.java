class RailwayReservation {
    int tickets = 2;

    synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + ": Ticket booked successfully");
            tickets--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class Passenger extends Thread {
    RailwayReservation r;
    String name;

    Passenger(RailwayReservation r, String name) {
        this.r = r;
        this.name = name;
    }

    public void run() {
        r.bookTicket(name);
    }
}

class Main {
    public static void main(String[] args) {
        RailwayReservation r = new RailwayReservation();

        Passenger p1 = new Passenger(r, "User1");
        Passenger p2 = new Passenger(r, "User2");
        Passenger p3 = new Passenger(r, "User3");

        p1.start();
        p2.start();
        p3.start();
    }
}