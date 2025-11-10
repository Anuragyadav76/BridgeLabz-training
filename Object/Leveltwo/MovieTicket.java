package Object.Leveltwo;


class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movie, int seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
        System.out.println("Ticket Booked Successfully!");
    }

    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("KGF 3", 15, 250.0);
        t.displayTicket();
    }
}

